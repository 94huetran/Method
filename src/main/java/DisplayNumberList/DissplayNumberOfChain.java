package DisplayNumberList;

import java.util.Scanner;

public class DissplayNumberOfChain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s = scn.nextLine();
        System.out.println("Chuoi co so ky tu la: ");
        System.out.println(countLetters(s));
    }
    public static int countLetters(String s) {
      int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }return count;
    }
}
