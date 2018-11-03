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
	public void add(int index, T element){
		if (element == null){
			throw new IllegalArgumentException();
		}

		for (int x = 0; x < this.size(); x++){
			while (x < this.size() - 1){
				if (this.get(x).compareTo(this.get(x+1)) >= 0){
					super.add(x, element);
				}
			}
		}//
	}

	public boolean add(T element){
		if (element == null){
			throw new IllegalArgumentException("fool, no nulls allowed");
		}
		this.add(0, element);
		return true;
	}
}
