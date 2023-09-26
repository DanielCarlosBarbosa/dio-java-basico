import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os calores digitados no terminal 
        Scanner ler = new Scanner(System.in);
            System.out.println("Por favor, digite o nome do cliente");
            String nome_cliente = ler.next();//"MARIO ANDRADE";

            System.out.println("Por favor, digite a agência");
            String agencia = ler.next();//"067-8";

            System.out.println("Por favor, digite o número da conta");
            int conta = ler.nextInt();//1021;

            System.out.println("Por favor, digite o saldo");
            double saldo = ler.nextDouble();//237.48;

            // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
            String msg = "Olá "+ nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque";

            System.out.println(msg);

    }
}
