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
public class Ponto_Final_ExB extends Integral {
    @Override
    public double f1(double x){
     return Math.cos(x);
    }
    @Override
    public double f2(){
      return Math.sin(b) - Math.sin(a);
    }
}
