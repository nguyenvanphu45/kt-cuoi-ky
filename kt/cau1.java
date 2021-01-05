package kt;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] agrs){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so lon hon 2: ");
        n = sc.nextInt();

        if (n > 2){
            if (n % 2 == 0){
                System.out.println("Day la 1 so chan!");
            }else {
                System.out.println("Day la 1 so le!");
            }
        }else {
            System.out.println("Chuong trinh bi loi!!");
        }
    }
}
