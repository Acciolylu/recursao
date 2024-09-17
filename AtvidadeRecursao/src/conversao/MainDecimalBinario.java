package conversao;

public class MainDecimalBinario {
    public static void main(String[] args) {
        
        DecimalBinario converte = new DecimalBinario();
        int d=100;
        String binario = converte.converterBinario(d);
        System.out.println("O valor do número "+ d +" em binário é: " + binario);
        




    }
    
}
