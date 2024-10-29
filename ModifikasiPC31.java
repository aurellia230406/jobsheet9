import java.util.Scanner;
public class ModifikasiPC31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        double total = 0, rataNilai;
        int siswaLulus = 0;
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > 70) {
                siswaLulus += 1;
            }
        }
        rataNilai = total / nilaiMahasiswa.length;
        System.out.println("Rata-Rata nilai Mahasiswa : " + rataNilai);
        System.out.println("Mahasiswa dengan nilai lebih dari 70 sebanyak: " + siswaLulus);

        input.close();
    }
}