import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = s.nextInt();

        System.out.println("Antecessor: " + (n - 1));
        System.out.println("Sucessor: " + (n + 1));
    }
}