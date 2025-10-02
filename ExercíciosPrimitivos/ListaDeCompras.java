package ExercíciosPrimitivos;
import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        String[] lista= new String[5];
        Scanner leia= new Scanner(System.in);

        for(int i=0; i<lista.length;i++){
            System.out.print("Digite o "+(i+1)+ "º item de supermercado:");
            lista[i] = leia.nextLine();
        }
        System.out.println();
        for(int i=0;i<lista.length;i++){
            System.out.println((i+1)+"º item da lista: " +lista[i]);
        }
        leia.close();
    }
} 

