package WebdriverPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set sd = new HashSet();
		sd.add(123);
		sd.add("Sachin");
		sd.add(9854);

		sd.add(123);
		sd.add("Sehwag");
		sd.add(9854);
		
		System.out.println(sd);
		List info = new ArrayList(sd);
		for(int i=0; i<info.size();i++) {
			System.out.println(info.get(i));
		}
		
	}

}


// Interface = Set
// Class = Hashset()
// Interface = List - To get the values
// Class = ArrayList
