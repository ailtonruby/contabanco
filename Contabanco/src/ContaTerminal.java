import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Coletando dados do usuário
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente
        
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();
        
        // Formatando o saldo para exibição (2 casas decimais)
        DecimalFormat df = new DecimalFormat("0.00");
        String saldoFormatado = df.format(saldo);
        
        // Construindo a mensagem final
        System.out.println("Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, " +
                         "sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + saldoFormatado + 
                         " já está disponível para saque");
        
        scanner.close();
    }
}