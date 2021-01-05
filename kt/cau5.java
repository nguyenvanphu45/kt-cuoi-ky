package kt;

import java.util.Scanner;

public class cau5 {
    public static void main(String[] args){
        int n;
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        n = sc.nextInt();

        for (int i = 2; i <= n/2; i++) {
            temp = n % i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(n + " la so nguyen to!");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
}
