public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        for(int i = 0; i < this.letrasJaDigitadas.length(); i++){
            if (letra == this.letrasJaDigitadas.charAt(i)){
                return true;
            }
        }
        return false;
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre (char letra) throws Exception
    {
        if (this.isJaDigitada(letra) == true){
            throw new Exception ("Já no banco");
        }
        else{
            this.letrasJaDigitadas += letra;
        }
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {
        String print = "";
        for(int i = 0; i < this.letrasJaDigitadas.length(); i++){
            char c = this.letrasJaDigitadas.charAt(i);
            String s = String.valueOf(c);
            print += s;
            print += ", ";
        }
       return print;
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
    }

    public boolean equals (Object obj)
    {
        if(obj == null) return false;

        if(this==obj) return true;

        if(obj.getClass()!=ControladorDeLetrasJaDigitadas.class) return false;

        ControladorDeLetrasJaDigitadas cont = (ControladorDeLetrasJaDigitadas) obj;

        return this.letrasJaDigitadas == cont.letrasJaDigitadas;
        
        // verificar se this e obj s�o iguais
    }

    public int hashCode ()
    {
         int ret = 666;

        ret = 13*ret + new String(this.letrasJaDigitadas).hashCode();

        if(ret<0) ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas c) throws Exception // construtor de c�pia
    {
        if (c == null)  
            throw new Exception("Objeto inválido!");
        this.letrasJaDigitadas = c.letrasJaDigitadas;
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas ret = null;
        try{
            ret= new ControladorDeLetrasJaDigitadas(this);
        }
        catch (Exception err){}
        return ret;
        // criar uma c�pia do this com o construtor de c�pia e retornar
    }
}
