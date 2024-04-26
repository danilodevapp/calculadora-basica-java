//Esse programa se trata de uma aplicação simples, para calcular a soma, 
//subtração, multiplicação e divisão de dois números.

import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
    public static void main(String[] args) {        
    
    //Criado o objeto scanner para recebimento das variáveis...
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    //Instanciada a Classe Calcular para permitir acesso aos dados da classe
    Calcular calcular = new Calcular();

    //Recebe o primeiro valor do usuário para ser calculado
    System.out.print("Digite o primeiro número: ");
    calcular.Numero1 = scanner.nextDouble();    
    System.out.println("");

    //Recebe o segundo valor do usuário para ser calculado
    System.out.print("Digite o segundo número: ");
    calcular.Numero2 = scanner.nextDouble();
    System.out.println("");

    System.out.println("Efetuando os cálculos...");
    System.out.println("");
    
    //Cria variável soma para receber o valor da função Somar na Classe Calcular
    double soma = calcular.Somar(0, 0);
    //Cria variável multiplicacao para receber o valor da função Multiplicar na Classe Calcular    
    double multiplicacao = calcular.Multiplicar(0, 0);
    //Cria a variável subtracao para receber o valor da função Subtrair na Classe Calcular
    double subtracao = calcular.Subtrair(0, 0);
    //Cria a variável divisao para receber o valor da função Dividir na Classe Calcular
    double divisao = calcular.Dividir(0, 0);

    //Dispara o método Somar na Classe Calcular
    calcular.Somar(0, 0);
    //Imprime o resultado da soma dos números
    System.out.println("O resultado da soma é: " + soma);
    //Dispara o método Subtrair na Classe Calcular
    calcular.Subtrair(0, 0);
    //Imprimeo o resultado da subtração dos números
    System.out.println("O resultado da subtração é: " + subtracao);
    //Dispara o método Multiplicar na Classe Calcular
    calcular.Multiplicar(0, 0);
    //Imprime o resultado da multiplicação dos números
    System.out.println("O resultado da multiplicação é: " + multiplicacao);
    //Dispara o método Dividir na Classe Calcular
    calcular.Dividir(0, 0);
    //Imprime o resultado da divisão dos números
    System.out.println("O resultado da divisão é: " + divisao);

}
}
