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

	private boolean toAdd(T inQuestion, T current){
		if (inQuestion.compareTo(current) < 0){
			return false;
		}
		return true;
	}

	private void sorter(T element){
		for (int x = 0; x < this.size() - 1; x++){
			if (toAdd(element, this.get(x))){
				super.add(x, element);
				break;
			}
		}
	}

	public void add(int index, T element){
		if (this.size() == 0){
			super.add(element);
		}
		else{
			if (this.size() == 1){
				if (toAdd(this.get(0), element)) {
					super.add(element);
				}
				else {
					super.add(0, element);
				}
			}
			else{
				sorter(element);
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

	public T set(int index, T element){
		remove(index);
		this.add(element);
		return element;
	}
}
