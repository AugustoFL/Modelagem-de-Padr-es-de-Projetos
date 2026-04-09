/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {

    private double nota1;      
    private double nota2;
    private double nota3;

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public double calcularIndicador() {        
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
    
    @Override
    public String exibirDados(){
        
        return "Nome: " + super.getNome() + "\nIdade: " + super.getIdade() +
                "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2
                + "\nNota 3: " + this.nota3 + "\nMedia: " + calcularIndicador();
        
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
}
