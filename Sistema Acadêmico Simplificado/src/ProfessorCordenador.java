/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ProfessorCordenador extends Professor{
    
    public ProfessorCordenador(String nome, int idade) {
        super(nome, idade);
    }
    
    double bonusCordenacao;

    @Override
    public double calcularIndicador() {
        return (super.calcularIndicador()) + bonusCordenacao;
    }
    
    
    
}
