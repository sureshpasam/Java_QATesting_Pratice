

import java.math.BigDecimal;

public class Developer {
	
	public String name;
	public BigDecimal salary;
	public int age;

	public Developer(String name, BigDecimal salary, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary=salary;
		this.age=age;
	}
   public void setAge(int age) {
	   this.age=age;
   }
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public  BigDecimal getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(getAge()).append(" ");
        sb.append(getSalary()).append(" ");
        sb.append(getName()).append(" "); 
        return sb.toString();
        
    }

}
