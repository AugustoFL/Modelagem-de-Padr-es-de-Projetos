package exer2;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade () {
        return this.idade;
       
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public void cumprimentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }
}
