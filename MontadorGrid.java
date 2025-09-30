import java.util.Scanner;
public class MontadorGrid {
    public static void main(String[] args) {
        Scanner leia =new Scanner(System.in);
        int[][] num= new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Digite o "+(i+1)+"º número da linha da "+(j+1)+ "ª coluna: ");
                num[i][j]=leia.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print("|"+num[i][j]+"|");
            }
        }
        leia.close();
  }
}
