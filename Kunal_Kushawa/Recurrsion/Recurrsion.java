// Recurrsion Function ---> n to 1 print

package Kunal_Kushawa.Recurrsion;

public class Recurrsion {
    public static void main(String[] args) {
        // recurrsion(20);
        recurrsionInc(10);
    }

    static void recurrsion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        recurrsion(n - 1);
    }

    static void recurrsionInc(int n) {
        if (n == 0) {
            return;
        }
        recurrsionInc(n - 1);
        System.out.println(n);
    }

    static void factorial(int n) {
        if (n == 0) {
            return;
        }

    }
}
