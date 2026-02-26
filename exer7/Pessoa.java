/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exer7;

/**
 *
 * @author Afonso
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private Endereco endereco;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setEndereco(String rua, int numero, String cidade, String cep, String bairro) {
        this.endereco = new Endereco( rua, numero,  cidade,  cep,  bairro );
    }
    
    public String getEndereco(){
        String resposta = "Rua: " + endereco.getRua() + "\nNumero: " + 
                endereco.getNumero() + "\nCidade: " + endereco.getCidade() +
                "\nCep: " + endereco.getCep() + "\nBairro: " + endereco.getBairro();
        
        return resposta;    
    
    }

}
