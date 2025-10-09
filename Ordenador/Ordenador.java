package Ordenador;

public class Ordenador {
    public static void bubbleSort( int[] vetor) {
        int n = vetor.length;
        for(int j=0; j<n-1;j++){
            if(vetor[j]> vetor[j+1]){
                int temp = vetor[j];
                vetor[j]= vetor [j+1];
                vetor[j+1]=temp;
            }
        }
    }

    public static void selectionSort ( int[] vetor){
        int n = vetor.length;
        for( int i =0; i <n-1;i++){
            int indiceDoMenor = i;
            for(int j=i+1; j <n;j++){
                if (vetor[j]< vetor[indiceDoMenor]){
                    indiceDoMenor = j;
                }
            }
            int temp = vetor [indiceDoMenor];
            vetor [indiceDoMenor] = vetor[i];
            vetor[i]=temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        for( int i =0; i <vetor.length; i++){
            int chave = vetor[i];
            int j = i-1;
            while(j>=0 && vetor[j]> chave){
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }
        
    }
    
}
