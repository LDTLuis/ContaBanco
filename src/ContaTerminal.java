import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.print("Confirme o número de sua agência bancária: ");
        String agencia = sc.next();

        System.out.print("Digite seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                " e seu número de conta é " + numero + ", seu saldo é de R$" + saldo + ", já está disponível para saque");

        sc.close();
    }
}
