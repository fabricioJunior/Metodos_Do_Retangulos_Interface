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
public class Calculo_Segundo_Grau extends Integral  {
   
    ///Sobrescrevendo equação linear por uma de segundo grau
    @Override
    public double f1(double x){
        /// y = ax^2 + bx + c
        double resultado = (double)  (constante_a * (x*x)) + constante_b * x + constante_c;
        return  resultado;
    }
    ///Sobrescrevendo resultado 
    //2.0
    @Override
    public double f2(){
      double Extremo_b = (double)  ((constante_a * b * b * b) / 3) + ((constante_b * b * b) / 2) + (constante_c * b);//2.1
      double Extremo_a = (double)  ((constante_a * a * a * a) / 3) + ((constante_b * a * a) / 2) + (constante_c * a);//2.2
      return Extremo_b - Extremo_a;//2.3
    }
    
}
