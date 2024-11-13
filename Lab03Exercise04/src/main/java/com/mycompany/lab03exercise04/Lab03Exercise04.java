package com.mycompany.lab03exercise04;
import java.util.Scanner;
public class Lab03Exercise04 {
public int number;
    public int factorial(int num){
        if (num==0)
        {
            return 1;
        }
        else {
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Lab03Exercise04 obj=new Lab03Exercise04();
        System.out.println("Enter a number: ");
        obj.number=input.nextInt();
        if (obj.number>0){
        int fact=obj.factorial(obj.number);
        
        System.out.println("The product of all numbers from 1 to "+obj.number+" is: "+ fact);}
        else {
            System.out.println("Enter a positive number!");
        }
    }
}

