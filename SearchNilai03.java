public class SearchNilai03 {
    public static void main(String[] args) {
        int[] arrayNilai = { 97, 96, 90, 70, 60, 98, 70, 10 };
        int key = 90, hasil = 0;
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