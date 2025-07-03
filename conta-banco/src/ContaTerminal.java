import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Digite seu nome");
        String name = scanner.next();

        System.out.println("Digite sua agência: ");
        String ag = scanner.next();

        System.out.println("Digite sua conta: ");
        String cc = scanner.next();

        System.out.println("Digite seu saldo: ");
         double saldo = scanner.nextDouble();

        System.out.println("Olá " +name+ ", obrigado por criar uma conta em nosso banco, sua agência é " +ag+ ", conta " +cc+ " e seu saldo" +saldo+ " já está disponível para saque.");
     scanner.close();
    }
}
