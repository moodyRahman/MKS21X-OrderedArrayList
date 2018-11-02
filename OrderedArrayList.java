public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
	public OrderedArrayList(){
		super();
	}

	public OrderedArrayList(int startCap){
		super(startCap);
	}

	public void add(T element){
		int temp;
		for (int x = 0; x < this.size(); x++){
			if (this.get(x).compareTo(element)>0){
				temp = x;
			}
		}
		super.add(temp, element);
	}
}
