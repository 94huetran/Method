package InterestBank;

import java.util.Scanner;

public class InterestInMonth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap so tien vay: ");
        double loans = scn.nextDouble();
        System.out.println("Nhap so thang vay: ");
        int month = scn.nextInt();
        System.out.println("Nhap lai suat vay :");
        double interest_rate = scn.nextDouble();
        System.out.println("Nhap bien do lai suat: ");
        double range = scn.nextDouble();

        System.out.println("so tien lai phai tra khi vay "+loans+"trong "+month+"thang la: "+calculateInterest(loans,month,range,interest_rate));
    }

    public static double calculateInterest(double loans, int month, double range, double interest_rate) {
        return (loans * ((interest_rate + range)/12))*month;
    }
}
