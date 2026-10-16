package loop.forloop;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the table you want to reverse print in:");
        int n = sc.nextInt();

        for (int i = 10; i >0 ; i --){
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}
