package com.mycompany.lab03exercise01;
import java.util.Scanner;

public class Lab03Exercise01 {
static String pNumber;
static String pComplain;
static String pName;
static int pAge;
static String pEmail;
static String pContact;
static double pBill;
 public static void Take_Patient_data(){
     System.out.println("---------------Patient's Info---------");
 Scanner sc=new Scanner(System.in);
     System.out.println("Enter Patient Number: ");
     pNumber=sc.nextLine();
     System.out.println("Enter Patient Name: ");
      pName=sc.nextLine();
     System.out.println("Enter Patient Complain: ");
      pComplain=sc.nextLine();
     System.out.println("Enter Patient Age: ");
       pAge=sc.nextInt();
       sc.nextLine();
     System.out.println("Enter Patient Email: ");
      pEmail=sc.nextLine();
     System.out.println("Enter Patient Contact: ");
      pContact=sc.nextLine();
     System.out.println("Enter Patient Bill: ");
      pBill=sc.nextDouble();
 }
 public static void Print_Receipt(){
         System.out.println("---------------Patient's Receipt---------");
     System.out.println("Patient Number: "+  pNumber);
   System.out.println("Patient Name: "+pName);
      System.out.println("Patient Complain: "+pComplain);
      System.out.println("Patient Age: "+pAge);
      System.out.println("Patient Email: "+  pEmail);
    System.out.println("Patient Contact: "+ pContact);
     System.out.println("Patient Bill: "+pBill);
      
 }
    public static void main(String[] args) {
       Take_Patient_data();
       Print_Receipt();
    }
}

