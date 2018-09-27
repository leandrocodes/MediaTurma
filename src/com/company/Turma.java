package com.company;

import java.util.LinkedList;

public class Turma {
    private String nome;
    private String curso;
    private LinkedList<Aluno> listaAluno;

    public Turma(String n, String c){
        curso = c;
        nome = n;
        listaAluno = new LinkedList<Aluno>();
    }

    public void addAluno(Aluno a){
        listaAluno.add(a);
    }

    public double mediaTurma(){
        double mediaTotal = 0;

        for (int i = 0; i < listaAluno.size(); i++){
            Aluno aluno = listaAluno.get(i);
            double nota = aluno.mediaAluno();
            mediaTotal += nota;
        }

        return mediaTotal/listaAluno.size();
    }

}
