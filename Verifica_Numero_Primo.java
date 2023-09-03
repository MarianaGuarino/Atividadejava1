public class VerificaNumeroPrimo {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }
        if (n <= 3) {
            return 1; 
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return 0; 
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return 0; 
            }
        }

        return 1; 
    }

    public static void main(String[] args) {
        Integer numero = 17; 

        int resultado = verificaNumeroPrimo(numero);

        if (resultado == 1) {
            System.out.println(numero + " - O número é primo.");
        } else {
            System.out.println(numero + " - O número não é primo.");
        }
    }
}
