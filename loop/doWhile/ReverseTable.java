package loop.doWhile;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i = 10;
        do{
            System.out.println( n + "*" + i + "=" + n * i);
            i --;
        }while(i > 0);
    }
}
