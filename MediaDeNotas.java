import java.util.Scanner;
public class MediaDeNotas{
    public static void main(String[] args) {
        double notas, media;
        double soma=0;
        Scanner leia= new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Digite a nota: ");
            notas = leia.nextDouble();
            if(notas>10){
                System.out.println("Número ignorado.");
                continue;
            }else if(notas<0){
                System.out.println("Programa interrompido.");
                break;
            }
            soma= soma+notas;
        }
        leia.close();
        media=soma/5;
        if(soma>0){
        System.out.println("A média das notas válidas é: "+media);}
    }
}