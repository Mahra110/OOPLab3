package com.mycompany.lab03exercise02;
import java.util.Scanner;

public class Lab03Exercise02 {
    public static int num1;
 public static int computeOddSum(int number){
 if (number<0)
 {return 0;}
 else { 
  return number+computeOddSum(number-2);} }
 public static int computeEvenSum(int number){
 if (number<0)
 {  return 0;}
 else { return number+computeEvenSum(number-2);}}
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Number to compute Sum: ");
        num1=sc.nextInt();
        if (num1%2==0){
        int sum1=computeEvenSum(num1-2);
        System.out.println("sum= "+sum1);}
        else{  int sum2=computeOddSum(num1-2);
        System.out.println("sum= "+sum2);   }   }}
