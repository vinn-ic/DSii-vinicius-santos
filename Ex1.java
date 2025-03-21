import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("num1::");
        int num1 = scan.nextInt(); 

        System.out.println("num1::");
        int num2 = scan.nextInt();

        while (num2 == 0){
            System.out.println("num2 != 0/digite outro::");
            num2 = scan.nextInt();
        }

        float media = num1 / num2;

        System.out.println(media);

        scan.close();
    }
    
}