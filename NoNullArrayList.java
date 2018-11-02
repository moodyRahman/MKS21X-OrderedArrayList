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

	public void add(int index, String element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.add(index, element);
	}

	public void set(int index, T element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.set(index, element);
	}
}
