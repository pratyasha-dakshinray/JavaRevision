package loop.doWhile;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println( n + "*" + i + "=" + n * i);
            i++;
        }while(i <= 10);
    }
}
