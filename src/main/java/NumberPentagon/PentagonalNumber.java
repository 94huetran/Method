package NumberPentagon;

import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so can chuyen thanh so Pentagon: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(getPentagonalNumber(i)+"\t");
        }
    }

    private static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
