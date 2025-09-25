public class CalculadoraSalario {
    public static void main(String[] args) {
        double salario= 1500;
        double salarioComDesconto;
        if(salario<=1751.81){
            salarioComDesconto= salario -(salario*8/100);
            System.out.printf("Seu salário é %.2f e depois do desconto do INSS fica: %.2f",salario, salarioComDesconto);
            System.out.println("Seu salário é "+salario+" e depois o desconto do INSS fica: "+salarioComDesconto);
        }else if(salario<=2891.56){
            salarioComDesconto= salario- (salario*9/100);
            System.out.println("Seu salário é "+salario+" e depois o desconto do INSS fica: "+salarioComDesconto);
        }else if(salario<=5839.45){
            salarioComDesconto=salario -  (salario*10/100);
            System.out.println("Seu salário é "+salario+" e depois o desconto do INSS fica: "+salarioComDesconto);
        }else{
            salarioComDesconto=salario - (salario * 11/100);
            System.out.println("Seu salário é "+salario+" e depois o desconto do INSS fica: "+salarioComDesconto);
        }
    }}
