import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Requisito 01: Pedir dois numeros
        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("");
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        sc.close();

        //Requisito 02: Imprimir a soma
        int soma = x + y;
        System.out.print("A soma de " + x + " + " + y + " é " + soma);
        
    }
}
