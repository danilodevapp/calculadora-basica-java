import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
    public static void main(String[] args) {        
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Calcular calcular = new Calcular();

    System.out.print("Digite o primeiro número: ");
    calcular.Numero1 = scanner.nextDouble();    
    System.out.println("");

    System.out.print("Digite o segundo número: ");
    calcular.Numero2 = scanner.nextDouble();
    System.out.println("");

    System.out.println("Efetuando os cálculos...");
    System.out.println("");

    double soma = calcular.Somar(0, 0);
    double multiplicacao = calcular.Multiplicar(0, 0);
    double subtracao = calcular.Subtrair(0, 0);
    double divisao = calcular.Dividir(0, 0);

    calcular.Somar(0, 0);
    System.out.println("O resultado da soma é: " + soma);

    calcular.Subtrair(0, 0);
    System.out.println("O resultado da subtração é: " + subtracao);

    calcular.Multiplicar(0, 0);
    System.out.println("O resultado da multiplicação é: " + multiplicacao);

    calcular.Dividir(0, 0);
    System.out.println("O resultado da divisão é: " + divisao);

}
}
