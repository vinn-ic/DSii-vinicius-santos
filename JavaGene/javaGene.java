import java.util.Scanner;

public class javaGene{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero de genes>>");
        int n = scanner.nextInt();
        boolean ifachou = false;
        int geneDup=0;

        int arrayNum[] = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("gene>>");
            int geneInt = scanner.nextInt();
            arrayNum[i]=geneInt;
        }

        for(int j = 0; j< arrayNum.length;j++){
            for(int i = 0; i<arrayNum.length;i++){
                if(i != j && arrayNum[i] == arrayNum[j]){
                    ifachou = true;
                    geneDup = arrayNum[i];
                }
            }
        }
        if(ifachou){
            System.out.println("achei o danado: "+geneDup);
        }else if(!ifachou){

            System.out.println("sumiu");
        }
        scanner.close();

    }
}