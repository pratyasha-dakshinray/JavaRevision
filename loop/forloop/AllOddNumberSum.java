//11. Write a program to find sum of all odd numbers between 1 to n
import java.util.Scanner;

public class AllOddNumberSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i+=2){
            sum = i + sum;
        }
        System.out.println(sum);
    }
}