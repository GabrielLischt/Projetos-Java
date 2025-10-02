package SistemaEscolar;
public class Aluno {
    String nome;
    int matricula;
    double notaFinal;
    
    void verificarAprovacao(){
        if(notaFinal>=7.0){
            System.out.println();
            System.out.println(nome + " está aprovado!");
        }else{
            System.out.println();
            System.out.println(nome + " está reprovado!");
        }
    }

    void mostrarDados(int num){
        System.out.println();
        System.out.printf("Dados do %dº Aluno são:\nNome: %s \nMatricula: %d \nNota: %.2f\n",num, nome,matricula,notaFinal);
    }
}
