public class TesteControladorDeErros {
    public static void main (String[] args) throws Exception {
        // teste 1
        try
        {
            ControladorDeErros c1 = new ControladorDeErros (null);
            System.out.println ("Deu certo construir ControladorDeErros null");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros null");
        }
        // teste 2
        try
        {
            ControladorDeErros c2 = new ControladorDeErros (10);
            System.out.println ("Deu certo construir ControladorDeErros com qtdMax positiva \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladoDeErros com qtdMax positiva \"\"");
        }
        // teste 3
        try
        {
            ControladorDeErros c3 = new ControladorDeErros (-4);
            System.out.println ("Deu certo construir ControladorDeErros com qtdMax negativa \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros com qtdMax negativa \"\"");
        }
        // teste 4
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
        }
        // teste 5
        try
        {
            ControladorDeErros c5 = new ControladorDeErros ((int)(p1.getTamanho()*0.6));
            c5.registreUmErro();
            System.out.println ("Deu certo registrar um erro no ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro registrar um erro no ControladorDeErros");
        }
        // teste 6
        try {
            ControladorDeErros c6 = new ControladorDeErros (1);
            c6.registreUmErro();
            c6.registreUmErro();
            System.out.println ("Deu certo registrar mais erros que o limite no ControladorDeErros c6");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro registrar mais erros que o limite no ControladorDeErros c6");
        }
        ControladorDeErros c7 = new ControladorDeErros (2);
        ControladorDeErros c9 = new ControladorDeErros (2);
        c7.registreUmErro();
        ControladorDeErros c8 = new ControladorDeErros (5);
        // teste 8
        System.out.println("Testaremos o ControladorDeErros c7 = "+ c7+ ", o ControladorDeErros c8 = " + c8 + " e o Controlador de erros C9 = "+ c9);
        // teste 8
        System.out.println ("\"ControladorDeErros c7\" tem 1 erro registrado, ou seja, "+ c7 +" erros");
        // teste 10
        System.out.println ("Eh "+c7.equals(null)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a null");
        // teste 11
        System.out.println ("Eh "+c7.equals(c7)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a si mesmo");
        // teste 12
        System.out.println ("Eh "+c7.equals("1/2")+" que \"ControladorDeErros c7\" eh igual (pelo equals) ao String \"ControladorDeErros c7\"");
        // teste 13
        System.out.println ("Eh "+c7.equals(c7)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a \"ControladorDeErros c7\"");
        // teste 14
        System.out.println ("Eh "+c7.equals(c8)+" que \"ControladorDeErros c7\" eh igual (pelo equals) a \"ControladorDeErros c8\"");
        // teste 15
        System.out.println ("Eh "+(c7.hashCode()==c9.hashCode())+" que o hashCode de um \"ControladorDeErros\" eh igual ao hashCode de outro \"ControladorDeErros\" com mesma qtdMax");
        // teste 16
        System.out.println ("Eh "+(c7.hashCode()==c8.hashCode())+" que o hashCode de \"ControladorDeErros c7\" eh igual ao hashCode de \"ControladorDeErros c8\"");
    }
}
