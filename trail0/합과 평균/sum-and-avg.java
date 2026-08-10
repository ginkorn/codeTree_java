import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       double average = 0;
       int sum = 0;

       sum = a+b;
       average = (double)sum / 2;



        System.out.printf(sum+" "+"%.1f",(double)average);
    }
}