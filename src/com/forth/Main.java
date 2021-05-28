package com.forth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int status;
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        Student studentFour = new Student();
        Student studentFive = new Student();
        Student studentSix = new Student();
        Student studentSeven = new Student();
        Student studentEight = new Student();
        Student studentNine = new Student();
        Student studentTen = new Student();
        Student test = new Student();
        System.out.println("                           TechBee Solutions Academy                                     ");
        System.out.println("                           Instructor Deep Singh                                         ");
        System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");


        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select number or hit (5) to quit.");
        status = scan.nextInt();
        boolean on = true;
        while (on) {
        switch(status) {



            case 1:
                test.addStudent();
                System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                System.out.println("Please select number or hit (5) to quit.");
                status = scan.nextInt();
                break;
            case 2:
                test.removeStudent();
                System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                System.out.println("Please select number or hit (5) to quit.");
                status = scan.nextInt();
                break;
            case 3:
                test.updateStuInfo();
                System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                System.out.println("Please select number or hit (5) to quit.");
                status = scan.nextInt();
                break;
            case 4:
                test.listStudents();
                System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                System.out.println("Please select number or hit (5) to quit.");
                status = scan.nextInt();
                break;
            case 5:
                System.out.println("Goodbye.");
                quit();
                break;

            default:

        }
            }/*else{
                System.out.println("Goodbye.");
                quit();
            }*/
        }

    public static void quit() {
        System.exit(0);

    }

}
