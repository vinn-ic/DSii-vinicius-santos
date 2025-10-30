import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Saldo: ");
        double saldo = s.nextDouble();

        saldo = saldo * 1.01;
        System.out.println("Saldo com reajuste: " + saldo);
    }
}