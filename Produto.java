import java.util.Scanner;
public class Produto {
    String nome;
    int codigo;
    double preco;

    public static void main(String[] args) {
        Produto playstation5slim = new Produto();
        playstation5slim.nome = "Playstation 5 Slim 1tb";
        playstation5slim.codigo = 10;
        playstation5slim.preco = 3600;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        playstation5slim.nome= leia.nextLine();
        System.out.print("Digite o código do produto: ");
        playstation5slim.codigo= leia.nextInt();
        System.out.print("Digite o preço do produto: ");
        playstation5slim.preco= leia.nextDouble();

        System.out.println("\n ---OFERTA--- \n");
        System.out.println("Item: "+ playstation5slim.nome);
        System.out.println("Código: "+ playstation5slim.codigo);
        System.out.println("Preço: "+ playstation5slim.preco);
        leia.close();
    }
}
