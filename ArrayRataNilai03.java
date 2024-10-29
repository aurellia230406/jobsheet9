import java.util.Scanner;
public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahSiswa];
        double total = 0, rataNilai;
        int siswalulus = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa[i] = input.nextInt();
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
        input.close();
    }
}