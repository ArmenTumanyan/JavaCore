package homeworks.medicalCenter;

import com.sun.jdi.PathSearchingVirtualMachine;
import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.storage.PersonStorage;
import homeworks.medicalCenter.util.DateUtil;

import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatientByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname;email,phone,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setEmail(doctorData[3]);
            doctor.setPhone(doctorData[4]);
            doctor.setProfession(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("doctor added!");
        } else {
            System.out.println("Doctor with " + doctorId + "already exists");
        }
    }


    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            System.out.println("Please input id,name,surname,phone,registerDateTime(26-02-2023 14:00");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time, please choose another time");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again");
            }
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input,name,surname,email,phone,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setEmail(doctorData[2]);
            doctorById.setPhone(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            personStorage.add(doctorById);
            System.out.println("Doctor changed!");
        } else {
            System.out.println("Doctor with " + doctorId + "does not exists!");
        }
    }


    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Doctor with " + doctorId + "does not exists!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

}
