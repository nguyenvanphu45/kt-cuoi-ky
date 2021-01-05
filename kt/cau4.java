package kt;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args){
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextFloat();
        System.out.println("Nhap vao so b: ");
        b = sc.nextFloat();
        System.out.println("Nhap vao so c: ");
        c = sc.nextFloat();

        float delta = b * b - 4 * a * c;
        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem.");
        }else if(delta == 0){
            System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
        } else {
            System.out.println("X1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("X2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
