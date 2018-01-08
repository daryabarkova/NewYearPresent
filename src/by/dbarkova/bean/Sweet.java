package by.dbarkova.bean;

public abstract class Sweet {
	
	private String name;
	private int weight;
	private double calorieContent;
	
	public Sweet(String name, int weight, double calorieContent) {
		this.name = name;
		this.weight = weight;
		this.calorieContent = calorieContent;
	}
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public double getCalorieContent() {
		return calorieContent;
	}


	public void setCalorieContent(double calorieContent) {
		this.calorieContent = calorieContent;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorieContent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		if (Double.doubleToLongBits(calorieContent) != Double.doubleToLongBits(other.calorieContent))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", calorieContent=" + calorieContent + "]";
	}
	
}



	
