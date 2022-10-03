public class TesteControladordeLetrasJaDigitadas {
    public static void main (String[] args) throws Exception {
        //teste 1 - isJaDigitada char existente
        try
        {
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            p1.registre('a');
            p1.registre('b');
            System.out.println ("ESPERADO - Deu certo buscar por char existente");

        }
        catch (Exception erro)
        {
            System.out.println ("ERRO - Deu errado buscar por char existente");
        }
        //teste 2 - isJaDigitada char inexistente
        try
        {
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            p1.registre('a');
            p1.registre('b');
            boolean jaDig = p1.isJaDigitada('c');
            if (!jaDig)
                System.out.println ("ESPERADO - Deu certo buscar por char inexistente");
            else
                System.out.println ("ERRO - Deu errado buscar por char inexistente");
        }
        catch (Exception erro)
        {
            System.out.println ("ERRO - Deu errado buscar por char inexistente");
        }
        //teste 3 - registre com param ja existe
        try
        {
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            p1.registre('a');
            p1.registre('b');
            p1.registre('a');
            System.out.println ("ERRO - Deu errado registrar char existente");

        }
        catch (Exception erro)
        {
            if (erro.getMessage().equals("Já no banco"))
                System.out.println("ESPERADO - Deu certo registrar caractere ja existente");
            else
                System.out.println ("ERRO - Deu; errado registrar char existente");
        }
        //teste 4 - registre com param inexistente
        try
        {
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            p1.registre('a');
            p1.registre('b');
            p1.registre('c');
            System.out.println ("ESPERADO - Deu certo registrar char inexistente");
        }
        catch (Exception erro)
        {
            System.out.println ("ERRO - Deu errado registrar char inexistente");
        }

        try{
            ControladorDeLetrasJaDigitadas p1 = new ControladorDeLetrasJaDigitadas ();
            System.out.println ("Deu certo construir ControladorDeLetrasJaDigitadas");
        }catch(Exception err) {

            System.out.println ("Deu errado construir ControladorDeLetrasJaDigitadas");
        }

        ControladorDeLetrasJaDigitadas c1 = new ControladorDeLetrasJaDigitadas();
        c1.registre('a');
        c1.registre('b');
        ControladorDeLetrasJaDigitadas c2 = new ControladorDeLetrasJaDigitadas();
        c2.registre('b');
        c2.registre('a');
        // teste equals
        System.out.println ("C1 equals C2?:" + c1.equals(c2) + " . ESPERADO: true");
        // teste hashCode
        System.out.println ("Hash C1 equals hash C2?:" + (c1.hashCode()==c2.hashCode()) + ". ESPERADO: false");
        // teste toString
        System.out.println ("toString C1 equals toString C2?: "+ c1.toString().equals(c2.toString())+" .ESPERADO: true");
        //teste construtor de copia
        ControladorDeLetrasJaDigitadas c3 = new ControladorDeLetrasJaDigitadas(c1);
        System.out.println ("C1 equals C3, que é cons de copia de C1?: "+ c1.equals(c3)+" .ESPERADO: true");
        //teste clone
        ControladorDeLetrasJaDigitadas c4 = (ControladorDeLetrasJaDigitadas) c1.clone();
        System.out.println ("C1 equals C4, que é clone de C1?: "+ c1.equals(c4)+" .ESPERADO: true");

    }
}