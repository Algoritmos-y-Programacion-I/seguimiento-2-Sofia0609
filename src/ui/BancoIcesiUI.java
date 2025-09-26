package ui;

import java.util.Scanner;

public class BancoIcesiUI {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para conectar esta clase con el modelo.
     */

    int nclientes = 0;

    private Scanner input;
    private BancoIcesiController controller;

    public static void main(String[] args) {

        BancoIcesiUI ui = new BancoIcesiUI();
        ui.menu();

    }

    // Constructor
    public BancoIcesiUI() {
        input = new Scanner(System.in);
    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void menu() {

        System.out.println("Bienvenido a BancoIcesi");

        int option = 0;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("-".repeat(50));
            System.out.println("Digite alguna de las siguientes opciones");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Asignar cuenta bancaria a cliente");
            System.out.println("3) Depositar dinero en cuenta bancaria de un cliente");
            System.out.println("4) Retirar dinero de una cuenta bancaria de un cliente");
            System.out.println("5) Consultar cliente por numero de cedula");
            System.out.println("6) Consultar el saldo total de todas las cuentas");
            System.out.println("0) Salir del sistema");
            option = input.nextInt();

            switch (option) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    asignarCuentaBancariaCliente();
                    break;
                case 3:
                    depositarDineroCuenta();
                    break;
                case 4:
                    retirarDineroCuenta();
                    break;
                case 5:
                    consultarCliente();
                    break;
                case 6:
                    consultarSaldoTotal();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void registrarCliente() {

        System.out.println("Cuantos Clientes Desea Registrar?: ");
        nclientes = input.nextInt();
        input.nextLine(); 
        controller = new BancoIcesiController(nclientes);

        for (int i = 0; i < controller.getCliente().length; i++) {

            System.out.println("Por favor ingresa tu nombre " + (i + 1));
            String nombre = input.nextLine();

            System.out.println("Por favor ingresa tu edad" + (i + 1));
            int edad = input.nextInt();
            input.nextLine();
            
            System.out.println("Por favor su cedula " + (i + 1));
            String cedula  = input.nextLine();


            controller.agregarCuentaCliente(nombre, edad, cedula);
        }
    }

    public void asignarCuentaBancariaCliente() {

    }

    public void depositarDineroCuenta() {

    }

    public void retirarDineroCuenta() {

    }

    public void consultarCliente() {

    }

    public void consultarSaldoTotal() {

    }

}
