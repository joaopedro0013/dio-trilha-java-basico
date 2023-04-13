import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite A agencia");
        String agencia = leitor.next();

        System.out.println("Por favor digite o numero da conta");
        int Numero = leitor.nextInt(); 

        System.out.println("Por favor digite o seu nome");
        String nome = leitor.next(); 
        String sobrenome = leitor.next(); 

        System.out.println("Por favor digite o seu saldo");
        Double Saldo = leitor.nextDouble();  


        System.out.println("Olá " + nome +" "+ sobrenome +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
