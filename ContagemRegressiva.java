import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
        int inicio;
        Scanner leia = new Scanner(System.in); 
        System.out.print("Digite um número: ");
        inicio = leia.nextInt();
        while(inicio>0){
            System.out.println(inicio);
            inicio--;
        }leia.close();
    }
    
}    

