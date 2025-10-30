import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = s.nextInt();
        System.out.print("Meses: ");
        int meses = s.nextInt();
        System.out.print("Dias: ");
        int dias = s.nextInt();

        int total = anos * 365 + meses * 30 + dias;
        System.out.println("Total em dias: " + total);
    }
}