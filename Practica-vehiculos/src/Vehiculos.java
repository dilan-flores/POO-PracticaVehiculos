import java.util.Scanner;
public class Vehiculos {

    // ATRIBUTOS
    String marca;
    String modelo;
    String placa;
    String color;
    String kilometraje;
    int anio_fabricacion;

    Scanner entrada = new Scanner(System.in);

    //CONTRUCTOR
    public Vehiculos() {
        marca = "";
        modelo = "";
        placa = "";
        color = "";
        kilometraje = "";
        anio_fabricacion = 0;
    }
    //Menu de opciones
    int menu() {
        int op = -1;
        while ((op < 0) || ( op > 3)) {
            System.out.println("---------------------------------------");
            System.out.println("| BIENVENIDO AL REGISTRO DE VEHICULOS |");
            System.out.println("---------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Registrar vehiculos               |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Ver los vehiculos registrados     |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Salir                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if ((op < 0) || (op > 3)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }

    int menu_registro() {
        int op = -1;
        while ((op < 0) || ( op > 5)) {
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.print("Cantidad de vehiculos a registrar(MAX 5): ");
            op = entrada.nextInt();
            System.out.println("------------------------------------------");

            if ((op < 0) || (op > 5)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }

    //METODOS

    public void car1 (Vehiculos datos1){
        System.out.print("Ingrese la marca del vehiculo: ");
        datos1.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del vehiculo: ");
        datos1.setModelo(entrada.nextLine());
        System.out.print("Ingrese la placa del vehiculo: ");
        datos1.setPlaca(entrada.nextLine());
        System.out.print("Ingrese el color del vehiculo: ");
        datos1.setColor(entrada.nextLine());
        System.out.print("Ingrese el kilometraje del vehiculo: ");
        datos1.setKilometraje(entrada.nextLine());
        System.out.print("Ingrese el año de fabricacion del vehiculo: ");
        datos1.setAnio_fabricacion(entrada.nextInt());
    }

    public void car2 (Vehiculos datos2){
        System.out.print("Ingrese la marca del vehiculo: ");
        datos2.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del vehiculo: ");
        datos2.setModelo(entrada.nextLine());
        System.out.print("Ingrese la placa del vehiculo: ");
        datos2.setPlaca(entrada.nextLine());
        System.out.print("Ingrese el color del vehiculo: ");
        datos2.setColor(entrada.nextLine());
        System.out.print("Ingrese el kilometraje del vehiculo: ");
        datos2.setKilometraje(entrada.nextLine());
        System.out.print("Ingrese el año de fabricacion del vehiculo: ");
        datos2.setAnio_fabricacion(entrada.nextInt());
    }

    public void car3 (Vehiculos datos3){
        System.out.print("Ingrese la marca del vehiculo: ");
        datos3.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del vehiculo: ");
        datos3.setModelo(entrada.nextLine());
        System.out.print("Ingrese la placa del vehiculo: ");
        datos3.setPlaca(entrada.nextLine());
        System.out.print("Ingrese el color del vehiculo: ");
        datos3.setColor(entrada.nextLine());
        System.out.print("Ingrese el kilometraje del vehiculo: ");
        datos3.setKilometraje(entrada.nextLine());
        System.out.print("Ingrese el año de fabricacion del vehiculo: ");
        datos3.setAnio_fabricacion(entrada.nextInt());
    }

    public void car4 (Vehiculos datos4){
        System.out.print("Ingrese la marca del vehiculo: ");
        datos4.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del vehiculo: ");
        datos4.setModelo(entrada.nextLine());
        System.out.print("Ingrese la placa del vehiculo: ");
        datos4.setPlaca(entrada.nextLine());
        System.out.print("Ingrese el color del vehiculo: ");
        datos4.setColor(entrada.nextLine());
        System.out.print("Ingrese el kilometraje del vehiculo: ");
        datos4.setKilometraje(entrada.nextLine());
        System.out.print("Ingrese el año de fabricacion del vehiculo: ");
        datos4.setAnio_fabricacion(entrada.nextInt());
    }
    public void car5 (Vehiculos datos5){
        System.out.print("Ingrese la marca del vehiculo: ");
        datos5.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del vehiculo: ");
        datos5.setModelo(entrada.nextLine());
        System.out.print("Ingrese la placa del vehiculo: ");
        datos5.setPlaca(entrada.nextLine());
        System.out.print("Ingrese el color del vehiculo: ");
        datos5.setColor(entrada.nextLine());
        System.out.print("Ingrese el kilometraje del vehiculo: ");
        datos5.setKilometraje(entrada.nextLine());
        System.out.print("Ingrese el año de fabricacion del vehiculo: ");
        datos5.setAnio_fabricacion(entrada.nextInt());
    }

    public void impresion (Vehiculos datos1, Vehiculos datos2, Vehiculos datos3, Vehiculos datos4, Vehiculos datos5, int op_registro){

        if(op_registro >= 1) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 1er vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Marca: " + datos1.getMarca());
            System.out.println("Modelo: " + datos1.getModelo());
            System.out.println("Placa: " + datos1.getPlaca());
            System.out.println("Color: " + datos1.getColor());
            System.out.println("Kilometraje: " + datos1.getKilometraje());
            System.out.println("Año de Fabricación: " + datos1.getAnio_fabricacion());
        }if(op_registro >= 2) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 2do vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Marca: " + datos2.getMarca());
            System.out.println("Modelo: " + datos2.getModelo());
            System.out.println("Placa: " + datos2.getPlaca());
            System.out.println("Color: " + datos2.getColor());
            System.out.println("Kilometraje: " + datos2.getKilometraje());
            System.out.println("Año de Fabricación: " + datos2.getAnio_fabricacion());
        }if(op_registro >= 3) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 3er vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Marca: " + datos3.getMarca());
            System.out.println("Modelo: " + datos3.getModelo());
            System.out.println("Placa: " + datos3.getPlaca());
            System.out.println("Color: " + datos3.getColor());
            System.out.println("Kilometraje: " + datos3.getKilometraje());
            System.out.println("Año de Fabricación: " + datos3.getAnio_fabricacion());
        }if(op_registro >= 4) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 4to vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Marca: " + datos4.getMarca());
            System.out.println("Modelo: " + datos4.getModelo());
            System.out.println("Placa: " + datos4.getPlaca());
            System.out.println("Color: " + datos4.getColor());
            System.out.println("Kilometraje: " + datos4.getKilometraje());
            System.out.println("Año de Fabricación: " + datos4.getAnio_fabricacion());
        }if(op_registro >= 5) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 5to vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Marca: " + datos5.getMarca());
            System.out.println("Modelo: " + datos5.getModelo());
            System.out.println("Placa: " + datos5.getPlaca());
            System.out.println("Color: " + datos5.getColor());
            System.out.println("Kilometraje: " + datos5.getKilometraje());
            System.out.println("Año de Fabricación: " + datos5.getAnio_fabricacion());
        }
    }

    //SETTER AND GETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String combustible) {
        this.kilometraje = combustible;
    }
}