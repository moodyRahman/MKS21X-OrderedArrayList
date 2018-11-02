public class NoNullArrayList<T> extends ArrayList<T>{
	public NoNullArrayList(){
		super();
	}

	public NoNullArrayList(int startCap){
		super(startCap);
	}

	public void add(T element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.add(element);
	}



}
