package com.company;

public class Main {

    public static void main(String[] args) {
        Turma turma = new Turma("POO", "SI");
        //aluno1
        Prova prova1Aluno1 = new Prova(1, 1, 1, 1, 1);
        Prova prova2Aluno1 = new Prova(2, 2, 2, 2, 2);
        Aluno aluno1 = new Aluno("leandro", "01111234", prova1Aluno1, prova2Aluno1);
        turma.addAluno(aluno1);

        //aluno2
        Prova prova1Aluno2 = new Prova(1, 1, 1, 1, 1);
        Prova prova2Aluno2 = new Prova(2, 2, 2, 2, 2);
        Aluno aluno2 = new Aluno("josé", "241214114", prova1Aluno2, prova2Aluno2);
        turma.addAluno(aluno2);

        System.out.println("A média da turma é: " + turma.mediaTurma());

    }
}
