import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        String[] lista= new String[5];
        Scanner leia= new Scanner(System.in);

        for(int i=1; i<=5;i++){
            System.out.println("Digite o "+i+" º item de supermercado:");
            lista[i] = leia.nextLine();
        }
        leia.close();

        for(int i=0;i<=lista.length;i++){
        System.out.println(lista[i]);
        }
    }
} 

