import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1:: ");
        int num1 = scanner.nextInt();
        System.out.print("num2:: ");
        int num2 = scanner.nextInt();
        System.out.print("num3:: ");
        int num3 = scanner.nextInt();
        
        if(num1 > 1000 || num1 < 0){
            System.out.println("só pode entre 0 e 1000");
            
        }else if(num2 > 1000 || num2 < 0){
            System.out.println("só pode entre 0 e 1000");
            
        }else if(num3 > 1000 || num3 < 0){
            System.out.println("só pode entre 0 e 1000");
        }else{

        System.out.println("menor: "+Math.min(num1, Math.min(num2, num3)));
        System.out.println("maior: "+Math.max(num1, Math.max(num2, num3)));
        System.out.println("soma: "+ (num1 + num2 + num3));
        scanner.close();
    }}
}
