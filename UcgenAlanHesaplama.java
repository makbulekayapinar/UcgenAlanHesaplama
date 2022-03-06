import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        double a, b, c, cevre, u, alan;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar Uzunluğunu Giriniz");
        a = input.nextDouble();

        System.out.println("2. Kenar Uzunluğunu Giriniz");
        b = input.nextDouble();

        System.out.println("3. Kenar Uzunluğunu Giriniz");
        c = input.nextDouble();

        cevre = a+b+c;
        u = cevre/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:" + alan);





    }


}
