
public class Ex11 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segunto = 1;
        int proximo;

        while (primeiro <= 500) {
            
            proximo = primeiro + segunto;

            primeiro = segunto;
            segunto = proximo;
            System.out.println(primeiro);

        }
    }
}
