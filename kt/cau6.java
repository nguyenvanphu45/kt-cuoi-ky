package kt;

import java.util.Scanner;

public class cau6 {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        n = sc.nextInt();

        int temp = (int)Math.sqrt(n);
        if(temp * temp == n){
            System.out.println(n + " la 1 so chinh phuong.");
        }else{
            System.out.println(n + " khong phai la so chinh phuong.");
        }
    }
}
