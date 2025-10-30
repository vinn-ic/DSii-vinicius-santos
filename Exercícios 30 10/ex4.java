import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("IPI (%): ");
        double ipi = s.nextDouble();

        System.out.print("Código peça 1: ");
        int cod1 = s.nextInt();
        System.out.print("Valor peça 1: ");
        double v1 = s.nextDouble();
        System.out.print("Qtd peça 1: ");
        int q1 = s.nextInt();

        System.out.print("Código peça 2: ");
        int cod2 = s.nextInt();
        System.out.print("Valor peça 2: ");
        double v2 = s.nextDouble();
        System.out.print("Qtd peça 2: ");
        int q2 = s.nextInt();

        double total = (v1 * q1 + v2 * q2) * (ipi/100 + 1);

        System.out.println("Valor total a pagar: " + total);
    }
}