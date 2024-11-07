package InferenciaDeTipos;

import java.util.ArrayList;
import java.util.List;

public class Var {

    public static void main(String[] args) {
        var employee = new Employee(1L, "Employee", 4.1);

        //No recomendado
//        var salary = employee.salary();

        Double salary = employee.salary();
        //Ejemplo 2

        List<Employee> employees = new ArrayList<>();
        var employees2 = new ArrayList<Employee>();
        var employees3 = List.of(
                new Employee("emp1"),
                new Employee("emp2"),
                new Employee("emp3")

        );

    }
}
