package model;

public class Cuenta {

    private String nombrebanco;
    private TipoCuenta tipo;
    private Double saldoactual;
    
    public Cuenta(String nombrebanco, TipoPokemon tipo, Double saldoactual) {
        this.nombrebanco = nombrebanco;
        this.tipo = tipo;
        this.saldoactual = saldoactual;
    
    }

    public String getNombreBanco() {
        return nombrebanco;
    }

    public void setNombreBanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public String getSaldoActual() {
        return saldoactual;
    }

    public void setSaldoActual(Double saldoactual) {
        this.saldoactual = saldoactual;
    }

}
