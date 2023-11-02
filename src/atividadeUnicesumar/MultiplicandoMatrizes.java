package atividadeUnicesumar;
import java.util.Scanner;
public class MultiplicandoMatrizes {
    public static void main(String[] args)  {
        try (Scanner dados = new Scanner(System.in)) {
            System.out.println("===========================================================================================================================================");
            System.out.println("\nPara fazer a multiplicação das Matrizes você deve inserir a quantidade de linha e quantidade de colunas que a Matriz 1 deve possuir!\n");
            System.out.println("===========================================================================================================================================");

            System.out.print("Por favor insira a quantidade de Linhas da Matriz Um: ");
            int linha_A_Matriz1 = dados.nextInt();
            
            System.out.print("Por favor insira a quantidade de Colunas da Matriz Um: ");
            int coluna_B_Matriz1 = dados.nextInt();

            int [] [] matriz1 = new int[linha_A_Matriz1] [coluna_B_Matriz1];

            for( int A = 0; A < linha_A_Matriz1; A++){
                for(int B = 0; B < coluna_B_Matriz1; B++){
                    System.out.print("\nDigite  os valores que deseja para a MATRIZ UM: ");
                    matriz1[A] [B] = dados.nextInt();
                }
            }

            System.out.println("===========================================================================================================================================");
            System.out.println("\nPara fazer a multiplicação das Matrizes você deve inserir a quantidade de linhas e quantidade de colunas que a  Matriz 2 deve possuir!\n");
            System.out.println("===========================================================================================================================================");

            System.out.print("Por favor insira a quantidade de Linhas da Matriz Dois: ");
            int linha_C_Matriz2 = dados.nextInt();

            System.out.print("Por favor insira a quantidade de Colunas da Matriz Dois: ");
            int coluna_D_Matriz2 = dados.nextInt();
            int [] [] matriz2 = new int[linha_C_Matriz2] [coluna_D_Matriz2];

          
            for( int C = 0; C < linha_C_Matriz2; C++){
                for(int D = 0; D < coluna_D_Matriz2; D++){
                    System.out.print("\nDigite  os valores que deseja para a MATRIZ DOIS: ");
                    matriz2[C] [D] = dados.nextInt();
                }
            }

            if(matriz1[0].length == matriz2.length){
                int matriz3 [][] = new int[linha_A_Matriz1][coluna_D_Matriz2];
                for(int E = 0; E < linha_A_Matriz1; E++){
                    for(int F = 0; F < coluna_D_Matriz2; F++){
                        for(int G = 0; G < linha_C_Matriz2; G++){
                            matriz3[E] [F] += matriz1[E] [G] * matriz2[G] [F];
                        }
                    }
                }
                System.out.printf("=====================RESULTADO==================\n");
                System.out.printf("matriz1   X   matriz2   =  matriz3%n");
                for( int H = 0; H < linha_A_Matriz1; H++){
                    for(int i = 0; i  < coluna_B_Matriz1; i++){
                        System.out.printf("|%d | ",matriz1[H][i]);
                    }
                    System.out.printf("   ");
                    for(int j = 0; j < coluna_D_Matriz2; j++){
                        System.out.printf("|%d | ",matriz2[H][j]);
                    }
                    System.out.printf("   ");
                    for(int k = 0; k < coluna_D_Matriz2; k++){
                        System.out.printf("|%d | ",matriz3[H][k]);
                    }
                    System.out.printf("%n");
                }
            }
            else{
                System.out.println("Erro, a quantidade de linhas e colunas devem ser iguais nas duas Mtrizes para a multiplicação!");
            }
        }
     
    }
}
