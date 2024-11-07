package SwitchExpression;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Hoy es Lunes");
                break;
            case "Tuesdat":
                System.out.println("Hoy es Tuesday");
                break;
            default:
                System.out.println("Error");
        }

        switch (day) {
            case "Monday" -> System.out.println("Hoy es lunes");
            case "Tuesday" -> {
                System.out.println("Hoy es Tuesday1");
                System.out.println("Hoy es Tuesday2");
            }
            case "Webnesday" -> System.out.println("Hoy es jueves");
            default -> throw new IllegalAccessError("");
        }


    }
}
