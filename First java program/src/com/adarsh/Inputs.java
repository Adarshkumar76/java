package com.adarsh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        byte age = input.nextByte();
        System.out.println("Your Age is: " + age);
        System.out.println("Enter your Roll No: ");
        long rollNo = input.nextLong();
        System.out.println("Your Roll No is: " + rollNo);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Your Name is: " + name);

    }
}
