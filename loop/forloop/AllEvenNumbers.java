//7. Write a program to print all even numbers between 1 to 100
import java.util.Scanner;

public class AllEvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int ev = 2; ev <=num ; ev += 2  ){
            System.out.print( ev);
        }
    }
}