public class Tracinhos implements Cloneable
{
    private char[] texto;

    public Tracinhos (int qtd) throws Exception
    {
		// verifica se qtd n�o � positiva, lan�ando uma exce��o.
        if(qtd < 0){
            throw new Exception ("Quantidade invalida - tracinhos");
        }

		// instancia this.texto com um vetor com tamanho igual qtd.
        this.texto = new char[qtd];
        
		// preenche this.texto com underlines (_).
        for(int i = 0; i < qtd; i++){
            this.texto[i] = '_';
        }
        
    } //a

    public void revele (int posicao, char letra) throws Exception
    {
		// verifica se posicao � negativa ou ent�o igual ou maior
        // do que this.texto.length, lan�ando uma exce��o.
        if(posicao < 0 || posicao >= this.texto.length){
            throw new Exception ("Posicao ou tamanho invalido");
        }
        
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
        else{
            this.texto[posicao] = letra;
        }
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++){
            if (this.texto[i] == '_') {
                return true;
            }
        }
        return false;
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        String print= "";
        for(int i = 0; i < this.texto.length; i++){
            print = print + this.texto[i] + " ";
        }
       return print;
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
    }

    public boolean equals (Object obj)
    {
        if(obj == null) return false; //this obrigatoriamente nunca vai ser nulo

        if(this==obj) return true;

        if(obj.getClass()!=Tracinhos.class) return false;

        Tracinhos t = (Tracinhos)obj;

        if(this.texto.length!=t.texto.length) return false;

        for(int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] != t.texto[i]) return false;
        }

        return true;

        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 666;

        ret = 13*ret + new String(this.texto).hashCode();

        if(ret<0) ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
        if (t == null)
            throw new Exception ("Objeto inválido");
        for (int i = 0; i < t.texto.length; i++) {
            this.texto[i] = t.texto[i];
        }
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;
        try{
            ret = new Tracinhos(this);
        } catch (Exception e) {
            
        }
        return ret;
    }
}
