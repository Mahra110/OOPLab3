package com.mycompany.lab03exercise05;

import java.util.Scanner;
public class Lab03Exercise05 {
public int num1,num2;
public int computeSum(int number1,int number2){
 if (number1== number2)
{
return 0;
}
else{
    return number2+computeSum(number1,number2+1);
}
}
    public static void main(String[] args) {
       Lab03Exercise05 obj=new  Lab03Exercise05();
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        obj.num1=sc.nextInt();
        System.out.println("Enter number 2: ");
         obj.num2=sc.nextInt();
         if (obj.num1>obj.num2)
         {  
        int sum=obj.num1+obj.computeSum(obj.num1,obj.num2);
             System.out.println("Answer: "+sum);
    }
         else {
             int sum=obj.num2+obj.computeSum(obj.num2,obj.num1);
              System.out.println("Answer: "+sum);
         }
}}
