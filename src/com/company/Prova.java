package com.company;

public class Prova {
    private double questao1;
    private double questao2;
    private double questao3;
    private double questao4;
    private double questao5;

    public Prova (double q1, double q2, double q3, double q4, double q5){
        questao1 = q1;
        questao2 = q2;
        questao3 = q3;
        questao4 = q4;
        questao5 = q5;
    }


    public double calculaNota(){
        double notaprova = (questao1 + questao2 + questao3 + questao4 + questao5) / 5;
        return notaprova;
    }
}
