package org.PAB2020.fibonacci;

public class Fibonacci {

    int bbact = 0;
    int bbprevio = 0;
    int adlt = 0;

    public int compute(int n, int k){
        int rabbitTot;
        if (n < 1){
            throw new RuntimeException("Nº de meses incorrecto.");
        }
        else if (n ==1){
            bbact = 1;
            adlt = 0;
            return rabbitTot = bbact + adlt;
        }
        else{
            int bbprevio = 1;
            for (int i = 1; i < n; i++) {
                bbact = adlt * 3;
                adlt = adlt + bbprevio;
                bbprevio = bbact;
            }
            return rabbitTot = bbact + adlt;
        }
    }

}
