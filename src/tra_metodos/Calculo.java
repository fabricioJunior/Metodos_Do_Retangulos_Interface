
package tra_metodos;
/**
 *
 * @author Fabricio Junior
 */
public interface Calculo {
   ///retorna o resultado do cálculo através do Método do Retângulo Composto 
   abstract double getResultadoRetanguloComposto();
   ///retorna o resultado através do método do retângulo composto pela esquerda
   abstract double getResultadoRetanguloComposto_Esquerda();
   ///retorna o resultado através do método do retângulo composto pela direita
   abstract double getResultadoRetanguloComposto_Direita();
   ///retorna o resultado através do método do retângulo pela esquerda
   abstract double getResultadoRetangulo_Esquerda();
   ///retorna o resultado através do método do retângulo pela direita
   abstract double getResultadoRetangulo_Direita();
   ///retorna o resultado através do método do ponto central
   abstract double getResultadoPontoCentral();
    ///retorna o resultado através do método do ponto central composto 
   abstract double getResultadoPontoCentralComposto();
   ///retorna o resultado real da integração feita
   abstract double getResultadoReal();
   ///define o intervalo de integração 
   abstract void setIntervalo(double a, double b);
   ///passa as constantes da função 
   abstract void setConstantes(double a,double b,double c);
   //passa o número de retangulos utilizados para calcular a integral
   abstract void setRetangulos(int n);
}
