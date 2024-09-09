package conversao;

public class BinarioDecimal {

    public int converter(int binario, int posicao) {
        if (binario == 0) {
            return 0; 
        } else {
            int digito = binario % 10;
            int valorDaPosicao = digito * (int) Math.pow(2, posicao);
            return valorDaPosicao + converter(binario / 10, posicao +1); 

        }
    }


    
}
