import java.util.Scanner;
public class exA {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        double valor;
        String combustivel;
        double desconto;

        System.out.println("Digite o valor do seu veículo");
        valor = sc.nextDouble();

        sc.nextLine();

        System.out.println("Digite o típo do combustível");
        combustivel = sc.nextLine();

        desconto = calcDesconto(valor,combustivel);

        System.out.println("O valor do desconto é: "+ desconto);
        System.out.println("O valor a ser pago é: "+valorFinal(valor, desconto));
    }
    public static double calcDesconto(double valor, String combustivel){
        double resultado = 0;

        if(combustivel.equalsIgnoreCase("álcool")){
            resultado = valor*0.25;
        }else if(combustivel.equalsIgnoreCase("gasolina")){
            resultado = valor*0.21;
        }else if(combustivel.equalsIgnoreCase("diesel")){
            resultado = valor*0.14;
        }

        return resultado;
    }

    public static double valorFinal(double valor, double desconto){
        double resultado;
        resultado = valor-desconto;
        return resultado;
    }

}
