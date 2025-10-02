package ExercíciosPrimitivos;
import java.util.Scanner;
public class CalculadoraDeMediaVetor {
    public static void main(String[] args) {
        double[] notas= new double[4];
        double media=0 ;
        Scanner leia = new Scanner(System.in);

        for(int i=0;i<notas.length;i++){
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i]= leia.nextDouble();
            media= media+  notas[i]/4;
        } 
       
        System.out.printf("A média final é %.2f", media);
        leia.close();
    }
}