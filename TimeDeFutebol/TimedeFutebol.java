package TimeDeFutebol;

public class TimedeFutebol {
    String nomeDoTime;
    Jogador[] jogador = new Jogador[11];
    int vagasOcupadas=0;
 
    public TimedeFutebol(String nomeDoTime, int vagasOcupadas){
        this.nomeDoTime = nomeDoTime;
        this.jogador = new Jogador[ vagasOcupadas];
    }
 
    public void contratarJogador(Jogador novoJogador){
        if(vagasOcupadas<jogador.length){
            jogador[vagasOcupadas] = novoJogador;
            vagasOcupadas++;
            System.out.println(novoJogador.nome + " contratado!");
        }else{
            System.out.println("Não há vagas disponíveis!");
        }
    }

    public void exibirEscalacao(){
        for(int i=0;i<vagasOcupadas;i++){
            System.out.println(jogador[i].nome + " - " +jogador[i].posicao);
        }
    }
    
}
