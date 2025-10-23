package PilhaFila;

public class Fila {
    private Pessoa[] elementos;
    private int tamanho;
    private int capacidade;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.tamanho = 0;
    }

    public void enqueue(Pessoa elemento) {//enfileirar 
        if(tamanho == capacidade){
            System.out.println("A fila está cheia! Não foi possível adicionar a pessoa: " + elemento.getNome());
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
        System.out.print("\n A pessoa: " + elemento.getNome() + " foi adicionada no final da fila ");
    }
    public Pessoa dequeue(){//desenfileirar
        if(isEmpty()){
            System.out.println("A fila está vazia!");
            return null;
        }
        Pessoa p =elementos[0];
        //desloca todos para frente
        for(int i=0; i < tamanho -1; i++){
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        System.out.print(" A pessoa: " + p.getNome() + " foi removida do inicio da fila ");
        return p;
    }
    public Pessoa front() {// ver quem está na frente
        if(isEmpty()) { 
            System.out.println("A fila está vazia!");
            return null;
        }
        return elementos[0];
    }

    public Pessoa getElemento(int i) {
        if(i >= 0 && i < tamanho){
            return elementos[i];
        }else {
            return null;
        }
    }    
    public boolean isEmpty() { 
        return tamanho == 0;
    }
    public int tamanho() {
        return tamanho;
    }
    public static void imprimirFila(Fila fila){
        for(int i=0;i<fila.tamanho();i++){
            System.out.println(fila.getElemento(i));
    }
    }

   
}