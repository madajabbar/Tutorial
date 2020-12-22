import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        System.out.print("Masukan Nilai Suhu (derajat celcius) : ");
        int suhu = masuk.nextInt();
        if (suhu <= 0){
            System.out.println("Berdasarkan suhu yang diinputkan merupakan zat padat (beku)");
        }
        else if (suhu >= 100){
            System.out.println("Berdasarkan suhu yang diinputkan merupakan zat gas (uap)");
        }
        else{
            System.out.println("Berdasarkan suhu yang diinputkan merupakan zat cair");
        }
    }
}