//14. Write a program to find the value of one number raised to the power of another

import java.util.Scanner;

public class PowerofaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power you want to find - ");
        int power = sc.nextInt();
        System.out.println("Enter the base whose power you want to find - ");
        int base = sc.nextInt();
        int result = 1;

        for(int i = 1; i <= power; i ++){
            result = (base * result);
        }
        System.out.println(result);

    }
}