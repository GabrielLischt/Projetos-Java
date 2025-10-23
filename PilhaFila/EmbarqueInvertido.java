package PilhaFila;

public class EmbarqueInvertido {
    public static void main(String[] args) {
        
        Fila filaPrincipal = new Fila(7);
        Pilha onibus = new Pilha(4);
        
        Pessoa p1 = new Pessoa("Gabriel",25);
        Pessoa p2 = new Pessoa("Tyler",18);
        Pessoa p3 = new Pessoa("Camila",30);
        Pessoa p4 = new Pessoa("Henrique",62);
        Pessoa p5 = new Pessoa("Vera",78);
        Pessoa p6 = new Pessoa("Luis", 20);
        Pessoa p7 = new Pessoa("Clara",22);

        System.out.println("---INICIO DA FILA---");
        filaPrincipal.dequeue();
        filaPrincipal.enqueue(p1);
        filaPrincipal.enqueue(p2);
        filaPrincipal.enqueue(p3);
        filaPrincipal.enqueue(p4);
        filaPrincipal.enqueue(p5);
        filaPrincipal.enqueue(p6);
        filaPrincipal.enqueue(p7);
        System.out.println("---SAÍDA POR ONDEM DE CHEGADA---");
        filaPrincipal.dequeue();
        filaPrincipal.dequeue();
        filaPrincipal.dequeue();
        filaPrincipal.dequeue();
        System.out.println("---EMBARQUE---");
        onibus.push(p1);
        onibus.push(p2);
        onibus.push(p3);
        onibus.push(p4);
        System.out.println("---SENTAR NO BANCO");
        onibus.pop();
        onibus.pop();
        onibus.pop();
        onibus.pop();
    }
}
