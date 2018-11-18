/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra_metodos.funcoes;

import tra_metodos.Calculo;

/**
 * Classe com métodos de integração por retângulos
 *
 * @author Fabricio Junior
 */
public class Integral implements Calculo {

    ///Variáveis do intervalo
    protected double a;
    protected double b;
    ///Variáveis das equações 
    protected double constante_a;
    protected double constante_b;
    protected double constante_c;
    ///Variável quantitativa de retângulos 
    protected int n;

    @Override
    public double getResultadoRetanguloComposto() {
        double h = (double) ((b - a) / n);
        double I = 0;

        for (int x = 1; x <= n; x++) {
            I += h * f1(x);
        }
        return I;
    }
    @Override
    public double getResultadoPontoCentral() {
        double f = f1((a + b) / 2);
        return (double) f * (b - a);
    }
    @Override
    public double getResultadoRetangulo_Esquerda() {
        double resultado = (double) f1(a) * (b - a);
        return resultado;
    }
    @Override
    public double getResultadoRetangulo_Direita() {
        double resultado = (double) f1(b) * (b - a);
        return resultado;
    }
    @Override
    public double getResultadoPontoCentralComposto() {
        double h = (double) ((b - a) / n);
        double I = 0;

        for (int x = 0; x < n; x++) {
            double Xn = (double) a + x * h;
            double Xn1 = (double) a + (x + 1) * h;
            I += h * f1((double) (Xn + Xn1) / 2);
        }
        return I;
    }
    @Override
    public double getResultadoReal() {
        return f2();
    }
    @Override
    public void setIntervalo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getResultadoRetanguloComposto_Direita() {
        double h = (double) ((b - a) / n);
        double I = 0;
        for (int x = 1; x <= n; x++) {
            double Xn = (double) a + (h * x);
            I += f1(Xn);
        }
        return I * h;
    }
    @Override
    public double getResultadoRetanguloComposto_Esquerda() {
        double h = (double) ((b - a) / n);
        double I = 0;
        for (int x = 0; x < n; x++) {
            double Xn = (double) a + (h * x);
            I += f1(Xn);
        }
        return I * h;

    }
    ///retorna o valor de f(x) de uma equação linear 
    ///Função utilizada em todos os métodos de integração 
    ///Sobrescrever essa função por outra, resulta na mudança da função que está sendo integrada 
    protected double f1(double x) {
        ///y = ax+b;
        double resultado = (double) Math.sqrt(x) + 1;
        return resultado;
    }
    ///retorna o resultado exato de uma função linear y = ax+b
    ///1.0
    protected double f2() {
        double Extremo_a = (double) ((constante_a * (a * a)) / 2) + (constante_b * a);///1.1
        double Extremo_b = (double) ((constante_a * (b * b)) / 2) + (constante_b * b);///1.2
        return (double) Extremo_b - Extremo_a;///1.3
    }
    @Override
    public void setConstantes(double a, double b, double c) {
        this.constante_a = a;
        this.constante_b = b;
        this.constante_c = c;
    }
    @Override
    public void setRetangulos(int n) {
        this.n = n;
    }

}
