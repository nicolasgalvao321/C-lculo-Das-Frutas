import java.util.Scanner;
public class Main {
  public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a quantidade (em Kg) de morangos: ");
        double kgMorango = sc.nextDouble();

        System.out.print("Digite a quantidade (em Kg) de maçãs: ");
        double kgMaca = sc.nextDouble();

        // Preços por kg
        double precoMorango;
        double precoMaca;

        // Definindo o preço do morango
        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        // Definindo o preço da maçã
        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        // Cálculo do total
        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;

        // Verificando desconto
        if (kgMorango + kgMaca > 8 || totalCompra > 25.00) {
            totalCompra = totalCompra * 0.90; // 10% de desconto
        }

        // Saída final formatada
        System.out.printf("Valor final da compra: R$ %.2f\n", totalCompra);
    }
}

  }
