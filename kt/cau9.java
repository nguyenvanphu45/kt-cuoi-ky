package kt;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cau9 {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();

        int[] A = new int[n];

        //Nhap gia tri trong mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }

        //Hien thi gia tri trong mang
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println("\n");

        //dem trong mang co bao nhieu gia tri chi het cho 3 ma khong chia het cho 2
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 2 != 0){
                dem++;
            }
        }
        System.out.println("Co " + dem + " gia tri chia het cho 3 ma khong chia het cho 2.");

        //gia tri lon nhat trong mang
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (max < A[i]){
                A[i] = max;
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);

        //kiem tra gia tri co ton tai trong mang khong
        System.out.println("Nhap gia tri can kiem tra: ");
        int X = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == X){
                System.out.println("Gia tri " + X + " co ton tai trong mang.");
                break;
            }
            if (i == X){
                System.out.println("Gia tri " + X + " khong ton tai trong mang.");
                break;
            }
        }

        //dem phan tu co gia tri chan
        int dem1 = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 0){
                dem1++;
            }
        }
        System.out.println("Co " + dem1 + " gia tri chan trong mang.");

        //tach cac gia tri chan
        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();
        int chan[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                chan[c] = A[i];
                c++;
            }
        }
        System.out.println("Cac phan tu chan trong mang sau khi tach la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(chan[i] + "\t");
        }
    }
}
