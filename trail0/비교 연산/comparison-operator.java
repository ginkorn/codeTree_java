import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a >= b) ? 1 : 0);   // A가 B보다 같거나 큰가?
        System.out.println((a > b) ? 1 : 0);    // A가 B보다 큰가?
        System.out.println((b >= a) ? 1 : 0);   // B가 A보다 같거나 큰가?
        System.out.println((b > a) ? 1 : 0);    // B가 A보다 큰가?
        System.out.println((a == b) ? 1 : 0);   // A와 B가 같은가?
        System.out.println((a != b) ? 1 : 0);   // A와 B가 다른가?
    }
}