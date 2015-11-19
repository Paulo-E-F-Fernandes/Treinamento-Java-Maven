package br.com.treinamento.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Produto produto = new Produto("teste", 1.50);
    	
    	String outroProduto = "macarrão";
    	
    	if (produto.getPreco() == 1.50) {
    		
    	}
    	
        System.out.println( "Hello World!" );
    }
}
