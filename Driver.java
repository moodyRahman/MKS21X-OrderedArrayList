import java.util.ArrayList;
public class Driver {
	public static void main(String args[]){
		NoNullArrayList<String> list=new NoNullArrayList<String>();//Creating arraylist
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		System.out.println(list);
	}
}
