package testInputJava;

import java.io.IOException;
import java.util.Scanner;

public class TestInputJavaScan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scan.nextInt();
        System.out.println("Enter a String");
        //If we use one more call of nextLine() method
        // between nextXXX() and nextLine(),
        // then this problem will not occur because
        // nextLine() will consume the newline character.
        scan.nextLine(); // if this line was removed we have a problem
        String b = scan.nextLine();
        System.out.println("You have entered:- " + a + " " + "and name as " + b);


    }
}
