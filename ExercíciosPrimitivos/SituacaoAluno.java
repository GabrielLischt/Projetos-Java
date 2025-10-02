package ExercíciosPrimitivos;
public class SituacaoAluno {
    public static void main(String[] args) {
        double nota1 =5, nota2=6;
        double media = (nota1+nota2)/2;

        if(media==10){
            System.out.println(("Sua média foi: "+media+". Aprovado! Parabens!"));
        }else if(media>=7){
            System.out.println("Sua média foi: "+media+". Aprovado!");
        }else{
            System.out.println("Sua média foi: "+media+". Reprovado!");
        }
    }
    
}
