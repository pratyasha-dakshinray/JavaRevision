package loop.forloop;

import java.util.Scanner;

//1. Write a program to print all natural numbers from 1 to n
public class PrintNNumbers {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of terms you want to print in:");
       int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
           System.out.println(i);
       }

   }
}
