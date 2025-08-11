package Lambdans;

@FunctionalInterface
public interface MyFunInterface {
    //metodo abstracto
    //Unico para que sea una interfaz funcional
//    public abstract void myMethod();
    void myMethod();

    /**
     * Pero puede aceptar mas metodos
     * Static , Default y Privados
     */
    default int sumar(int a, int b) {
        return a + b;
    }

    static int cero() {
        return 0;
    }

    private int resta(int a, int b) {
        return a - b;
    }
}
