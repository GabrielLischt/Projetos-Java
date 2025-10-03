package Correios;

public class Programa {
    public static void main(String[] args) {
        Endereço endDoGab = new Endereço();
        endDoGab.rua = "Rua Pedras Brancas";
        endDoGab.numero = 1103;
        endDoGab.cep = "25670-220";
        endDoGab.cidade = "Petrópolis";

        Pessoa gabriel = new Pessoa();
        gabriel.nome = "Gabriel Lischt";
        gabriel.cpf = "149.617.327-96";

        gabriel.endereco = endDoGab;

        System.out.println("O " + gabriel.nome + " mora na cidade de " + gabriel.endereco.cidade);
    }
    
}
