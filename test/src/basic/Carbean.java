package basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carbean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<car> cars;
	public Carbean(){
		cars=new ArrayList<car>();
		cars.add(new car("myModel",2005,"ManufacturerX","blue"));
		cars.add(new car("ford",2009,"fiasta","black"));
		cars.add(new car("ford",2009,"fiasta","black"));
	}
	public List<car> getcars(){
		return cars;
	}
	
	public class car{
		private String model;
		private int year;
		private String manufacturer;
		private String color;
		public car(String model,int year,String manufacturer,String color){
			this.model=model;
			this.year=year;
			this.manufacturer=manufacturer;
			this.color=color;
		}
		public String getmodel(){
			return model;
		}
		public int getyear(){
			return year;
		}
		public String getmanufacturer(){
			return manufacturer;
		}
		public String getcolor(){
			return color;
		}
	}

}
