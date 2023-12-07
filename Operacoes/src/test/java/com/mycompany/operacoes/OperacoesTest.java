/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.operacoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Breno
 */
public class OperacoesTest {
    
    public OperacoesTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.adicao(2, 2));
        assertEquals(-1, calculadora.adicao(-2, 1));
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.subtracao(5, 2));
        assertEquals(0, calculadora.subtracao(2, 2));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicacao(2, 3));
        assertEquals(0, calculadora.multiplicacao(0, 5));
    }

    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.5, calculadora.divisao(5, 2), 0.001); // O terceiro parâmetro é a precisão aceitável
        assertEquals(0.0, calculadora.divisao(0, 5), 0.001);
        
        // Testando a exceção para divisão por zero
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(2, 0));
    }
    
}
