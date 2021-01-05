package kt;

import java.util.Scanner;

public class cau8 {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }


    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();

        System.out.println("Uoc so chung lon nhat cua 2 so a va b la: " + USCLN(a, b));
    }
}
