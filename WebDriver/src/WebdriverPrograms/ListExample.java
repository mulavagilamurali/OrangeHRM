package WebdriverPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List info = new ArrayList();
		info.add(100);info.add("Sravan");info.add("Employee");
		//System.out.println(info);
		System.out.println("********************************************");
		for (int i=0; i<info.size();i++) {
			System.out.println(info.get(i));
		}
		
		System.out.println("********************************************");
		for (Object x:info) {
			System.out.println(x);
		}
		System.out.println("********************************************");
		Iterator ir = info.iterator();
		while(ir.hasNext()) {
			Object id = ir.next();
			System.out.println(id);
					
		}
	}

	

}
//Next it will print the values

//hasNext() it will check whether values are there or not True/Fals
// List is interface
// 