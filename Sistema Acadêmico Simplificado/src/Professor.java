/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    private int horasAula;
    private double valorHora;
    
    
    @Override
    public double calcularIndicador() {
        return this.horasAula * this.valorHora;
    }

    @Override
    public String exibirDados() {
        return "Nome: " + super.getNome() + "\nIdade: " + super.getIdade() +
                "\nSalario: " + calcularIndicador();
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
    
}
