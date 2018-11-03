import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
	public NoNullArrayList(){
		super();
	}

	public NoNullArrayList(int startCap){
		super(startCap);
	}

	public void add(int idx, T element){
		if (element == null) {
			throw new IllegalArgumentException("Can't add a null");
		}
		super.add(idx, element);
	}

	public boolean add(T element){
		if (element == null){
			throw new IllegalArgumentException("no nulls lmao");
		}
		super.add(element);

		return true;
	}
  }
