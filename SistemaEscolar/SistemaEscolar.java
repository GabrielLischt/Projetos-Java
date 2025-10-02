package SistemaEscolar;
import java.util.Scanner;
public class SistemaEscolar {
    public static void main(String[] args) {
        Aluno[] escola = new Aluno[3];
        Scanner leia = new Scanner(System.in);
        
        for(int i=0;i<escola.length;i++){
            escola[i]= new Aluno();

            System.out.print("Digite o nome do "+(i+1)+"º aluno: ");
            escola[i].nome= leia.next();
            System.out.print("Digite a matrícula do "+(i+1)+"º aluno: ");
            escola[i].matricula= leia.nextInt();
            System.out.print("Digite a nota final do "+(i+1)+"º aluno: ");
            escola[i].notaFinal= leia.nextDouble();
            System.out.println();
        } 
        System.out.println("\n---Escola---\n");
        for(int i=0;i<escola.length;i++){
            escola[i].mostrarDados(i+1);
            escola[i].verificarAprovacao();
        }
        leia.close();
    }
}