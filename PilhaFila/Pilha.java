package PilhaFila;

public class Pilha {
    private Pessoa[] elementos;
    private int topo;
    private int capacidade;
    
    public Pilha(int capacidade) { 
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;
    }
    public void push(Pessoa elemento){//adicionar um elemento na pilha
        if(topo == capacidade -1){
            System.out.println("A pilha está cheia! Não foi possível adicionar a pessoa: " + elemento.getNome());
            return;
        }
        topo++;
        elementos[topo] = elemento;
        System.out.println("A pessoa: " + elemento.getNome() + " entrou no ônibus!");
    }
    public Pessoa peek() {//observar quem está no topo da pilha
        if(isEmpty()){
            System.out.println("A pilha está vazia!");
            return null;
        }
        return elementos[topo];
    }
    public Pessoa pop() {//remover um item da pilha(sempre o primeiro elemento)
        if(isEmpty()){
            System.out.println("A pilha está vazia!");
            return null;
        }
        Pessoa p = elementos[topo];
        elementos[topo] = null;
        topo--;
        System.out.println("A pessoa " + p.getNome() + " sentou no banco do ônibus!");
        return p;
    }
    public boolean isEmpty() { 
        return topo == -1;
    }
    public int tamanho() { 
        return topo + 1;
    }
}
