import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioMinimo = 788.00;

        System.out.print("Seu salário: ");
        double salario = s.nextDouble();

        double quantidade = salario / salarioMinimo;

        System.out.println("Você ganha " + quantidade + " salários mínimos.");
    }
}