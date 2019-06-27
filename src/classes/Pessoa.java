
package classes;


public class Pessoa implements Comparable<Pessoa>{

    private int idade;
    private String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + '}';
    }
    
    
    
    @Override
    public int compareTo(Pessoa o) {
        if(idade > o.idade){
            return 1;
        }
        
        if(idade < o.idade){
            return -1;
        }
        return 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
