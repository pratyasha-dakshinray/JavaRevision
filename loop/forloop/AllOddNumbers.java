//8. Write a program to print all odd number between 1 to 100
import java.util.Scanner;

public class AllOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        for(int on = 1; on <=num; on += 2 ){
            System.out.println(on);
        }
    }
}
