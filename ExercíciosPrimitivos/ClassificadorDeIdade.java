package ExercíciosPrimitivos;
public class ClassificadorDeIdade{
    public static void main(String[] args) {
        int idade =12;

        if(idade<=11){
            System.out.println(idade+ " anos é uma criança.");
        }else if(idade<=17){
            System.out.println(idade+ " anos é um adolescente.");
        }else if(idade<=64){
            System.out.println(idade+ " anos é um adulto.");
        }else{
            System.out.println(idade+ " anos é um idoso.");
        }

    }
}