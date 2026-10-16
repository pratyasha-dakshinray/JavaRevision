package loop.doWhile;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        do{
            System.out.println(i);
            i --;
        }while(i > 0);
    }
}
