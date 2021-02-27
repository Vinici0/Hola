package ejecuccion;

import modelo.mundo.Estudiante;
import modelo.mundo.Empleado;
import modelo.mundo.Persona;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/////////////////////////////////
		//BORJA VINICIO
		/////////////////////////////////

		try {
			System.out.println("Ingrese le nombre");//BORJA VINICIO
			String nombre = sc.nextLine();

			System.out.println("digite su cédula");
			int cedula = sc.nextInt();
			sc.nextLine();

			Persona p1 = new Persona(nombre, cedula);
			System.out.println(p1.toString());

		} catch (NumberFormatException e) {
			System.out.println(e);
			;
		}

		catch (IllegalFormatException e) {
			System.out.println(e);//BORJA VINICIO
			;
		} catch (InputMismatchException e) {
			System.out.println(e);
			;
		}

		try {

			System.out.println("Ingrese el nombre");
			String nombreEst = sc.nextLine();
			//BORJA VINICIO
			System.out.println("Digite cedula");

			int cedulaEst = sc.nextInt();

			System.out.println("ingrese su id");
			sc.nextLine();

			String idEst = sc.nextLine();//BORJA VINICIO

			System.out.println("ingrese su e-mail");
			String email = sc.nextLine();

			System.out.println("ingrese su Carrera");//BORJA VINICIO
			String carreraEst = sc.nextLine();

			Estudiante e1 = new Estudiante(nombreEst, cedulaEst, idEst, email, carreraEst);
			System.out.println(e1.toString());

		} catch (NumberFormatException e) {
			System.out.println(e);//BORJA VINICIO
			;
		}

			///////////////////////////
		catch (IllegalFormatException e) {
			System.out.println(e);
			;//BORJA VINICIO
		} catch (InputMismatchException e) {
			System.out.println(e);
			;
		}
		///////////////////////////////////////
		

		try {

			System.out.println("NOmbre de Empleado");
			String nombreE1 = sc.nextLine();
			System.out.println("/nDigite cedula");
			int cedulaE1 = sc.nextInt();
			System.out.println("/nCargo del empleado");
			sc.nextLine();//BORJA VINICIO
			String cargoE1 = sc.nextLine();
			System.out.println("/nsueldo del empleado");
			double sueldoE1 = sc.nextDouble();
			Empleado em1 = new Empleado(nombreE1, cedulaE1, cargoE1, sueldoE1);
			System.out.println(em1.toString());

		} catch (NumberFormatException e) {//BORJA VINICIO
			System.out.println(e);
			;
		}

		catch (IllegalFormatException e) {
			System.out.println(e);
			;
		} catch (InputMismatchException e) {//BORJA VINICIO
			System.out.println(e);
			;
		}

	}

}
