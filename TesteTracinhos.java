class TesteTracinhos
{
    public static void main (String[] args) throws Exception {
        // teste 1
        try
        {
            Tracinhos p1 = new Tracinhos (null);
            System.out.println ("Deu certo construir tracinhos null");

        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos null");
        }
        // teste 2
        try
        {
            Tracinhos t2 = new Tracinhos (5);
            System.out.println ("Deu certo construir tracinhos com qtd positiva \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd positiva \"\"");
        }
        // teste 3
        try
        {
            Tracinhos t3 = new Tracinhos (-2);
            System.out.println ("Deu certo construir tracinhos com qtd negativa \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd negativa \"\"");
        }
        // teste 4
        try
        {
            Tracinhos t4 = new Tracinhos (0);
            System.out.println ("Deu certo construir tracinhos com qtd 0 \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos com qtd 0 \"\"");
        }
        // teste 5
        Palavra p1 = new Palavra("TRAPEZIO");
        try
        {
            Tracinhos t5 = new Tracinhos (p1.getTamanho());
            System.out.println ("Deu certo construir tracinhos da palavra \"TRAPEZIO\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir tracinhos da palavra \"TRAPEZIO\"");
        }
        // teste 6
        Palavra p2 = new Palavra("COMPUTADOR");
        try
        {
            Tracinhos t6 = new Tracinhos (p2.getTamanho());
            t6.isAindaComTracinhos();
            System.out.println ("Deu certo verificar se ainda tem tracinhos na palavra");
        }
        catch (Exception erro) {
            System.err.println("Deu erro verificar se ainda tem tracinhos na palavra");
        }
        // teste 7
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
            System.out.println ("Deu certo revelar a letra digitada em COMPUTADOR");
        }
        catch (Exception erro) {
            System.err.println("Deu erro revelar a letra digitada em COMPUTADOR");
        }
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
}