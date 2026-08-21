import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        System.out.println("Bienvenido al sistema de parqueadero");
        System.out.println("Ingrese los parqueaderos disponibles para cada tipo de vehículo");//Estoy asumiendo que ambos vehículos tienen la misma cantidad de parqueaderos disponibles.
        int columnas = Integer.parseInt(sc.nextLine());
        parqueadero[][] parqueaderos = new parqueadero[2][columnas];
        boolean continuar = true;
        while (continuar) {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Mostrar carros registrados");
        System.out.println("3. Mostrar motos registradas");
        System.out.println("4. Mostrar propietarios");
        System.out.println("5. Mostrar planes contratados");
        System.out.println("6. Mostrar valor total a pagar");
        System.out.println("7. Mostrar total recaudado");
        System.out.println("8. Salir");
        System.out.println("-----------------------");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                parqueaderos = m.ingresarVehiculo(parqueaderos, sc);
                break;
            case 2:
                m.carrosRegistrados(parqueaderos);
                break;
            case 3:
                m.motosRegistradas(parqueaderos);
                break;
            case 4:
                m.mostrarPropietarios(parqueaderos);
                break;
            case 5:
                m.planesContratados(parqueaderos);
                break;
            case 6:
                m.mostrarValorTotal(parqueaderos);
                break;
            case 7:
                m.totalRecaudado(parqueaderos);
                break;
            case 8:
                continuar = false;
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
        }

        }
    }
