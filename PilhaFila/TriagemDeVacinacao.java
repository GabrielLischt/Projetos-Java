package PilhaFila;

public class TriagemDeVacinacao {
    public static void main(String[] args) {
        Fila filaPrincipal = new Fila(5);
        Pessoa p1 = new Pessoa("Gabriel",25);
        Pessoa p2 = new Pessoa("Tyler",18);
        Pessoa p3 = new Pessoa("Camila",30);
        Pessoa p4 = new Pessoa("Henrique",62);
        Pessoa p5 = new Pessoa("Vera",78);

        filaPrincipal.enqueue(p1);
        System.out.print("(Fila Principal)");
        filaPrincipal.enqueue(p2);
        System.out.print("(Fila Principal)");
        filaPrincipal.enqueue(p3);
        System.out.print("(Fila Principal)");
        filaPrincipal.enqueue(p4);
        System.out.print("(Fila Principal)");
    
        filaPrincipal.enqueue(p5);
        System.out.print("(Fila Principal)");

        Fila filaPrioridade = new Fila(5);
        Fila filaComum = new Fila(5);
        System.out.println("\n");

        while(!filaPrincipal.isEmpty()){
            Pessoa p = filaPrincipal.dequeue();
            if(p.getIdade()>=60){
                System.out.print("(Fila Principal)");
                filaPrioridade.enqueue(p) ;
                System.out.println("(Fila Prioridade)\n");
            }else{
                System.out.print("(Fila Principal)");
                filaComum.enqueue(p);
                System.out.print("(Fila Comum)\n\n");
            }
        }
        System.out.println("\n---FILA PRIORIDADE---");
        imprimirFila(filaPrioridade);
        System.out.println("---FILA COMUM---");
        imprimirFila(filaComum);  
    }
    public static void imprimirFila(Fila fila){
        for(int i=0;i<fila.tamanho();i++){
            System.out.println(fila.getElemento(i));
    }
    }
}
