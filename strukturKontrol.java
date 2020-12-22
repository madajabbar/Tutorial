import java.util.Scanner;

public class strukturKontrol {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("MASUKAN NILAI ANDA : ");
        int nilai = masuk.nextInt();

        if (nilai==90){
            System.out.println("NILAI KAMU BAGUS");
        }
        else if(nilai >= 70){
            System.out.println("NILAI KAMU CUKUP");
        }
        else System.out.println("KAMU HARUS MENGULANG");
    }
}
