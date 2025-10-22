package Pilha;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", 25);
        Pessoa p2 = new Pessoa("Beatriz", 22);

        System.out.println("---PILHA DE PESSOAS---");
        Pilha pilha = new Pilha(2);
        pilha.pop();
        pilha.push(p1);
        pilha.push(p2);

        System.out.println("Olhando o topo com peek: " + pilha.peek().getNome());
        pilha.pop();
        pilha.pop();
        pilha.pop();
    }
    
}
