package ru.ya.olganow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String stringThatShouldBeDisplayedInConcole = "ha-ha";
        System.out.println(stringThatShouldBeDisplayedInConcole);

        int a = 127;
        byte b = 126;
        double c = 33000.3;
        double d = 500000.5;
        int over = (int) (a + c);


        System.out.println(over);
        System.out.println(a + c);
        System.out.println(b / d);
        System.out.println(b - a);
    }
}