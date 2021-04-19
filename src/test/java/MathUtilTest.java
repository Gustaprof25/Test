/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
class MathUtilTest {

    @Test
    void testMdcAPar() {
        final int a = 6;
        final int b = 3;
        final int esperado = b; 
        final int obtido = MathUtil.mdc(a, b);
        
        assertEquals(esperado, obtido);               
    }
    
    @Test
    void testMdcAImpar(){
        final int a = 9;
        final int b = 3;
        final int esperado = b; 
        final int obtido = MathUtil.mdc(a, b);
        
        assertEquals(esperado, obtido);          
    }
    
}
