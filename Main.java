import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Aracınız km'de kaç kuruş yakıyor? (örn:0.25):");

        double kurus = input.nextDouble();

        System.out.println("Aracınızla kaç km gittiniz?");

        double km = input.nextDouble();

        double toplam = kurus * km;

        System.out.println("Toplam harcadığınız yakıt: " + toplam);


    }
}
