package WebdriverPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(71);
		marks.add(79);
		marks.add(67);
		marks.add(69);
		marks.add(97);
		
		Iterator<Integer> mar = marks.iterator();		
		while (mar.hasNext())
		{
			System.out.println(mar.next());
		}
	}

}
// Using List interface create object
