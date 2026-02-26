package exer1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getMarca (){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo () {
        return this.modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno () {
        return this.ano;
       
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public void exibirInfo () {
        System.out.println("Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nAno: " + this.getAno());
    }
}
