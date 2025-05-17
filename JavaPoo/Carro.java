import java.util.Scanner;
import java.util.ArrayList;

public class Carro{
    Scanner read = new Scanner(System.in);

    String marca;
    String modelo;
    String placa;

    
    public Carro(String marca, String modelo, String placa){//creat
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
    }

    @Override
    public String toString(){
        return String.format("marca: %s\nmodelo: %s\nplaca: %s", marca, modelo, placa);
    }

    public String compPlaca(){
        return String.format("%s", placa);
    }

}

class Local{

     ArrayList<Carro> carros = new ArrayList<>();

    public void show(){
        for(Carro c: carros){
            System.out.println(c.toString());
            System.out.println("_".repeat(20));
        }
        
    }
    
    public void adicionar(){
        Scanner readAdd = new Scanner(System.in);

        System.out.print("\nmarca>>");
        String marca = readAdd.nextLine();
        System.out.print("\nmodelo>>");
        String modelo = readAdd.nextLine();
        System.out.print("\nplaca>>");
        String placa = readAdd.nextLine();

        carros.add(new Carro(marca, modelo, placa));
        System.out.println("carro adicionado");

    }

    public void remover(){
        Scanner readRev = new Scanner(System.in);

        System.out.println("placa do carro");
        String placa = readRev.nextLine();
        try{

            for(Carro c : carros){
                if(c.compPlaca().equals(placa)){
                    carros.remove(c);
                }else{
                    System.out.println("placa não encontrada!");
                }
            }
        }catch(Exception e){
            System.out.printf("ERRO: %s", e);
        }
    }
}