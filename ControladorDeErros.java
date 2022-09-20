public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax < 0){
            throw new Exception("Valor negativo");
        }
        else {
            this.qtdMax = qtdMax;
        }
		// verifica se qtdMax fornecida n�o � positiva, lan�ando
		// uma exce��o.
		// armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr == this.qtdMax){
            throw new Exception("Valor já é igual");
        }
        else {
            this.qtdErr++;
        }
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        return (this.qtdErr == this.qtdMax);
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        //return (this.equals(obj));  //n pode fazer isso
        if (obj == null) return false;

        if (obj == this) return true; //mesmo endereço

        if (obj.getClass() != this.getClass()) return false;

        ControladorDeErros cont = (ControladorDeErros)obj;

        return (this.qtdMax == cont.qtdMax) && (this.qtdErr == cont.qtdErr);
        
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 666;

        ret = 13*ret + new Integer(this.qtdErr).hashCode();
        ret = 13*ret + new Integer(this.qtdMax).hashCode();

        if(ret<0) ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        if  (c==null)
            throw new Exception("objeto invalido");
        this.qtdErr = c.qtdErr;
        this.qtdMax = c.qtdMax;
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        // returnar uma c�pia de this
        ControladorDeErros ret = null;
        try{
            ret = new ControladorDeErros(this);
        }catch(Exception err){}
        return ret;
    }
}
