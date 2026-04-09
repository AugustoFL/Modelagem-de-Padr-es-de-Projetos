/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class AlunoBolsista extends Aluno{
    
    public AlunoBolsista(String nome, int idade, double porcentualBolsa) {
        super(nome, idade);
        this.porcentualBolsa = porcentualBolsa;
    }
    
    double porcentualBolsa;

    @Override
    public double calcularIndicador() {
        return super.calcularIndicador() + (porcentualBolsa / 100);
    }
    
    
    
    
}
