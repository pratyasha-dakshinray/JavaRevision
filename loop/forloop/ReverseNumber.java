package loop.forloop;

import java.util.Scanner;

//2. Write a program to print all natural numbers in reverse
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to reverse print in:");
        int n = sc.nextInt();
        for(int i = n; i > 0; i-- ){
            System.out.println(i);
        }

    }
}
