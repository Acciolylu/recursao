package fibonacci;

public class MainFibonacci {
    public static void main(String[] args) {

        int i = 0; 
        int resultado;
        
        System.out.println("Sequência de Fibonacci até passar de 100:");

        FibonacciRecursivo fibo = new FibonacciRecursivo();
        
        while (true) {
            resultado = fibo.fibonacci(i);
            if (resultado >200) {
                break;
            }
            System.out.print(resultado + " ");
            i++;
        }
    }

}

