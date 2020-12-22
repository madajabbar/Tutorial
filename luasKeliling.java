import java.util.Scanner;

public class luasKeliling {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("1. Persegi Panjang ");
        System.out.println("2. Segitiga Siku-Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan pilihan anda : ");
        int menu = masuk.nextInt();
        double keliling,luas;
        if (menu==1){


            System.out.println("Panjang = ");
            int panjang=masuk.nextInt();
            System.out.println("Lebar   = ");
            int lebar=masuk.nextInt();
            keliling=2*(panjang+lebar);
            luas=panjang*lebar;
            System.out.println("Luas Persegi Panjang = "+luas);
            System.out.println("Keliling Persegi Panjang = "+keliling);
        }
        else if(menu==2){



            System.out.println("Alas   = ");
            int alas=masuk.nextInt();
            System.out.println("tinggi = ");
            int tinggi=masuk.nextInt();
            System.out.println("Sisi Miring = ");
            int siring=masuk.nextInt();
            keliling=alas+tinggi+siring;
            luas=alas*tinggi/2;
            System.out.println("Luas Segitiga = "+luas);
            System.out.println("Keliling Segitiga = "+keliling);
        }
        else if (menu==3){

            System.out.println("Masukan Jari-jari = ");
            double jari = masuk.nextInt();
            keliling=2*3.14*jari;
            luas=3.14*jari*jari;
            System.out.println("Luas Lingkaran = "+luas);
            System.out.println("Keliling Segitiga = "+keliling);
        }
    }
}
