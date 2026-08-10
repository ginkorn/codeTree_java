public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        double weight = 13;          // 추의 무게
        double moonRatio = 0.165;    // 달에서 중력의 비율

        double moonWeight = weight * moonRatio;

        System.out.printf("%.0f * %.6f = %.6f%n", weight, moonRatio, moonWeight);
    }
}