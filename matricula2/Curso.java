/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula2;

/**
 *
 * @author Aluno
 */
public class Curso {
    
    private String nome;
    private String periodo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Curso(String nome, String periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "\nNome do Curso: " + this.nome + "\nPeriodo do curso: " + this.periodo;
    }
    
    
    
}
