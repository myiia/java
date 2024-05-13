import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da agência seguido de '-': ");
        String agencia = scanner.nextLine();
        scanner.nextLine();


        System.out.println("Por favor, digite o nome que está no cartão: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Insira o número do cartão: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o saldo da conta: ");
        String saldoStr = scanner.nextLine();
        float saldo = Float.parseFloat(saldoStr);


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numero, saldo);


        scanner.close();
    }
}
