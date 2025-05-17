import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("num::");
        int num = read.nextInt();

        for(int a=0;a<=10;a++){
            System.out.println(a*num);

        }


        read.close();
    }
}
