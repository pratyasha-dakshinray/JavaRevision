package loop.whileloop;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to reverse :");
        int n = input.nextInt();

        int i = 10;
        while (i > 0){
            System.out.println( n + "*" + i + "=" + n * i);
            i --;
        }
    }
}
