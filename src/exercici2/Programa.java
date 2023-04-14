package exercici2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		lista1.add(4);
		lista1.add(6);
		lista1.add(25);
		lista1.add(78);

        // Creem un ListIterator per llegir la primera llista i inserir els elements a la segona en ordre invers
        ListIterator<Integer> it = lista1.listIterator(lista1.size());
        while (it.hasPrevious()) {
            int numero = it.previous();
            lista2.add(numero);
        }

        
        System.out.println("Llista 1: " + lista1);
        System.out.println("Llista 2: " + lista2);
    
	}

}
