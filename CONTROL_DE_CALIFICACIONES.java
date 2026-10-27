import java.util.Scanner;
 public class CONTROL_DE_CALIFICACIONES{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int opcion = 0;
        int estudiante = 0;
        int evaluacion_1 = 0;
        int evaluacion_2 = 0;
        int evaluacion_3 = 0;

        System.out.println("=====================================");
        System.out.println("CONTROL DE CALIFICACIONES");
        System.out.println("=====================================");
        System.out.println("1. Registrar calificaciones");
        System.out.println("2. Mostrar estadísticas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");
        while(!sc.hasNextInt()) {
            System.out.println("Opcion no valida");
            sc.next();
            System.out.println("Ingrese un numero entero:");
        }
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion){
            case 1:
        System.out.println("=====================================");
        System.out.println("REGISTRAR ESTUDIANTE");
        System.out.println("=====================================");
        System.out.println("¿Cuántos estudiantes registrará?: ");
        while(!sc.hasNextInt()) {
            System.out.println("Opcion no valida");
            sc.next();
            System.out.println("Ingrese un numero entero:");
        }
        estudiante = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Estudiante 1");
        System.out.println("-------------------------------------");
        System.out.print("Nombre:");
        String nombre = sc.nextLine();
        System.out.print("Evaluación 1: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_1 = sc.nextInt();
                sc.nextLine();
        System.out.print("Evaluación 2: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.print("Ingrese un numero entero:");
                }
                evaluacion_2 = sc.nextInt();
                sc.nextLine();
        System.out.print("Evaluación 3: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_3 = sc.nextInt();
                sc.nextLine();
int promedio = (evaluacion_1 + evaluacion_2 + evaluacion_3)/3;
                System.out.println("promedio: " + promedio);
        System.out.println("Resultado: ");
        if(promedio >= 6 || promedio <= 10){
            System.out.println("Aprobado");
        }

                System.out.println("-------------------------------------");
                System.out.println("Estudiante 2");
                System.out.println("-------------------------------------");
                System.out.print("Nombre:");
                String nombre2 = sc.nextLine();
                System.out.print("Evaluación 1: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 2: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.print("Ingrese un numero entero:");
                }
                evaluacion_2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 3: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_3 = sc.nextInt();
                sc.nextLine();
                int promedio1 = (evaluacion_1 + evaluacion_2 + evaluacion_3)/3;
                System.out.println("promedio: " + promedio);
                System.out.println("Resultado: ");
                if(promedio1 >= 6 || promedio1 <= 10){
                    System.out.println("Aprobado");
                }
                System.out.println("-------------------------------------");
                System.out.println("Estudiante 3");
                System.out.println("-------------------------------------");
                System.out.print("Nombre:");
                String nombre4 = sc.nextLine();
                System.out.print("Evaluación 1: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 2: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.print("Ingrese un numero entero:");
                }
                evaluacion_2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 3: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_3 = sc.nextInt();
                sc.nextLine();
                int promedio2 = (evaluacion_1 + evaluacion_2 + evaluacion_3)/3;
                System.out.println("promedio: " + promedio);
                System.out.println("Resultado: ");
                if(promedio2 >= 6 || promedio2 <= 10){
                    System.out.println("Aprobado");
                }
                System.out.println("-------------------------------------");
                System.out.println("Estudiante 4");
                System.out.println("-------------------------------------");
                System.out.print("Nombre:");
                String nombre3 = sc.nextLine();
                System.out.print("Evaluación 1: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 2: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.print("Ingrese un numero entero:");
                }
                evaluacion_2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Evaluación 3: ");
                while(!sc.hasNextInt()) {
                    System.out.println("Opcion no valida");
                    sc.next();
                    System.out.println("Ingrese un numero entero:");
                }
                evaluacion_3 = sc.nextInt();
                sc.nextLine();
                int promedio3 = (evaluacion_1 + evaluacion_2 + evaluacion_3)/3;
                System.out.println("promedio: " + promedio);
                System.out.println("Resultado: ");
                if(promedio3 >= 6 || promedio3 <= 10){
                    System.out.println("Aprobado");
                }
        break;
            case 2:
                System.out.println("=====================================");
                System.out.println("ESTADÍSTICAS DEL GRUPO");
                System.out.println("=====================================");
                System.out.println("Estudiantes registrados: ");
                System.out.println("Estudiantes aprobados: ");
                System.out.println("Estudiantes reprobados: ");
                System.out.println("Promedio general: ");
                break;
            case 3:
                System.out.println("Gracias por su atencion");
                break;

        }

    }
}
