package teste;

import lista.Buzz;
import org.junit.Assert;

public class TesteBuzz {

    @org.junit.Test
 public void DadoQueInformoUmNumeroInteiroORestodaDivisaoDeveSerZero() {
     // dado / entrada
        Integer numero = 5;

        // quando / execucao
     Buzz buzz = new Buzz();

     // entao / verificacao
        //Integer esperado = 5;
     Assert.assertEquals("buzz", buzz.doBuzz(numero));

    }

    @org.junit.Test
    public void DadoqueInformoUmNumeroInteiroORestoDaDivisaoDiferentedeZero() {
        Integer numero = 6;
        // quando / execucao
        Buzz buzz = new Buzz();

        // entao / verificacao
        Integer esperado = 6;
        Assert.assertEquals(String.valueOf(esperado), buzz.doBuzz(numero));

    }

}
