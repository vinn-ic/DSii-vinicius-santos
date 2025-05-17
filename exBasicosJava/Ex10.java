public class Ex10 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segunto = 1;
        int proximo;

        for(int a=0;a<10;a++){
            proximo = primeiro + segunto;

            primeiro = segunto;
            segunto = proximo;
            System.out.println(primeiro);

        }
    }
}
