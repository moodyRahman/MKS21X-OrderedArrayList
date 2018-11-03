/**import java.util.ArrayList;

   public class Driver{
   public static void main(String[] args) {
   //NoNullArrayList<String> a = new NoNullArrayList<String>();
   ArrayList<String> b = new ArrayList(5);
   }
   }
 **/

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
