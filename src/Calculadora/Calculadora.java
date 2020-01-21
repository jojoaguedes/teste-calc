package Calculadora;

public class Calculadora {
    public Double somar(Double n1, Double n2) {

        if(n1 == null || n2 == null) throw new NullPointerException();
        return n1 + n2;
    }

    public Double subtrair(Double n1, Double n2) {
        return  n1 - n2;
    }

    public Double multiplica(Double n1, Double n2) {
        return  n1 * n2;
    }

    public Double divide(Double n1, Double n2) {
        if(n1 == 0 || n2 == 0) throw new ArithmeticException();
        return  n1 / n2;
    }
}
