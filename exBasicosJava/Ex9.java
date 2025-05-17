public class Ex9 {
    public static void main(String[] args) {
        float pais1 = 80000;//3
        float pais2 = 200000;//1.5
        int ano = 0;

            while (pais1 < pais2) {
                pais1 += (3.00f/100)*pais1;
                pais2 += (1.5f/100)*pais2;
                ano++;
                
            }
            System.out.println(pais1);
            System.out.println(pais2);
            System.out.println(ano);
    }
    
}
