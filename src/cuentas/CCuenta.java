package cuentas;

/**
 *
 * @author David
 * Esta clase se encarga de gestionar los objetos del tipo CCuenta. 
 * Tiene los metodos y atributos necesarios. 
 */

public class CCuenta {

/**
 *el nombre de la cuenta
 */
    private String nombre;
    /**
     * el numero de la cuenta
     */
    private String cuenta;
    /**
     * el saldo de la cuenta
     */
    private double saldo;
    /**
     * el tipo de interes
     */
    private double tipoInteres;
/**
 * public Ccuenta () es el contructor por defecto de la clase. 
 */
    public CCuenta()
    {
    }
/**
 * 
 * @param nom
 * Es el nombre de la cuenta
 * @param cue
 * Es el numero de la cuenta pero como string. 
 * @param sal
 * Es el saldo de la cuenta
 * @param tipo
 * Es el tipo de interes aplicado a la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return devuelve el nombre de la cuenta
 */
    private String getNombre() {
		return nombre;
	}
/**
 * 
 * @return devuelve el numero de la cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * @return devuelve el saldo de la cuenta
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * 
 * @return devuelve el tipo de interes
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**
 * @param nombre nuevo nombre y lo cambia
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @param cuenta nuevo numero de cuenta y lo establece
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @param saldo recibe el saldo y lo establece en el objeto
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @param tipoInteres recibe el tipo de interes y lo establece en el objeto. 
 *
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
/**
 *
 * @return devuelve el saldo actual de la cuenta
 */
	public double estado()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad cantidad de dinero que se va a ingresar
 * @throws Exception lanza una exception si la cantidad es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad cantidad que se va a retirar
 * @throws Exception lanzada una exception si la cantidad es mayor al saldo. 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
