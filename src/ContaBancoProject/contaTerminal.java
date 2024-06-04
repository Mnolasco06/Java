package ContaBancoProject;

import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 

        System.out.println("Por favor, digite o seu nome");
            String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
            String Agencia = scanner.nextLine();
            
        System.out.println("Obrigado!");
        System.out.println("Agora, por favor, digite o número da sua conta.");
            int Numero = scanner.nextInt(); 

        System.out.println("Quase lá! Agora, por favor, digite o seu saldo.");
            double Saldo = scanner.nextDouble();   


        System.out.println("Olá " +NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +Agencia+ ", conta "+Numero+" e seu saldo " +Saldo+ " já está disponível para saque.");    
    }


}
