import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numRes = 1;
        System.out.println("num!::");
        int num = scanner.nextInt();

        for(int a=1;a <=num;a++){
            numRes *= a;
            System.out.println(numRes);
        }

        scanner.close();
    }    
}
