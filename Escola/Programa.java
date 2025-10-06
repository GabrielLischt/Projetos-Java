package Escola;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Escola senai = new Escola("Curso TI", 10);
        String nome;
        int mat;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = leia.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        mat = leia.nextInt();

        Aluno novoAluno = new Aluno(nome, mat);
        senai.matricular(novoAluno);

        leia.close();
    }   
}
