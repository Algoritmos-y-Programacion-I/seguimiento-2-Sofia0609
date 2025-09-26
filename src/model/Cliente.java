package model;

public class Cliente {
    
    private String nombre;
    private int edad;
    private String cedula;
    private Cuenta[] cuentas;

    public Cliente(String nombre, int edad, String cedula) {

        this.nombrebanco = nombrebanco;
        this.edad = edad;
        this.cedula = cedula;
        this.cuentas = new Cuenta[10];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombrebanco) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }


    public Cuenta[] getCuenta() {
        return cuentas;
    }

    public void setCuenta(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

}

     /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
    public Cuenta[] getCuentasList() {
        return cuentas;
    }



