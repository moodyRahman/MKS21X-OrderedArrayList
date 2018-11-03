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
	    else {
	      super.add(idx, element);
	    }
	  }
	}
	/**
	public void add(T element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.add(element);
	}
	public void add(int index, T element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.add(index, element);
	}

public int set(int index, T element){
		if (element == null){
			throw new IllegalArgumentException();
		}
		super.set(index, element);
		return get(index);
	}
}
**/
