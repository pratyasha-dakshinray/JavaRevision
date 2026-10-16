import java.util.Scanner;
//10. Write a program to find sum of all even numbers between 1 to n
public class SumOfAllEvenNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 2; i <=num; i += 2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}