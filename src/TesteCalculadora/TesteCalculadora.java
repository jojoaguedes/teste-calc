package TesteCalculadora;

import Calculadora.Calculadora;
import org.junit.Test;
import org.junit.Assert;

public class TesteCalculadora {

    @Test
    public void quandoEuSomarDoisNumerosPositivos(){
         Double numero1 = 1.0;
         Double numero2 = 2.0;

         Calculadora calc = new Calculadora();

         Double esperado = 3.0;
         Assert.assertEquals(esperado,calc.somar(numero1, numero2));
    }

    @Test
    public void quandoEuSomarDoisNumerosNegativos(){
        Double numero1 = -1.0;
        Double numero2 = -2.0;

        Calculadora calc = new Calculadora();

        Double esperado = -3.0;
        Assert.assertEquals(esperado,calc.somar(numero1, numero2));
    }

    @Test
    public void quandoEuSomarNegativoComPositivo(){
        Double numero1 = -1.0;
        Double numero2 = 2.0;

        Calculadora calc = new Calculadora();

        Double esperado = 1.0; //tem q subtrair
        Assert.assertEquals(esperado,calc.somar(numero1, numero2));
    }

 @Test (expected = NullPointerException.class)
 public void QuandoEuSomarUmNumeroComNulo(){
     Double numero1 = null;
     Double numero2 = 0.1;

     Calculadora calc = new Calculadora();
     calc.somar(numero1, numero2);
 }

    @Test
    public void QuandoEuSubtrairDoisNumerosPositivosPrimeiroaiorSegundo() {
        Double numero1 = 2.0;
        Double numero2 = 1.0;

        Calculadora calc = new Calculadora();

        Double esperado = 1.0;
        Assert.assertEquals(esperado,calc.subtrair(numero1, numero2));
    }

    @Test
    public void QuandoEuSubtrairDoisNumerosPositivosPrimeiroMenosSegundo() {
        Double numero1 = 1.0;
        Double numero2 = 2.0;
        Calculadora calc = new Calculadora();
        Double esperado = -1.0;
        Assert.assertEquals(esperado,calc.subtrair(numero1, numero2));
    }

    @Test
    public void QuandoMultiplicarDosiPositivos(){
        Double n1 = 5.0;
        Double n2 = 3.0;

        Calculadora calc = new Calculadora();
        Double esperado = 15.0;
        Assert.assertEquals(esperado,calc.multiplica(n1, n2));

    }

    @Test
    public void QuandoMultiplicarPorZero(){
        Double n1 = 0.0;
        Double n2 = 3.0;

        Calculadora calc = new Calculadora();
        Double esperado = 0.0;
        Assert.assertEquals(esperado,calc.multiplica(n1, n2));

    }

    @Test(expected = ArithmeticException.class)
    public void QuandoDividerPorZero(){
        Double n1 = 2.0;
        Double n2 = 0.0;

        Calculadora calc = new Calculadora();
        calc.divide(n1, n2);
    }

    @Test
    public void QuandoDividerDoisPositivos(){
        Double n1 = 6.0;
        Double n2 = 2.0;
        Calculadora calc = new Calculadora();
        Double esperado = 3.0;
        Assert.assertEquals(esperado,calc.divide(n1, n2));
    }
}
