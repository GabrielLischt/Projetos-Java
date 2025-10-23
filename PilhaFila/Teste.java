package PilhaFila;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", 25);
        Pessoa p2 = new Pessoa("Beatriz", 22);

        System.out.println("---PILHA DE PESSOAS---");
        Pilha pilha = new Pilha(2);
        pilha.pop();
        pilha.push(p1);
        pilha.push(p2);

        System.out.println("Olhando o topo com peek: " + pilha.peek().toString());
        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println("---FILA DE PESSOAS---");
        Fila fila = new Fila(2);
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);

        System.out.println("Olhando quem está na frente! " + fila.front().toString());
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
    }
    
}
