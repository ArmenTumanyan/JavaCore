package homeworks.homeworks8;

import java.util.Stack;

public class BraceChecker {

    private String text;
    public BraceChecker(String text) {
        this.text = text;
    }
    public void check() {
        Stack stck = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case '(':
                case '[':
                case '{':
                    stck.push(text.charAt(i));
                    break;
                case ')':
                    if (stck.pop() != "(") {
                        System.out.println("open ( but not exception");
                        return;
                    }
                    if (stck.pop() == "(") {
                    }
                    break;
                case ']':
                    if (stck.pop() != "[") {
                        System.out.println("open [ but not exception");
                        return ;
                    }
                    if (stck.pop() == "{") {
                    }
                    break;
                case '}':
                    if (stck.pop() != "{") {
                        System.out.println("open { but not exception");
                        return;
                    }
                    if (stck.pop() == "{") {
                    }
                    break;

            }
        }
    }
}

