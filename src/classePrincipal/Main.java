
package classePrincipal;


import classes.ComparadorPessoa;
import classes.Pessoa;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {

            
    public static void main(String[] args) {
        List<Pessoa> pessoas = new LinkedList<Pessoa>();
        
        Pessoa pessoa  =  new Pessoa(18,"Jessica");
        Pessoa pessoa2 = new Pessoa(21,"Allan");
        Pessoa pessoa3 = new Pessoa(38,"Romeu");
        
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        
        ComparadorPessoa comparador = new ComparadorPessoa("NOME");        
        Collections.sort(pessoas,comparador);
        
        System.out.println(pessoas);
        
    }
    
}
