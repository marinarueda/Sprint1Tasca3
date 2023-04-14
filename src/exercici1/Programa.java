package exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<>();

		months.add(new Month("Enero"));
		months.add(new Month("Febrero"));
		months.add(new Month("Marzo"));
		months.add(new Month("Abril"));
		months.add(new Month("Mayo"));
		months.add(new Month("Junio"));
		months.add(new Month("Julio"));
		//months.add(new Month("Agosto"));
		months.add(new Month("Septiembre"));
		months.add(new Month("Octubre"));
		months.add(new Month("Noviembre"));
		months.add(new Month("Diciembre"));

		//Permite determinar si el objeto está en la lista o no
		HashSet<Month> monthsSet = new HashSet<>(months);
				
		Month agosto = new Month("Agosto");
		//Month septiembre = new Month("Septiembre");

		int index = Collections.binarySearch(months, agosto);// si el objeto no está en la lista devuelvo valor negativo
		//System.out.println(index);
		byte posicionmonth = 8;
		
		
		if (index>=0) {
		    System.out.println("El elemento ya existe en la lista");
		} else {
		    index = posicionmonth - 1;
		    months.add(index, agosto);
		}

		// Recorrer la array con un for i
		for (Month month : months) {
			System.out.println(month.getName());
		}
		
		//Recorrer la array con un iterator
		/*ListIterator<Month> it = months.listIterator();
		while (it.hasNext()) {
		    System.out.println(it.next().getName());
		}*/
		
	}

}
