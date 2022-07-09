package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> list=new ArrayList<Laptop>();
		
		list.add(new Laptop("Acer", 25000, 2));
		list.add(new Laptop("Apple", 95000, 4));
		list.add(new Laptop("Lenovo", 35000, 4));
		list.add(new Laptop("Dell", 65000, 8));
		list.add(new Laptop("Hp", 60000, 8));
		list.add(new Laptop("Asus", 28000, 2));
		
		Comparator<Laptop> com=new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice() < o2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(list, com);
		
		for(Laptop l : list) {
			System.out.println(l);
		}
		

	}

}
