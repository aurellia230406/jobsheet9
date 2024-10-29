import java.util.Scanner;
public class ModifikasiPC41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

        int[] arrayNilai = new int[jumlahSiswa];
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            arrayNilai[i] = input.nextInt();
        }
        int key, hasil = 0;
        System.out.println("Berapa nilai yang dicari : ");
        key = input.nextInt();
        for (int i = 0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        System.out.println();
    }
}