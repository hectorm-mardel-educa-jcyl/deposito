package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        /* He añadido el parámetro "operacion" para que se indique el tipo de operacion a realizar,
        ya que si dejo que se ejecuten ambas operaciones de retirar e ingresar
        con el nuevo parámetro "cantidad" en ambas operaciones en la misma llamada,
        se retiraría la cantidad y luego se ingresaría la misma sin cambiar el saldo,
        y no tendría mucho sentido. He añadido ambos parámetros a través de:
        Refactor > Change Method Signature... */
        operativa_cuenta(cuenta1, 2300, "retirar");
        operativa_cuenta(cuenta1, 695, "ingresar");
    }

	private static void operativa_cuenta(CCuenta cuenta, float cantidad, String operacion) {
		if (operacion.equals("retirar")) {
			try {
				cuenta.retirar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al retirar");
			}			
		}
		else if (operacion.equals("ingresar")) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta.ingresar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al ingresar");
			}			
		}
	}
}
