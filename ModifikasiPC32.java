import java.util.Scanner;
public class ModifikasiPC32 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahSiswa = 0;
            System.out.print("Masukkan jumlah siswa : ");
            if (input.hasNextInt()) {
                jumlahSiswa = input.nextInt();
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                return; // Keluar dari program jika input tidak valid
            }
            if (jumlahSiswa <= 0) {
                System.out.println("Jumlah siswa harus lebih dari nol.");
                return; // Keluar dari program jika jumlah siswa tidak valid
            }
            int[] nilaiMahasiswa = new int[jumlahSiswa];
            double total = 0, rataNilai;
            int siswalulus = 0;

            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                if (input.hasNextInt()) {
                    nilaiMahasiswa[i] = input.nextInt();
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    return; // Keluar dari program jika input tidak valid
                }
            }
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                total += nilaiMahasiswa[i];
                if (nilaiMahasiswa[i] > 70) {
                    siswalulus += 1;
                }
            }
            rataNilai = total / jumlahSiswa;
            System.out.println("Rata-rata nilai mahasiswa adalah : " + rataNilai);
            System.out.println("Jumlah mahasiswa yang lulus : " + siswalulus);
        }
    }
}