import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = calcularValorFinal(valorInicial, taxaJuros, periodo);

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        DecimalFormat df = new DecimalFormat("#.00"); // declaração do objeto df
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }

    static double calcularValorFinal(double valorInicial, double taxaJuros, int periodo){
        for (int i = 0; i < periodo; i++){
            valorInicial = valorInicial + (valorInicial * taxaJuros);
        }

        return valorInicial;
    }
}