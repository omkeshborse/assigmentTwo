/* Java i/o - reading inputs

    in Java */

import java.util.Scanner;

public class assigementTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Input name, roll number and field of interest from user and print in the
         * format below :
         * Name: xyz, Roll number: xyz, Field of interest: xyz
         */

        /*
         * System.out.println("enter your roll no  ");
         * int rollNo = sc.nextInt() ;
         * sc.nextLine() ;
         * System.out.println("enter your name ");
         * String name = sc.nextLine() ;
         * sc.nextLine() ;
         * System.out.println("enter your filed of interest ");
         * String filed = sc.nextLine() ;
         * System.out.println("name : "+ name + "roll no : " + rollNo +
         * "Field of interest :" + filed );
         */

        /*
         * - Input two different string and print them in same line.
         * Input :
         * Level
         * Up
         */

        /*
         * String first = sc.next();
         * String second = sc.next();
         * System.out.println(first + second);
         * 
         * 
         * 
         */

        /*
         * If the marks of Robert in three subjects are entered through keyboard (each
         * out of
         * 100), write a program to calculate his total marks and percentage marks.
         */
        /*
         * int subjects1 = sc.nextInt();
         * int subjects2 = sc.nextInt();
         * int subjects3 = sc.nextInt();
         * 
         * int total = (subjects1 + subjects2 + subjects3);
         * 
         * float percentage = ((total * 100) / 300);
         * 
         * System.out.println("Robert percentage" + percentage);
         */

        /*
         * - Given two numbers, return their sum in the following format:
         * Int t representing number of test cases
         * T lines of Two integers representing the numbers to be added
         */
       /*  int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1 + number2); */

    

        /*
         * Q5 - Given few lines of input(number of lines unknown) where each line has
         * two
         * strings, concatenate the strings.
         */
        while(sc.hasNextLine()){

       
         String inpuStringOne = sc.next() ;
         String inpuStringTwo = sc.next() ;
 
         System.out.println(inpuStringOne+inpuStringTwo);
    
        }

      
    }
}
