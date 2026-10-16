package loop.whileloop;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int i = 1;
        while (num >= i){
            System.out.println(i);
            i ++;
        }

    }
}
