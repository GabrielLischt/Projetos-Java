package TimeDeFutebol;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        TimedeFutebol realMadrid = new TimedeFutebol("Real Madrid",11);
        String nome, posicao;
        int tamanho = 11;
        Scanner leia = new Scanner(System.in);

            for(int i=0;i<tamanho;i++){
                System.out.print("Digite o nome do " + (i+1) + "º jogador: ");
                nome = leia.nextLine();
                System.out.print("Digite a posição do "+ (i+1) + "º jogador:");
                posicao = leia.nextLine();
                Jogador jogador = new Jogador(nome, posicao);
                realMadrid.contratarJogador(jogador);
            }
            System.out.println("--TITULARES--");
            realMadrid.exibirEscalacao();
            leia.close();
        }
    }
    

