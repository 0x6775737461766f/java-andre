import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteControladorDeErros {

    @Test
    public void testQtdMaximaErrosNaoAtingidaEstado1() throws Exception {
        //ESTADO 1 - QTD maxima de erros não atingida
        ControladorDeErros cEstado = new ControladorDeErros(2);
        try {
            cEstado.registreUmErro();
            assertFalse(cEstado.isAtingidoMaximoDeErros());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void testQtdMaximaErrosAtingidaEstado1() throws Exception {
        //ESTADO 2 - QTD maxima de erros atingida
        ControladorDeErros cEstado = new ControladorDeErros(1);
        cEstado.registreUmErro();
        try {
            cEstado.registreUmErro();
            //test failed
            fail();
        }catch (Exception err){
            assertTrue(cEstado.isAtingidoMaximoDeErros());
        }
    }

    @Test
    public void shouldCreateWithNullParam() {
        try
        {
            ControladorDeErros c1 = new ControladorDeErros (null);
            System.out.println ("Deu certo construir ControladorDeErros null");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros null");
            fail();
        }
    }

    @Test
    public void shouldCreateWithIntParam() {
        try
        {
            ControladorDeErros c2 = new ControladorDeErros (10);
            System.out.println ("Deu certo construir ControladorDeErros com qtdMax positiva \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladoDeErros com qtdMax positiva \"\"");
            fail();
        }
    }

    @Test
    public void shouldNotCreateIfQtdMaximaNegative() {
        try
        {
            ControladorDeErros c3 = new ControladorDeErros (-4);
            System.out.println ("Deu certo construir ControladorDeErros com qtdMax negativa \"\"");
            fail();
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros com qtdMax negativa \"\"");
        }

    }

    @Test
    public void shouldCreateBasedOnPalavra() {
        Palavra p1 = null;
        try
        {
            p1 = new Palavra ("JAVA");
            ControladorDeErros c4 = new ControladorDeErros ((int)(p1.getTamanho()*0.6));
            System.out.println ("Deu certo construir ControladorDeErros da palavra \"JAVA\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir construir ControladorDeErros da palavra \"JAVA\"");
            fail();
        }
    }

    @Test
    public void shouldRegisterErr(){
        Palavra p1 = null;
        try
        {
            p1 = new Palavra ("JAVA");
            ControladorDeErros c5 = new ControladorDeErros ((int)(p1.getTamanho()*0.6));
            c5.registreUmErro();
            System.out.println ("Deu certo registrar um erro no ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro registrar um erro no ControladorDeErros");
            fail();
        }
    }

    @Test
    public void shouldNotRegisterMoreErrsThanAllowed() {
        try {
            ControladorDeErros c6 = new ControladorDeErros (1);
            c6.registreUmErro();
            c6.registreUmErro();
            System.out.println ("Deu certo registrar mais erros que o limite no ControladorDeErros c6");
            fail();
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro registrar mais erros que o limite no ControladorDeErros c6");
        }
    }

    @Test
    public void testMetodosObrigatorios() throws Exception{
        ControladorDeErros c7 = new ControladorDeErros (2);
        ControladorDeErros c9 = new ControladorDeErros (2);
        c7.registreUmErro();
        ControladorDeErros c8 = new ControladorDeErros (5);
        // teste 1
        System.out.println("Testaremos o ControladorDeErros c7 = "+ c7+ ", o ControladorDeErros c8 = " + c8 + " e o Controlador de erros C9 = "+ c9);
        // teste 2
        System.out.println ("\"ControladorDeErros c7\" tem 1 erro registrado, ou seja, "+ c7 +" erros");
        // teste 3
        System.out.println ("Eh "+c7.equals(null)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a null");
        // teste 4
        System.out.println ("Eh "+c7.equals(c7)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a si mesmo");
        // teste 5
        System.out.println ("Eh "+c7.equals("1/2")+" que \"ControladorDeErros c7\" eh igual (pelo equals) ao String \"ControladorDeErros c7\"");
        // teste 6
        System.out.println ("Eh "+c7.equals(c7)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a \"ControladorDeErros c7\"");
        // teste 7
        System.out.println ("Eh "+c7.equals(c8)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a \"ControladorDeErros c8\"");
        // teste 8
        System.out.println ("Eh "+(c7.hashCode()==c9.hashCode())+" que o hashCode de um \"ControladorDeErros\" eh igual ao hashCode de outro \"ControladorDeErros\" com mesma qtdMax");
        // teste 9
        System.out.println ("Eh "+(c7.hashCode()==c8.hashCode())+" que o hashCode de \"ControladorDeErros c7\" eh igual ao hashCode de \"ControladorDeErros c8\"");
        //teste construtor de copia
        ControladorDeErros c10 = new ControladorDeErros(c9);
        System.out.println ("C9 equals C10, que é cons de copia de C9?: "+ c9.equals(c10)+" .ESPERADO: true");
        //teste clone
        ControladorDeErros c11 = (ControladorDeErros) c9.clone();
        System.out.println ("C9 equals C11, que é clone de C9?: "+ c9.equals(c11)+" .ESPERADO: true");
    }
}
