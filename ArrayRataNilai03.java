import java.util.Scanner;
public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        double total = 0, rataNilai;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        rataNilai = total / nilaiMahasiswa.length;
        System.out.println("Rata-Rata nilai Mahasiswa : " + rataNilai);
        input.close();
    }
}