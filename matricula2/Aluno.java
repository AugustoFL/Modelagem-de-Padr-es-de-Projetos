/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula2;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Aluno {

        private String nome;
        private Curso curso;
        private ArrayList<Disciplina> disciplinas;

     public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
    }   
        
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
    public void removerDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    @Override
    public String toString() {
        return "\nNome do Aluno: " + this.nome + "\n\nCurso: " + this.curso + "\n\nDisciplina: " + this.disciplinas;
    }
        
        

    
}
