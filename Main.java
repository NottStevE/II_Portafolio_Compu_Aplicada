package scl.edu.gt;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/*INSTANCIAS DE CLASE*/
		CommandList commandData = new CommandList();
		Help help = new Help();
		Sistemas sistemas = new Sistemas();
		ArithmeticFunctions resultado = new ArithmeticFunctions();
		
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		Img txt = new Img();
		txt.Mensaje();
		
		
		Scanner User = new Scanner(System.in);
		System.out.println("");
		System.out.print("Usuario: ");
		String UserName = User.nextLine();
		
		
		System.out.println("");
		System.out.println("|Coloca el comando ~help para encontrar información|"
				+ "\n|sobre los comandos del programa|");
		
		
		/*VARIABLE PARA DETENER EL PROGRAMA*/
		boolean bucle = true;
		
		
		/*BUCLE DEL PROGRAMA*/
				
		
			do{
				Scanner inputCommand = new Scanner(System.in);
				System.out.println("");
				System.out.print("C:\\Users\\"+UserName+"> ");
				String output = inputCommand.nextLine();
				
				if(output.equals(commandData.command[0])){
					resultado.suma();
				}else if(output.equals(commandData.command[1])) {
					resultado.resta();
				}else if(output.equals(commandData.command[2])) {
					resultado.division();
				}else if(output.equals(commandData.command[3])) {
					resultado.multiplicacion();
				}else if(output.equals(commandData.command[4])) {
					resultado.residuo();
				}else if(output.equals(commandData.command[5])){
					help.CommandList();
				}else if(output.equals(commandData.command[6])) {
					bucle = false;
				}else if(output.equals(commandData.sistemas[0])) {
					sistemas.Bios();
				}else if(output.equals(commandData.sistemas[1])) {
					sistemas.Kernel();
				}else if(output.equals(commandData.sistemas[2])) {
					sistemas.CPU();
				}else if(output.equals(commandData.sistemas[3])) {
					sistemas.Hardward();
				}else if(output.equals(commandData.sistemas[4])) {
					sistemas.Software();
				}else{
					System.out.println("No se ha encontrado el comando: "+"~"+output+".");
					System.out.println("Ingresa el comando ~help para ver toda la información sobre los comandos disponibles.");
				}
			}while(bucle);
				
			
		System.out.println("El programa ha finalizado");

	}

}
