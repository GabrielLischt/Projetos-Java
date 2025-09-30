import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[6];
        int maiorPontuacao=0;
        
        for(int i=0;i<num.length;i++){
            System.out.println("Insira a "+(i+1)+"ª pontuacao: ");
            num[i]=leia.nextInt();
            if(num[i]>maiorPontuacao){
                maiorPontuacao= num[i];
            }
        } 
        System.out.println("A maior pontuação registrada foi: "+maiorPontuacao);
        leia.close();
    }
}
