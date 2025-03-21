import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("num::");
        int num = read.nextInt();

        if(num < 0){
            System.out.println("num tem que ser maior que 0");
            System.out.println("num::");
            num = read.nextInt();
        }else{   
            for(int a=0;a<num;a++){
                System.out.println(a);
            }
        }
        read.close();
    }
}
