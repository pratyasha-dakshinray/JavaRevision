package loop.forloop;

import java.util.Scanner;

//3. Write a program to print tables
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of whose table you want to print in:");
        int n = sc.nextInt();
        System.out.println("Your table is - ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
