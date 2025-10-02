import java.util.Scanner;
public class ListaDeCompras2 {
    public static void main(String[] args) {
        String[] item = new String[5];
        Scanner leia = new Scanner(System.in);

        for(int i=0;i<item.length;i++){
            System.out.print("Digite o "+(i+1)+ "º item:");
            item[i]= leia.nextLine();
        }
        System.out.println();
        for(int i=0;i<item.length;i++){
            System.out.println("O "+(i+1)+"º item é: " +item[i]);
        }
        leia.close();
    }   
}
