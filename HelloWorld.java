/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import java.util.Scanner;

/**
 *
 * @author MandeepManu
 */
public class HelloWorld {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String inputName = input.nextLine();
        System.out.print("Your name is ");
        System.out.println(inputName);
        System.out.printf("Hello, %s!!!\n", inputName);
        //printf allows us to customize how things get printed.
        //%s means print some string variable
        String yourName;  //defining variable named "yourName" of string datatype
        yourName = "Ramita";
        System.out.print("Hello, World!!!");   //prints the statement in one line
        System.out.println("Hello, World!!!"); //prints statement and send another statement to another line
        System.out.println("Hello, ");
        System.out.println("Mandeep!!!");
        System.out.print("Hello, ");
        System.out.println(yourName);   //calling a varibale
    }
    
}
