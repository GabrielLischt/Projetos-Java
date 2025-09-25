public class SomadorDeImpares {
    public static void main(String[] args) {
        int soma=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
                soma+=i;
            }
        }
        System.out.println("A soma dos números ímpares entre 1 e 100 é: "+soma);
    }
    
}
