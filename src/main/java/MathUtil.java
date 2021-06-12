/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class MathUtil {
    public static int mdc(int a, int b ){
        //Propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade 1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //Propriedade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        //Propriedade 5
        if(a % b != 0){
            return 1;
        }
        
        return mdc(a - b, b);
    }

    public static int mdc(int ...valores){
        if(valores.length == 0){
            throw new IllegalArgumentException(
                "É preciso indicar ao menos um valor para calcular o MDC");
            
        }

        int a = valores[0];
        for (int  b : valores){
           a = mdc(a, b);
        }

        return a;
    }
}
