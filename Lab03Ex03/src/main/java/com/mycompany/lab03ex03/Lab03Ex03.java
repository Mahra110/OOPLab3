package com.mycompany.lab03ex03;
import java.util.Scanner;
public class Lab03Ex03 {
    static Scanner sc=new Scanner(System.in);
public static void inputMatrix(int[][] matrix,String name)
{
    System.out.println("Enter values for "+name+" 3x3 Matrix");
    for (int i=0;i<3;i++)
    {
        for (int j=0;j<3;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
    }
}
public static int[][] matrixMultiplication(int[][] matrix1,int[][] matrix2)
{
    int[][] result=new int[3][3];
   for (int i=0;i<3;i++)
   {
      for (int j=0;j<3;j++)
      {
          for (int k=0;k<3;k++){
              result[i][j]+=matrix1[i][k]*matrix2[k][j];
          }
      }
}return result;  }

public static int[][] matrixPower(int[][] matrix,int power)
{
    int[][] result=matrix;
    for (int i=1;i<power;i++)
    {
        result=matrixMultiplication(result,matrix);
    }
    return result;
}
public static int[][] matrixSum(int[][] matrix1,int[][] matrix2)
{ int result[][]=new int[3][3];
for (int i=0;i<3;i++)
{
    for (int j=0;j<3;j++)
    {
        result[i][j]=matrix1[i][j]+ matrix2[i][j];
    }
} return result;
}
public static int[][] matrixSub(int[][] matrix1,int[][] matrix2)
{ int result[][]=new int[3][3];
for (int i=0;i<3;i++)
{
    for (int j=0;j<3;j++)
    {
        result[i][j]=matrix1[i][j] - matrix2[i][j];
    }
} return result;
}
public static int[][] subScalar(int[][] matrix,int scalar)
{ int result[][]=new int[3][3];
for (int i=0;i<3;i++)
{
    for (int j=0;j<3;j++)
    {
        result[i][j]=matrix[i][j]-scalar;
    }
} return result;
}
public static void printMatrix(int[][] matrix,String name)
{System.out.println(name+": ");
 for (int i=0;i<3;i++)
    { for (int j=0;j<3;j++)
    { System.out.print(matrix[i][j]+" ");} 
      System.out.println(); }}


public static void main(String[] args) {
        int[][] matrix1=new int[3][3];
        int[][] matrix2=new int[3][3];
        inputMatrix(matrix1,"Mat_1");
        inputMatrix(matrix2,"Mat_2");
        
        //Equation 1 = (Mat_1^3)+(Mat_2^2)
        int[][] matrixCube=matrixPower(matrix1,3);
        int[][] matrixSquare=matrixPower(matrix2,2);
        int[][] resultOfEq1=matrixSum(matrixCube,matrixSquare);
        printMatrix(resultOfEq1,"(Mat_1^3)+(Mat_2^2)");
        
        //Equation 2 = (Mat_2-3)^2
        int[][] matrix2_subtract3=subScalar(matrix2,3);
        int[][] resultOfEq2=matrixPower(matrix2_subtract3,2);
        printMatrix(resultOfEq2,"(Mat_2-3)^2");
        
         //Equation 3= (Mat_2^5)-(Mat_1-2)
        int[][] matrix2power5=matrixPower(matrix2,5);
        int[][] matrix1_subtract2=subScalar(matrix1,2);
        int[][] resultOfEq3=matrixSub(matrix2power5,matrix1_subtract2);
        printMatrix(resultOfEq3,"(Mat_2^5)-(Mat_1-2)");
    }
}
