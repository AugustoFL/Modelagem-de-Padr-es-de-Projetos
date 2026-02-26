/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exer7;

/**
 *
 * @author Afonso
 */

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;
    private String cep;
    private String bairro;
    
public Endereco (String rua, int numero, String cidade, String cep, String bairro){

    this.rua = rua;
    this.numero = numero;
    this.cidade = cidade;
    this.cep = cep;
    this.bairro = bairro;
    
    setRua(rua);
    setNumero(numero);
    setCidade(cidade);
    setCep(cep);
    setBairro(bairro);
    
    
   
}
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    }

