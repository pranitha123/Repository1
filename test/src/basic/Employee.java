package basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee implements Serializable {
	private String name;
	private String company;
	private String id;
	private String salary;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Employee(String name,String company,String id,String salary){
		this.name=name;
		this.company=company;
		this.id=id;
		this.salary=salary;
		}
	public String getname(){
		return name;
	}
	public String getcompany(){
		return company;
	}
	public String getid(){
		return id;
	}
	public String getsalary(){
		return salary;
	}
	public ArrayList<employeedetails>emp=new ArrayList<employeedetails>(Arrays.asList(
			new employeedetails("siva","mytri","1234","3456")));
	public static class employeedetails{
		private String name;
		private String company;
		private String id;
		private String salary;

		public employeedetails(String name, String company, String id,
				String salary) {
			this.name=name;
			this.company=company;
			this.id=id;
			this.salary=salary;
			}
		public String getname(){
			return name;
		}
		public String getcompany(){
			return company;
		}
		public String getid(){
			return id;
		}
		public String getsalary(){
			return salary;
		}
		}
	}
