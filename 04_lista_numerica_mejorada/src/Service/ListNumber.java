package Service;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer>{
	public Integer first() {
		return size()>0?get(0):null;
	}
	public Integer last() {
		return size()>0?get(size()-1):null;
	}
	public Integer sum() {
		int res=0;
		for(Integer num:this) {
			res+=num;
		}
		return res;
	}
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	@Override
	public void add(int index, Integer element) {
		if(!contains(element)) {
		super.add(index, element);
		}
	
	}
}
/*
Vamos a crear una clase, llamada ListNumber, para
manejar listas de números enteros.
La clase, heredará ArrayList<Integer>, e incorporará
las siguientes mejoras:

-Método first() que devuelve el primer elemento de la lista
-Método last() que devuelve el último elemento de la lista
(ambos devuelven null si la lista está vacía)
-Método sum() que devuelve la suma de todos 
los elementos de la lista

-No debe permitir añadir números ya existentes
*/