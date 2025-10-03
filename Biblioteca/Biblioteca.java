package Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Autor stephenKing = new Autor("Stephen King", " Norte-Americano");
        Autor georgeOrwell = new Autor("George Orwell", "Britânico");

        Livro oIluminado = new Livro("O Iluminado", 1977);
        Livro itAcoisa = new Livro("It: A coisa", 1986);
        Livro revDosBichos = new Livro("Revolução dos Bichos", 1945);

        revDosBichos.autor = georgeOrwell;
        oIluminado.autor = stephenKing;
        itAcoisa.autor = stephenKing;

        System.out.println("O livro '" + oIluminado.titulo + "' foi escrito por " + oIluminado.autor.nome + ".");
        System.out.println("'" +oIluminado.titulo +"' foi lançado em " + oIluminado.anoPublicacao + " pelo autor " + oIluminado.autor.nacionalidade + ".");
        System.out.println("O livro '"+ itAcoisa.titulo+ "' foi escrito por "+ itAcoisa.autor.nome+".");
        System.out.println("'"+itAcoisa.titulo + "' foi lançado em " + itAcoisa.anoPublicacao + " pelo autor " + itAcoisa.autor.nome + ".");
        System.out.println("O livro '"+ revDosBichos.titulo + "' foi escrito por " + revDosBichos.autor.nome + " em "+ revDosBichos.anoPublicacao + ".");
    }
    
}
