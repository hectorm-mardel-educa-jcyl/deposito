package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones sobre la misma.
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa los atributos de la cuenta.
     * @param nom Nombre del titular
     * @param cue Número de la cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo actual.
     * @return Saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar
     * @throws Exception Arroja una excepción si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad Cantidad a retirar
     * @throws Exception Arroja una excepción si la cantidad es menor o igual a 0, o es mayor al saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el tipo de interés de la cuenta.
     * @return Tipo de interés
     */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Almacena el tipo de interés de la cuenta.
	 * @param tipoInterés Nuevo tipo de interés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo actual de la cuenta.
	 * @return Saldo actual
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Almacena el nuevo saldo.
	 * @param saldo Nuevo saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el número de cuenta.
	 * @return Número de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Almacena el nuevo número de cuenta.
	 * @param cuenta Nuevo número de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el nombre del titular de la cuenta.
	 * @return Nombre del titular
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Almacena el nuevo nombre del titular de la cuenta.
	 * @param nombre Nuevo nombre del titular
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
