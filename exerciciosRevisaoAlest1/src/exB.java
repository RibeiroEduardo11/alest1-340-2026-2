import java.util.Scanner;

public class exB {

    public static void main(String[] Args){
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor que estará armazenado na posição "+ i);
            vetor[i] = sc.nextInt();
        }

       printaVetor(vetor);

        System.out.println("Escreva um valor inteiro");
        int valor = sc.nextInt();

        procuraValor(vetor,valor);

    }

    public static void printaVetor(int[] vetor){

        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }

    public static Boolean procuraValor(int[] vetor, int valor){
        boolean resultado = false;

        for (int i = 0; i < vetor.length; i++) {
            if(valor == vetor[i]){
                System.out.println("O número: "+valor+" Foi encontrado na posição: "+i);
            }else System.out.println("Valor "+valor+ " Não foi encontrado na posição "+ i);
        }

        return resultado;
    }
}
