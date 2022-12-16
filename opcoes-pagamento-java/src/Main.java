import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o método de pagamento (crédito, débito, boleto): ");
        String metodo = scanner.nextLine();

        if (metodo.equalsIgnoreCase("crédito")) {
            System.out.println("Método de pagamento valido.");
        } else if (metodo.equalsIgnoreCase("débito")) {
            System.out.println("Método de pagamento valido.");
        } else if (metodo.equalsIgnoreCase("boleto")) {
            System.out.println("Método de pagamento valido.");
        } else {
            System.out.println("Método de pagamento inválido.");
        }

    }

}