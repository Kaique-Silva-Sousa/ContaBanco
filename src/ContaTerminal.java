import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nome;
        String agencia;
        int numero;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = scanner.next();
        System.out.println("Digite sua agencia");
        agencia = scanner.next();
        System.out.println("Digite o numero da conta");
        numero = scanner.nextInt();
        System.out.println("Digite o saldo");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua âgencia é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " Já está disponivel para saque");

    }
}
