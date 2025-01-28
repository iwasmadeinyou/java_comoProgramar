// AccountTest.Java
// Cria e manipula um objeto Account.
import java.util.Scanner;

public class AccountTest 
{
        public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Exibe o saldo inicial e o nome de cada conta (ou objeto)
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        // Cria um Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // Exibe o texo na tela
        double depositAmount = input.nextDouble(); // Lê a entrada do valor

        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // Adiciona o saldo na account 1

        // Exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.printf("Enter deposit for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        
        displayAccount(account1);
        displayAccount(account2);
        

    } // Fim da Main

    public static void displayAccount(Account account){
        System.out.printf("%s balance is: $%.2f %n", account.getName(), account.getBalance());
    }

} // Fim da classe AccountTest
