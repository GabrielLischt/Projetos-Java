package Funcionario;
import javax.swing.JOptionPane;
public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel",16000);

        String mensagem = "Nome: " + funcionario.nome + "\n" +
        "Salário: " + funcionario.salario + "\n" +
        "Desconto INSS: " + funcionario.calcularInss() + "\n" +
        "Desconto VT: " + funcionario.calcularValeTransporte() + "\n" +
        "Salário líquido: " + (funcionario.salario - funcionario.calcularInss() - funcionario.calcularValeTransporte());

JOptionPane.showMessageDialog(null, mensagem);
    
    }
}