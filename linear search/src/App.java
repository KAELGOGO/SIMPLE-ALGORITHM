import java.util.*;

//linear search merupakan algoritma mencri input dengan cara melihat array 1 per 1 dari 0

public class App {

    public static void main(String[] args) throws Exception {
        // sebuah program pengecekan input sesuai / tidak dengan data
        // buat data dengan array
        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);

        // linear search versi scanner(looping lama)
        // System.out.print("massukkan angka yang anda cari : ");
        // int inp = sc.nextInt();
        // for (int i = 0; i < ar.length; i++) {
        // if (ar[i] == inp) {
        // System.out.println(ar[i]);
        // } else {
        // System.out.println("invalid");
        // }
        // }

        // linear search versi index(lopping cepat)
        int index = linearSearch(ar, 4);
        if (index == 1) {
            System.out.println("ditemukan");
        } else {
            System.out.println("tidak ditemukan");
        }

        // linearSearch(ar, 1);

    }

    // ini menggunakan
    // int yang
    // cukup flexibel

    public static int linearSearch(int ar[], int inp) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == inp) {
                return 1;
            }
        }
        return 0;
    }

    // ini mengunakan void tapi isi array tidak bisa jika ada 0
    // public static void linearSearch(int ar[], int inp) {
    // int temp = 'c';
    // for (int i = 0; i < ar.length; i++) {
    // if (ar[i] == inp) {
    // temp = inp;
    // }
    // }
    // if (temp != 0) {
    // System.out.println("input ditemukan");
    // } else {
    // System.out.println("input tidak ditemukan");
    // }
    // }

}
