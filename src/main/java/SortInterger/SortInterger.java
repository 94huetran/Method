package SortInterger;

import java.util.Scanner;

public class SortInterger {
    public static void displaySortedNumbers(int num1, int num2, int num3) {
        int[] num = new int[]{num1, num2, num3};

        for (int i = 0; i < num.length-1; i++) {
            for (int j = num.length - 1; j >= 1; j--) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
        System.out.println("Thu tu theo chieu tang dan cua xo nguyen nhap vao: ");
        for (int i = 0; i < num.length; i++){
        System.out.print(num[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap so nguyen dau tien:");
        int num1 = scn.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        int num2 = scn.nextInt();
        System.out.println("Nhap so nguyen thu 3");
        int num3 = scn.nextInt();

        displaySortedNumbers(num1, num2, num3);
    }

}
