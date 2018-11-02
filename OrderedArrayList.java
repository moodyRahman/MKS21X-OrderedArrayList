public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
	public OrderedArrayList(){
		super();
	}

	public OrderedArrayList(int startCap){
		super(startCap);
	}

	public void add(T element){
		super.add(element);
	}
}
