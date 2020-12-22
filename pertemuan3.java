import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan batas data : ");
        int max = masuk.nextInt();
        int rata,jumlah=0;
        for (int awal=0;awal<=max;awal++){

            System.out.print("Data ke "+awal+" : ");
            int masukan=masuk.nextInt();
            jumlah+=masukan;
        }
        System.out.println("JUMLAH = "+jumlah);
        System.out.println("Rata-rata = "+(jumlah/max));
    }
}
