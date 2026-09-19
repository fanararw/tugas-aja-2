public class Bilangan {
    public static void main(String[] args) {
        int X = 10;
        int Y = 20;
        int Z = X+Y*Y*X*8+10-20000/2;

        float hasil_tambah,hasil_kurang,hasil_kali,hasil_bagi,Hasil_Operasi_Kompleks;

        hasil_tambah = X + Y;
        hasil_kurang = X - Y;
        hasil_kali = X * Y;
        hasil_bagi = X / Y;
        Hasil_Operasi_Kompleks = Z;
        

        System.out.println("");
        System.out.println("Hasil Penjumlahan : " + hasil_tambah);
        System.out.println("Hasil Pengurangan : " + hasil_kurang);
        System.out.println("Hasil Perkalian : " + hasil_kali);
        System.out.println("Hasil Pembagian : " + hasil_bagi);
        System.out.println("Hasil Operasi Kompleks : " + Hasil_Operasi_Kompleks);
    }

}
   