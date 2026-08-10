import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       int sum3 = 0;
       int average3 = 0;
       int PM = 0;

       sum3 = a+b+c;
       average3 = sum3 / 3;
       PM = sum3 - average3;


        System.out.println(sum3);
        System.out.println(average3);
        System.out.println(PM);
    }
}