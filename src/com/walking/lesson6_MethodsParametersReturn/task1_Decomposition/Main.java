package com.walking.lesson6_MethodsParametersReturn.task1_Decomposition;

import java.util.Scanner;

public class Main {
    // TODO: Декомпозировать задачу
    //  https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
    //  Вынести в отдельный метод использование switch-case.
    //  Также вынести в отдельный метод использование  System.out.println
    public static void main(String[] args) {

        answer(robot());

    }

    static void answer(String ask) {
        switch (ask) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are your doing");
            default -> System.out.println("Unknown message");
        }
    }

    static String robot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }
}
