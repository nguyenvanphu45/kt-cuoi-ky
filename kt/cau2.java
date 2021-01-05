package kt;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args){
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau tien lon hon 2: ");
        a = sc.nextInt();
        System.out.println("Nhap so thu hai lon hon 2: ");
        b = sc.nextInt();
        System.out.println("Nhap so cuoi cung lon hon 2: ");
        c = sc.nextInt();

        if (a > 2 && b > 2 && c > 2){
            if (a > b && a > c){
                System.out.println("So lon nhat la: " + a);
            } else if(b > c && b > a){
                System.out.println("So lon nhat la: " + b);
            } else {
                System.out.println("So lon nhat la: " + c);
            }
        } else {
            System.out.println("Chuong trinh bi loi!!!");
        }
    }
}
