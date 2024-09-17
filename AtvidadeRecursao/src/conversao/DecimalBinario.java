package conversao;

public class DecimalBinario {

    
    public String converterBinario(int d ){
  
        if (d == 0) {
            return "0";
        }

     
        else if (d == 1) {
            return "1";
        }

        int resto=d%2;
        int quociente=d/2;

    
           
        return converterBinario (quociente) + resto;
           
        
}
}
