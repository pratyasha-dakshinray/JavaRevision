import java.util.Scanner;
//9. Write a program to find sum of all natural numbers between 1 to n
public class SumAllNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
}
