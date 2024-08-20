import java.util.Scanner;
//Numero
//Nome Cliente
//Saldo
public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        String agencia;
        String nomeCliente;
        int numero;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome da sua agência.");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome.");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo de conta.");
        saldo = sc.nextDouble();

        System.out.println(
                "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco," +
                        " sua agência é "+agencia+", conta "+numero+" e seu " +
                        "saldo "+saldo+" já está disponível para saque."
        );
    }
}
