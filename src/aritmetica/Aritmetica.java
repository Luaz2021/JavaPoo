package aritmetica;

public class Aritmetica {

    int operando1;
    int operando2;

    // Constructor Vacio
    public Aritmetica() {

    }

    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar() {
        int resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar() {
        int resultado = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

}
