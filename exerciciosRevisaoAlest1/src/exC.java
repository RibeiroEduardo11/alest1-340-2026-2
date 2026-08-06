import java.util.Random;

public class exC {
    public static void main(String[] Args) {
        int[][] matriz = new int[5][4];
        Random gerador = new Random();
        int cont = 0;
        int pos = 0;



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(99);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    cont++;
                }
            }
        }
        int[] vetor = new int[cont];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    vetor[pos] = matriz[i][j];
                    pos++;
                }
            }
        }


        printaMatriz(matriz);
        printaVetor(vetor);

    }

    public static void printaVetor(int[] vetor) {

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
    public static void printaMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t adiciona uma tabulação
            }
            System.out.println(); // Quebra a linha ao fim de cada linha da matriz
        }
    }
}