package model;

import java.util.ArrayList;

public class Aluno {
    private String Nome;
    private float AV1;
    private float AV2;
    private ArrayList<Aluno> Alunos;

    public Aluno(){
        this.Alunos = new ArrayList<Aluno>();
        //this.setAlunos(new Aluno("Andressa", 4.4f, 3.3f));
        //this.setAlunos(new Aluno("Pedro", 5.9f, 4.2f));
    }

    public Aluno(String nome, float av1, float av2){
        this.Nome = nome;
        this.AV1 = av1;
        this.AV2 = av2;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public float getAV1(){
        return this.AV1;
    }

    public void setAV1(float av1){
        this.AV1 = av1;
    }

    public float getAV2(){
        return this.AV2;
    }

    public void setAV2(float av2){
        this.AV2 = av2;
    }

    public ArrayList<Aluno> getAlunos(){
        return this.Alunos;
    }

    public void setAlunos(Aluno aluno){
        this.Alunos.add(aluno);
    }
}
