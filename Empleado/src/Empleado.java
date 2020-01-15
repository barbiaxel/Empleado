import java.util.Scanner;

public class Empleado {

	//atributos
	private Scanner teclado;
	String nombre;
	float sueldo;
	
	public Empleado() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del empleado:");
		nombre = teclado.next();
		System.out.println("Introduce el sueldo:");
		sueldo = teclado.nextFloat();
	}
	
	public void pagaImpuestos() {
		if (sueldo > 3000) {
			System.out.println("Debe pagar impuestos.");
		} else {
			System.out.println("No debe pagar impuestos.");
		}
	}
	
	public void datosEmpleado() {
		System.out.println("El nombre del empleado es: " +nombre);
		System.out.println("El salario es de: " +sueldo);
	}
	
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		empleado1.pagaImpuestos();
		empleado1.datosEmpleado();
		
	}

}
