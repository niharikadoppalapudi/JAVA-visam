package collections;

import java.util.Comparator;

import com.vism.Data;

public class DataAgeComparator implements Comparator<Data> {

	@Override
	public int compare(Data arg0, Data arg1) {

		Data d1= (Data)arg0;
		
		Data d2= (Data)arg1;
		
		if(d1.getAge().equals(d2.getAge()))
			return 0;
		else if (d1.getAge()> (d2.getAge()))
			return 1;
		else
			return -1;
	}


}
