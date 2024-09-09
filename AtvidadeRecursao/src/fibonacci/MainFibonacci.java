package fibonacci;

public class MainFibonacci {
    public static void main(String[] args) {

        int i = 0; 
        int resultado;
        
        System.out.println("Sequência de Fibonacci até passar de 100:");
        
        while (true) {
            resultado = fibonacci(i);
            if (resultado > 100) {
                break;
            }
            System.out.print(resultado + " ");
            i++;
        }
    }

}

