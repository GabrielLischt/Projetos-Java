package Busca;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7};
        int busca =6;

        int posicao = Buscador.buscaBinaria(vetor,busca);
        if(posicao==-1){
            System.out.println("O número não está na lista");
        }else{
            System.out.println("O item buscado está na posição: "+ posicao + " e é o item: " + vetor[posicao]);
        }
    }
}
