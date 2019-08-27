import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto= new String();
		String nombre,aPaterno,aMaterno,rfc;
		String fecha;
		String dd,mm,aa;
		int y;
		System.out.println("Introduce tu nombre completo");
		nombreCompleto=scanner.nextLine();
		nombre=nombreCompleto.substring(0,1);
		y=nombreCompleto.indexOf(" ");
		aPaterno=nombreCompleto.substring(y+1, y+3);
		y=nombreCompleto.lastIndexOf(" ");
		aMaterno=nombreCompleto.substring(y+1, y+2);
		//Fecha
		System.out.println("Escribe tu fecha de nacimiento de la forma dd/mm/aaaa");
		fecha=scanner.nextLine();
		y=fecha.indexOf("/");
		dd=fecha.substring(0,y);
		mm=fecha.substring(y+1, y+3);
		y=fecha.lastIndexOf("/");
		aa=fecha.substring(y+3, y+5);
		rfc=aPaterno+aMaterno+nombre+aa+mm+dd;
		rfc=rfc.toUpperCase();
		System.out.println(" El RFC de "+nombreCompleto+" es : "+rfc+"");
		
	}

}
