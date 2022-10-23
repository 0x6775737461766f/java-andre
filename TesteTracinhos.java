import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;

class TesteTracinhos
{
    // Foram identificados 2 estados
    @Test
    public void shouldReturnTrueIfHasTracinhos() throws Exception {
        // ESTADO 1
        Palavra p2 = new Palavra("COMPUTADOR");
        try
        {
            Tracinhos t6 = new Tracinhos (p2.getTamanho());
            t6.isAindaComTracinhos();
            System.out.println ("Deu certo verificar se ainda tem tracinhos na palavra");
        }
        catch (Exception erro) {
            System.err.println("Deu erro verificar se ainda tem tracinhos na palavra");
            fail();
        }
    }

    @Test
    public void shouldReturnFalseIfDontHaveTracinhos() throws Exception {
        // ESTADO 2
        Palavra p2 = new Palavra("AA");
        char letra = 'A';
        int qtd = p2.getQuantidade(letra);
        Tracinhos t7 = new Tracinhos (p2.getTamanho());
        try
        {
            for (int i=0; i<qtd; i++)
            {
                int posicao = p2.getPosicaoDaIezimaOcorrencia (i,letra);
                t7.revele (posicao, letra);
            }
            if (t7.isAindaComTracinhos()) fail();
            System.out.println ("Deu certo revelar a letra digitada em COMPUTADOR");
        }
        catch (Exception erro) {
            System.err.println("Deu erro revelar a letra digitada em COMPUTADOR");
            fail();
        }
    }

    @Test
    public void shouldCreateWithNullParam(){
        try
        {
            Tracinhos p1 = new Tracinhos (null);
            System.out.println ("Deu certo construir tracinhos null");
            fail();
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos null");
        }
    }

    @Test
    public void shouldCreateWithValidQtd() {
        try
        {
            Tracinhos t2 = new Tracinhos (5);
            System.out.println ("Deu certo construir tracinhos com qtd positiva \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd positiva \"\"");
            fail();
        }
    }

    @Test
    public void shouldThrowIfQtdNegative() {
        try
        {
            Tracinhos t3 = new Tracinhos (-2);
            System.out.println ("Deu certo construir tracinhos com qtd negativa \"\"");
            fail();
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd negativa \"\"");
        }
    }

    @Test
    public void shouldCreateQtdZero() {
        try
        {
            Tracinhos t4 = new Tracinhos (0);
            System.out.println ("Deu certo construir tracinhos com qtd 0 \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd 0 \"\"");
            fail();
        }
    }

    @Test
    public void shouldCreateWithValidParam() throws Exception {
        Palavra p1 = new Palavra("TRAPEZIO");
        try
        {
            Tracinhos t5 = new Tracinhos (p1.getTamanho());
            System.out.println ("Deu certo construir tracinhos da palavra \"TRAPEZIO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos da palavra \"TRAPEZIO\"");
            fail();
        }
    }

    @Test
    public void shouldHaveTracinhosLeft() throws Exception {
        Palavra p2 = new Palavra("COMPUTADOR");
        try
        {
            Tracinhos t6 = new Tracinhos (p2.getTamanho());
            if (!t6.isAindaComTracinhos()) fail();
            System.out.println ("Deu certo verificar se ainda tem tracinhos na palavra");
        }
        catch (Exception erro) {
            System.err.println("Deu erro verificar se ainda tem tracinhos na palavra");
        }
    }

    @Test
    public void testMetodosObrigatorios() throws Exception {
        Palavra p1 = new Palavra("TRAPEZIO");
        Palavra p2 = new Palavra("COMPUTADOR");

        Tracinhos t8 = new Tracinhos(p2.getTamanho());
        Tracinhos t9 = new Tracinhos (p1.getTamanho());
        Tracinhos t10 = new Tracinhos(p2.getTamanho());
        // teste 8
        System.out.println (p2 + " transformado em tracinhos fica: " + t8);
        // teste 9
        System.out.println ("Eh "+t8.equals(null)+" tracinhos em \"COMPUTADOR\" eh igual (pelo equals) a null");
        // teste 10
        System.out.println ("Eh "+t8.equals(t8)+" que tracinhos de \"COMPUTADOR\" eh igual (pelo equals) a si mesmo");
        // teste 11
        System.out.println ("Eh "+t8.equals("_ _ _ _ _ _ _ _ _ _")+" que tracinhos de \"COMPUTADOR\" eh igual (pelo equals) a qtd de tracinhos de \"_ _ _ _ _ _ _ _ _ _\"");
        // teste 12
        System.out.println ("Eh "+t8.equals(p1.getTamanho())+" que tracinhos de \"COMPUTADOR\" eh igual (pelo equals) a qtd de letras de \"TRAPEZIO\"");
        // teste 13
        System.out.println ("Eh "+t8.equals(t9)+" que tracinhos de  \"COMPUTADOR\" eh igual (pelo equals) a tracinhos de \"TRAPEZIO\"");
        // teste 14
        System.out.println ("Eh "+(t8.hashCode()==t10.hashCode())+" que o hashCode de um tracinhos \"COMPUTADOR\" eh igual ao hashCode de outro tracinhos \"COMPUTADOR\"");
        // teste 15
        System.out.println ("Eh "+(t8.hashCode()==t9.hashCode())+" que o hashCode de tracinhos \"COMPUTADOR\" eh igual ao hashCode de tracinhos \"TRAPEZIO\"");
    }

    public static void main (String[] args) throws Exception {
        }
}