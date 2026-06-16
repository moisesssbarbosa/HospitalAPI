public class Validador {
    public static void main(String[] args) {
        System.out.println("Iniciando verificação...");

        boolean bancoPronto = true;

        if (bancoPronto) {
            System.out.println("SISTEMA OK!! SUCESSO!");
            System.exit(0);
        } else {
            System.out.println("Erro");
            System.exit(1);
        } 
    }
}