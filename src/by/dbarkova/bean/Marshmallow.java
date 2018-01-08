package by.dbarkova.bean;

public class Marshmallow extends Sweet {
	
	private double sugarContent;
	
	public Marshmallow(String name, int weight, double calorieContent, double sugarContent) {
		super(name, weight, calorieContent);
		this.sugarContent = sugarContent;		
	}

	public double getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(double sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(sugarContent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Marshmallow other = (Marshmallow) obj;
		if (Double.doubleToLongBits(sugarContent) != Double.doubleToLongBits(other.sugarContent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marshmallow [sugarContent=" + sugarContent + "]";
	}
	
}
