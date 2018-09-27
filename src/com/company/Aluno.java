package com.company;

public class Aluno {
    private String nome;
    private String rga;
    private Prova prova1;
    private Prova prova2;

    public Aluno(String n, String r, Prova p1, Prova p2){
        nome = n;
        rga = r;
        prova1 = p1;
        prova2 = p2;
    }

    public double mediaAluno(){
        double notaAluno = (this.prova1.calculaNota() + this.prova2.calculaNota())/2;
        return notaAluno;
    }

}
