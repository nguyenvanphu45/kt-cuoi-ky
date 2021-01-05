package kt;

import java.util.Scanner;

public class cau10 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();

        int[] A = new int[n];

        //Nhap gia tri vao mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }

        //Hien thi gia tri cua mang
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        //dem trong mang co bao nhieu gia tri chia het cho 5 ma khong chia het cho 6
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0){
                dem++;
            }
        }
        System.out.println("Co " + dem + " gia tri chia het cho 5 ma khong chia het cho 6.");

        //dem trong mang co gia tri le
        int dem1 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0){
                dem1++;
            }
        }
        System.out.println("Co " + dem1 + " gia tri le trong mang.");

        //dem xem gia tri lon hon hoac bang gia tri trung binh trong mang
        float tb = 0;
        for (int i = 0; i < n; i++) {
            tb += A[i];
        }
        tb /= n;
        System.out.println("Gia tri trung binh trong mang la: " + tb);
        int dem2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= tb){
                dem2++;
            }
        }
        System.out.println("Co " + dem2 + " gia tri lon hon hoac bang " +
                "gia tri trung binh trong mang.");

        //tach gia tri le trong mang
        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();
        int le[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 != 0){
                le[c] = A[i];
                c++;
            }
        }
        System.out.println("Cac phan tu le sau khi tach ra mang khac la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(le[i] + "\t");
        }

        //kiem tra xem trong mang co phan tu nao xuat hien lap lai khong
        int mid[] = new int[n];
        boolean find;
        int count = 0;
        int dem3 = 0;
        mid[0] = A[0];
        count++;
        for (int i = 0; i < n; i++) {
            find = false;
            for (int j = 0; j < count; j++) {
                if (mid[j] == A[i]){
                    find = true;
                    dem3++;
                }
            }
        }
        System.out.println();
        System.out.println("Co " + dem3 + " gia tri lap lai trong mang.");
    }
}
