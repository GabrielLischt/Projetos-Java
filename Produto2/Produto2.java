package Produto2;

public class Produto2 {
    String descricao;
    double valor;
    int quantidade;

    public Produto2(String descricao, double valor, int quantidade){
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public double calcularIcms(){
        return valor * 0.12;
    }
}
