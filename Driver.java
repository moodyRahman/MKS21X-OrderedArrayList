import java.util.ArrayList;
public class Driver {
	public static void main(String args[]){
		NoNullArrayList<String> list=new NoNullArrayList<String>();//Creating arraylist
		list.add("Ravi");
		list.add(1, "Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(0, "Dejay");
		list.add("Devon");
		System.out.println(list);
		try {
			list.add(null);
		}catch (IllegalArgumentException e){
			System.out.println(".add(null) error caught!");
		}
		System.out.println(list);
		try {
			list.add(4, null);
		}catch (IllegalArgumentException e){
			System.out.println(".add(4, null) error caught!");
		}
		try {
			list.add(99, "aaaa");
		}catch (IndexOutOfBoundsException e){
			System.out.println("index error caught!");
		}

		System.out.println();

		System.out.println("--------");

		OrderedArrayList<String> olist = new OrderedArrayList<String>();
		olist.add("aware");
		olist.add("slit");
		olist.add("float");
		olist.add("lettuce");
		olist.add("ossified");
		olist.add("icy");

		System.out.println(olist);
	}
}
