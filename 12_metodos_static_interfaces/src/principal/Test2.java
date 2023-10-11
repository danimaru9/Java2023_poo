package principal;

import java.util.List;

class Datos{
	//Método que nos devuelva una lista con los 10 primeros nºs enteros
	public List<Integer> numeros(){
		/*ArrayList<Integer> lst=New ArrayList<>();
		 * for(int i=1;i<=10;i++)	{
		 * lst.add(i);
		 * }
		 * return lst;
		 */
		//return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //INMUTABLES
		Integer [] nums=new Integer[1000];
		for(int i=1;i<=1000;i++) {
			nums[i-1]=i;
		}
		return List.of(nums);
	}
}
public class Test2 {

	public static void main(String[] args) {
		Datos dt=new Datos();
		List<Integer> nums=dt.numeros();
		for(Integer n:nums) {
			System.out.println(n);
		}

	}

}
