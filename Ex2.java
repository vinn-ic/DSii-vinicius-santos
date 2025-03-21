import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            
            System.out.println("nota1::");
            int num1 = scanner.nextInt();
            
            System.out.println("nota2::");
            int num2 = scanner.nextInt();

            if(num1 > 10 || num1 < 0){
                System.out.println("valor da nota 1 invalido!");
                System.out.println("nota1::");
                num1 = scanner.nextInt();
            }
            if(num2 > 10 || num2 < 0){
                System.out.println("valor da nota 2 invalido!");
                System.out.println("nota2::");
                num2 = scanner.nextInt();

            }

            float media = (num1 + num2) / 2;
            System.out.println(media);
            
            System.out.println("que fazer outra conta? S/N");
            char quest = scanner.next().charAt(0);
            if(quest == 'S'){
                System.out.println("ok");
                loop = true;
            }else if(quest == 'N'){
                System.out.print("bye");
                loop = false;
            }
        }



        scanner.close();
    }
}