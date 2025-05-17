import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Local lcS = new Local();
        Scanner read = new Scanner(System.in);

        while(true){
            System.out.println("\nadicionar carro = 1\nremover carro = 2\nver carros = 3\n");
            int q = read.nextInt();
            
            switch(q){
                case 1:
                lcS.adicionar();
                break;
                case 2:
                lcS.remover();
                break;
                
                case 3:
                lcS.show();
                break;
            }
        }
    }  
}
