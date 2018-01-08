package by.dbarkova.bean;

public class Cookie extends Sweet {
	
	int size;
	
	public Cookie(String name, int weight, double calorieContent, int size) {
	   super(name, weight, calorieContent);
	   this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cookie other = (Cookie) obj;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cookie [size=" + size + "]";
	}
	
}
