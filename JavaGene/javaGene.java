import java.util.Scanner;

public class javaGene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos genes?");
        int number = scanner.nextInt();  // Lê o número de genes
        scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

        // Agora o array genes é do tipo String[], já que estamos lidando com genes como strings
        String[] genes = new String[number];

        // Lê os genes
        System.out.println("Informe os genes:");
        for (int i = 0; i < number; i++) {
            genes[i] = scanner.nextLine();  // Lê uma string para cada posição do array
        }

        

        int contador = 0;
        for(int j = 0; j < number; j++){
            for (int i = 0; i < number; i++) {
                if (genes[i].equals(genes[j])) {  
                    contador++;
                    
                    
                }
            }
        }

        // Decide a saída com base na contagem
        if (contador > 1) {
            System.out.print("Achei o danado!");
           
        } else if (contador == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }

        scanner.close();
    }
}
