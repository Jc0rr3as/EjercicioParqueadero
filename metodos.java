import java.util.Scanner;
public class metodos {
    public parqueadero[][] ingresarVehiculo(parqueadero[][] p, Scanner sc) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if(p[i][j] == null){
                    System.out.println("Ingrese la placa del vehículo:");
                    String placa = sc.nextLine();
                    System.out.println("Ingrese el nombre delpropietario:");
                    String propietario = sc.nextLine();
                    System.out.println("Ingrese el tipo de vehículo (carro/moto):");
                    String tipoVehiculo = sc.nextLine();
                    System.out.println("Ingrese el plan (mensual/quincenal/trimestral):");
                    String plan = sc.nextLine();
                    System.out.println("Ingrese el valor del plan:");
                    double valorPlan = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingrese el descuento:");
                    double descuento = Double.parseDouble(sc.nextLine());
                    p[i][j] = new parqueadero(placa, propietario, tipoVehiculo, plan, valorPlan, descuento);
                }
            }
        }
        return p;
    }
    public void carrosRegistrados(parqueadero[][] p) {
        int contadorCarros = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j].getTipoVehiculo().equalsIgnoreCase("carro")) {
                    contadorCarros++;
                }
            }
        }
        System.out.println("Número de carros registrados: " + contadorCarros);
    }
    public void motosRegistradas(parqueadero[][] p) {
        int contadorMotos = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j].getTipoVehiculo().equalsIgnoreCase("moto")) {
                    contadorMotos++;
                }
            }
        }
        System.out.println("Número de motos registradas: " + contadorMotos);
    }
    public void mostrarPropietarios(parqueadero[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j] != null) {
                    System.out.println("Lista de propietarios:");
                    System.out.println("- " + p[i][j].getPropietario());
                    System.out.println("--------------------");
                }
            }
        }
    }
    public void planesContratados(parqueadero[][] p) {
        int contadorMensual = 0;
        int contadorQuincenal = 0;
        int contadorTrimestral = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j] != null) {
                    switch (p[i][j].getPlan()) {
                        case "mensual":
                            contadorMensual++;
                            break;
                        case "quincenal":
                            contadorQuincenal++;
                            break;
                        case "trimestral":
                            contadorTrimestral++;
                            break;
                    }
                }
            }
        }
        System.out.println("Planes contratados:");
        System.out.println("- Mensual: " + contadorMensual);
        System.out.println("- Quincenal: " + contadorQuincenal);
        System.out.println("- Trimestral: " + contadorTrimestral);
    }
    public void mostrarValorTotal(parqueadero[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j] != null) {
                    System.out.println("Valor total a pagar por el vehículo con placa " + p[i][j].getPlaca() + ": " + p[i][j].getValorTotal());
                }
            }
        }
    }

        public void totalRecaudado(parqueadero[][] p) {
            double totalRecaudado = 0;
            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < p.length; j++) {
                    if (p[i][j] != null) {
                        totalRecaudado += p[i][j].getValorTotal();
                    }
                }
            }
            System.out.println("Total recaudado: " + totalRecaudado);
        }
}
