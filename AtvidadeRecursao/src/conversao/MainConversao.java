package conversao;

public class MainConversao {

    public static void main(String[] args) {

    BinarioDecimal num = new BinarioDecimal();

        int binario = 11; 
        int decimal =  num.converter(binario, 0);
       
        System.out.println("O número binário " + binario + " em decimal é: " + decimal);
    }


    
}
