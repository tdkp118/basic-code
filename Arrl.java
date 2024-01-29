package basic;

import java.util.ArrayList;
import java.util.List;

public class Arrl {

	public static void main(String[] args) {
		List x = new ArrayList <>();
		x.add("virat");
		x.add("50");
		x.add("@#%NTJ^$%");
		System.out.println(x.size());
		for (int i = 0;i<x.size();i++) {
			System.out.println(x.get(i));
		}

	}

}
