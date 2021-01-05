package kt;

import java.util.Scanner;

public class cau3 {
    public static void main(String[] args){
        int a, b;
        double nghiem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so b: ");
        b = sc.nextInt();
        System.out.println("Phuong trinh vua nhap la: " + a + "x" + " + " + b + " = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            nghiem = (double) -b/a;
            System.out.println("phuong co nghiem x = " + nghiem);
        }
    }
}
