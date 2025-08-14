import java.util.Scanner;

public class Main{

    public static int conta(String calc){

        String[] part = calc.split(" ");
        int num1 = Integer.parseInt(part[0]);
        char op = part[1].charAt(0);
        int num2 = Integer.parseInt(part[2]);

        switch(op){
            case '+':
                return num1 + num2;
   

            case '-':
                return num1 - num2;


            case '*':
                return num1 * num2;


            case '/':
                return num1 / num2;
        }
        return 0;
    }

    public static double raiz(int num1){
        return Math.sqrt(num1);
    }
    public static String signo(int mes, int dia){
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        } else {
            return "Data inválida!";
        }
    }


    public static void main(String[] args){
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = calcular (+ | - | / | *)\n2 = calcular raiz\n3 = calcular signo zodiaco");
        int quest = scanner.nextInt();
        scanner.nextLine();

        if(quest == 1){
            System.out.println("EX(num1 + num2)>> ");
            String questC = scanner.nextLine();

            int res = conta(questC);

            System.out.println(res);
        }if(quest == 2){
            System.out.println(">>");
            int numRaiz = scanner.nextInt();
            double resRaiz = raiz(numRaiz);

            System.out.println(resRaiz);
        }if(quest == 3){
            System.out.println("dia de nascimento>>");
            int dia = scanner.nextInt();
            System.out.println("mes>>");
            int mes = scanner.nextInt();

            String sig = signo(mes, dia);
            System.out.println(sig);
        }

        
        scanner.close();
    } 
}