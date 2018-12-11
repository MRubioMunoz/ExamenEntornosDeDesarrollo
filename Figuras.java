package miguelRubioMunoz;
import java.util.*;

public class Figuras {
	
	private double base;
	private double altura;
	private double baseTrapecio;
	private boolean salir = false;
	
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBaseTrapecio() {
		return baseTrapecio;
	}
	
	public void setBaseTrapecio(double baseTrapecio) {
		this.baseTrapecio = baseTrapecio;
	}
	
	Figuras(){
		
	}
	
	public boolean comprobarLadoPositivoTriangulo() {
		if(base <= 0.0 || altura <= 0.0) {
			return false;
			
		}else {
			return true;
		}
	}
	
	public boolean comprobarBaseTrapecio() {
		if(baseTrapecio == base) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean comprobarBaseYAlturaRectangulo() {
		if(base <2.0 || base >10 && altura <2.0 || altura >10) {
			return false;
		}else {
			return true;
		}
	}
	
	public double calcularAreaRectangulo() {
		return base*altura;
	}
	
	public double calcularAreaTriangulo() {
		return (base*altura)/2;
	}
	
	public double calcularAreaTrapecio() {
		return altura *(base+baseTrapecio)/2;
	}
	
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		while(!salir) {
		System.out.println("Elija de que figura quiere calcular su area: ");
		System.out.println("1. Calcular area de un rectangulo");
		System.out.println("2. Calcular area de un triangulo");
		System.out.println("3. Calcular area de un trapecio");
		System.out.println("Para salir pulse cualquier numero distinto a los anteriores.");
		
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Valor de la base");
			setBase(sc.nextDouble());
			System.out.println("Valor de la altura");
			setAltura(sc.nextDouble());
			if(comprobarBaseYAlturaRectangulo()) {
			System.out.printf("El area del rectangulo es: %.2f\n",calcularAreaRectangulo());
			}else {
				System.out.println("La base y altura del rectangulo deben estar comprendidas entre 2 y 10");
			}
			break;

		case 2:
		System.out.println("Valor de la base");
		setBase(sc.nextDouble());
		System.out.println("Valor de la altura");
		setAltura(sc.nextDouble());
		if(comprobarLadoPositivoTriangulo()) {
			System.out.printf("El area del triangulo es: %.2f\n",calcularAreaTriangulo());
			}else {
				System.out.println("El triangulo no puede tener ningun lado negativo");
			}
		
			break;
			
		case 3:
			System.out.println("Valor de la base");
			setBase(sc.nextDouble());
			System.out.println("Valor de la segunda base");
			setBaseTrapecio(sc.nextDouble());
			if(comprobarBaseTrapecio()) {
			System.out.println("Valor de la altura");
			setAltura(sc.nextDouble());
			System.out.printf("El area del trapecio es: %.2f\n",calcularAreaTrapecio());
			}else {
				System.out.println("Las bases del trapecio tienen que ser distintas");
			}
				break;
			
		default:
			salir = true;
			System.out.println("¡Hasta pronto!");
			sc.close();
			break;
		}
		
		}
		}
}
