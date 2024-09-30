import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o NUMERO de sua conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o numero de sua AGENCIA:");
        String agencia = scanner.next();

        System.out.println ("Digite seu NOME:");
        String nomeCliente = scanner.next();

        System.out.println("Digte o seu SALDO atual:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é " + agencia + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}