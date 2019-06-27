
package classes;

import java.util.Comparator;


public class ComparadorPessoa implements Comparator<Pessoa>{
    private String comparacao;
    private final String nome  = "NOME";
    private final String idade = "IDADE";

    public ComparadorPessoa(String comparacao) {
        this.comparacao = comparacao;
    }

    public String getComparacao() {
        return comparacao;
    }

    public void setComparacao(String comparacao) {
        this.comparacao = comparacao;
    }
    
    public int compare(Pessoa p1, Pessoa p2){
        if(comparacao.equals(nome)){
            return p1.getNome().compareTo(p2.getNome());
        }
        
        return p1.getIdade() - p2.getIdade();
        
    }
    
    
}
