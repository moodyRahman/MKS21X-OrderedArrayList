public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

	//╔═╗┌─┐┌┐┌┌─┐┌┬┐┬─┐┬ ┬┌─┐┌┬┐┌─┐┬─┐┌─┐
	//║  │ ││││└─┐ │ ├┬┘│ ││   │ │ │├┬┘└─┐
	//╚═╝└─┘┘└┘└─┘ ┴ ┴└─└─┘└─┘ ┴ └─┘┴└─└─┘
	public OrderedArrayList(){
		super();
	}
	public OrderedArrayList(int startCap){
		super(startCap);
	}


	//╔═╗┌┬┐┌┬┐┌─┐
	//╠═╣ ││ ││└─┐
	//╩ ╩─┴┘─┴┘└─┘

	public boolean toAdd(T inQuestion, T current){
		if (inQuestion.compareTo(current) < 0){
			return false;
		}
		return true;
	}

	public void add(int index, T element){
		if (this.size() == 0){
			super.add(element);
		}

		for (int x = 0; x < this.size() - 1; x++){
			if (this.get(x).compareTo(this.get(x+1)) >= 0){
				super.add(x, element);
			}
		}
	}

	public boolean add(T element){
		if (element == null){
			throw new IllegalArgumentException("fool, no nulls allowed");
		}
		this.add(0, element);
		return true;
	}
}
