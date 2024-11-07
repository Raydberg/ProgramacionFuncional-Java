package InferenciaDeTipos;

/**
 * Crea objetos inmutables
 */
public record Employee(Long id, String name, Double salary) {

    public Employee(String name, Double salary) {
        this(null, name, salary);
    }

    public Employee(String name) {
        this(null, name, 0.0);
    }
}
