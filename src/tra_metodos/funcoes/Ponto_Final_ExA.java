/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra_metodos.funcoes;

/**
 *
 * @author Fabricio Junior
 */
public class Ponto_Final_ExA extends Integral {

    @Override
    public double f1(double x) {
        return (double) Math.sqrt(x) + 1;
    }
    @Override
    public double f2() {
        double raiz = Math.sqrt(b*b*b);
        double extremo_B =  ( (2*raiz/3) + b) ;
        double raiz2 = Math.sqrt(a*a*a);
        double extremo_A =  ( (2*raiz2/3) + a) ;
        return extremo_B - extremo_A;
    }
}
