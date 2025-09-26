package model;

public class BancoIcesiController {

     /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los requerimientos.
     */

    private Cliente[] clientes;

    public BancoIcesiController(int nclientes){
        clientes = new Cliente[nclientes]
    }

    public Cliente[] getCliente() {
        return clientes;
    }

    public void setCliente(Cliente[] clientes) {
        this.clientes = clientes;
    }

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los requerimientos.
     * Para cada metodo:
     *      Agregue los parametros y retorno que sean pertinentes.
     *      Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos.
     */
    public void agregarCuentaCliente() {

        for (int i = 0; i < clientes.legth; i++){
            if(clientes[i]) {
                clientes[i] = new clientes(nombre, edad, cedula);
            }
        }

    }


   
    public void depositarDineroCuenta() {

    }

    
    public void retirarDineroCuenta() {

    }

    public Cliente[] getClienteList() {

        return clientes;

    }

