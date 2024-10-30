package string;

public class myClass {

    static void noOfCharacters(String text) {
        System.out.println(text.length());
    }

    static void firstNineCharacters(String text) {
        System.out.println(text.substring(0,8));
    }

    static void ifEndsWithDay(String text) {
        if (text.substring(text.length()-4,text.length()) == "day!") {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    static void isNotEmpty(String text) {
        if (!text.isEmpty()) {
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }
    }

    static void lastOccurenceOfe(String text) {
        System.out.println(text.lastIndexOf("e"));
    }

    static void replace(String text) {
        System.out.println(text.replace(" ","-"));
    } 

    static void toUpper(String text) {
        System.out.println(text.toUpperCase());
    }
}
