package model;

import java.util.ArrayList;

public class Professor {


    private String Nome;
    private String Materia;
    private ArrayList<Professor> Professores;

    public Professor(){
        this.Professores =new ArrayList<Professor>();
    }
    public Professor(String nome,String materia){
        this.Nome = nome;
        this.Materia = materia;
    }
    public String getNome(){
        return this.Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getMateria(){
        return this.Materia;
    }
    public void setMateria(String materia) { this.Materia = materia;}

    public ArrayList<Professor> getProfessores(){
        return this.Professores;
    }
    public void setProfessores(Professor professor){
        this.Professores.add(professor);
    }
}
