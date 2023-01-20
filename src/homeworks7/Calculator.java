package homeworks7;

public class Calculator {

    double plus(double a, double b) {
        double c = (a + b);
        return c;

    }

    double minus(double a, double b) {
        double c = (a - b);
        return c;
    }

    double divide(double a, double b) {
        double c = (a / b);
        if (b == 0) {
            System.out.println("թիվը 0-ի չի բաժանվում");
        }
        return c;
    }

    double multiply(double a, double b) {
        double c = (a * b);
        return c;

    }

}



