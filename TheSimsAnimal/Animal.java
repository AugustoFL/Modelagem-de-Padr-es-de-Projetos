/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Animal {
   
    private String imagem;
    private String alimento;
    private int fome;
    private double localizacao;
    private double limites;

   
   
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public double getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
    }

    public double getLimites() {
        return limites;
    }

    public void setLimites(double limites) {
        this.limites = limites;
    }
   
   
    public void fazerBarulho(){
        System.out.println("Animal fez barulho");
    }
   
    public void comer(String comida){
        System.out.println("Animal comeu comida");
    }
   
    public void dormir(){
        System.out.println("Animal dormiu");
    }
   
    public void vagar(){
        System.out.println("Animal vagou");
    }
    
    public String ToString(){
        return "Animal";
    }
}
