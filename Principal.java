import java.util.Scanner;
public class Principal{
    public static void main(String args[]){

        Scanner ler = new Scanner(System.in);
        Conta minhaConta= new Conta();
        System.out.println("Digite seu nome: ");
        minhaConta.titular = ler.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        minhaConta.numero = ler.nextInt();

        System.out.println("Digite o seu saldo: ");
        minhaConta.saldo = ler.nextDouble();
        

    System.out.println(minhaConta.titular);
    System.out.println(minhaConta.numero);
    System.out.println(minhaConta.saldo);
    }
}