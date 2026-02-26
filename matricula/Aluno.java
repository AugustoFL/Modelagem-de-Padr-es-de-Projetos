/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author Aluno
 */
public class Aluno {

        private String nome;
        private Curso curso;
        private Disciplina disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno(String nome, Curso curso, Disciplina disciplina) {
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "\nNome do Aluno: " + this.nome + "\n\nCurso: " + this.curso + "\n\nDisciplina: " + this.disciplina;
    }
        
        

    
}
