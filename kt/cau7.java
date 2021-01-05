package kt;

import java.util.Scanner;

public class cau7 {
    public static void main (String[] args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x lon hon 3: ");
        x = sc.nextInt();
        System.out.println("Nhap y lon hon 3: ");
        y = sc.nextInt();

        System.out.println("Gia tri x vua nhap la: " + x);
        System.out.println("Gia tri y vua nhap la: " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("Gia tri x sau khi hoan vi la: " + x);
        System.out.println("Gia tri y sau khi hoan vi la: " + y);
    }
}
