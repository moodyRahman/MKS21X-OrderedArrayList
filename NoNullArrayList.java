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
