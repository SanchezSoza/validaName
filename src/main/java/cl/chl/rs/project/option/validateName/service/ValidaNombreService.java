package cl.chl.rs.project.option.validateName.service;

public class ValidaNombreService {

	public String validaNombre(String nombre) {
		
		String nombreAux = "";
		String [] array = null;
		array = nombre.split(" ");
		if(array.length > 0) {
			for(int i=0; i< array.length; i++) {
				if(nombreAux.equalsIgnoreCase("")) {
					nombreAux = Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1).toLowerCase();
				}else{
					nombreAux = nombreAux + " " + Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1).toLowerCase();
				}
			}
		}
		return nombreAux; 
	}
}
