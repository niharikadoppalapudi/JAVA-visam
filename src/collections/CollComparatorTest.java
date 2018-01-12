package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.vism.Data;

public class CollComparatorTest {

	public static void main(String args[]) {
		Data d = new Data();
		Data d1 = new Data();
		Data d2 = new Data();
		d.setAge(10);
		d1.setAge(20);
		d2.setAge(30);

		List<Data> dataList = new ArrayList<Data>();

		Set<Data> dataSet = new HashSet<>();

		dataSet.add(d);
		dataSet.add(d1);
		dataSet.add(d2);

		dataList.add(d1);
		dataList.add(d2);
		dataList.add(d);

		
		Collections.sort(dataList, new DataAgeComparator());
		
		//System.out.println("Before Sorting : List Data is :  " + dataList.get(0) + "," + dataList.get(1) + "," + dataList.get(2));
		
		Set<Data> set = new TreeSet<Data>(new DataAgeComparator());
		set.add(d1);
		set.add(d);
		set.add(d2);
		
		Iterator<Data> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println("Data.."+((Data)itr.next()).getAge());
		}
		
		//System.out.println("After sorting List Data is : " + set. + "," + set.get(1) + "," + set.get(2));
		
		
		
	}

}
