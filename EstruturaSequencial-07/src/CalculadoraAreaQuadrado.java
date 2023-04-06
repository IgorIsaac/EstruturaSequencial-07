import java.util.Scanner;

public class CalculadoraAreaQuadrado {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble(); // Lê o valor do lado digitado pelo usuário

        // Calcular a área do quadrado
        double area = Math.pow(lado, 2); // Fórmula da área do quadrado: lado^2

        // Calcular o dobro da área do quadrado
        double dobroArea = area * 2; // Dobro da área do quadrado: área * 2

        // Exibir o dobro da área do quadrado
        System.out.println("A área do quadrado com lado " + lado + " é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
