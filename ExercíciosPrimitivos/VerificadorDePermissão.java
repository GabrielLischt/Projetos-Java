package ExercíciosPrimitivos;
public class VerificadorDePermissão{
    public static void main(String[] args) {
        double altura= 1.61;
        boolean estaAcompanhada= true;

        if(altura>1.59){
            System.out.println("Você tem "+ altura+"m de altura, logo pode entrar no brinquedo.");
        }else if(estaAcompanhada==true){
            System.out.println("Você não tem altura necessário mas está acompanhado, logo pode entrar no brinquedo.");
        } else{
            System.out.println("Você não pode entrar no brinquedo.");
        }
    }
}