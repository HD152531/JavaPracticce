/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 * 	 |_Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class Car2 {
	

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public Car2(){}

	public Car2(String newcompany, String newmodel, String newcolor, int newMaxspeed, int newprice) {
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newMaxspeed;
		price = newprice;
	}

	public String getcompany() {
		return company;
	}
	public String getmodel() {
		return model;
	}
	public String getcolor() {
		return color;
	}
	public int getmaxSpeed() {
		return maxSpeed;
	}
	public int getprice() {
		return price;
	}
	
		public void setcompany(String newcompany){
			company = newcompany;
		}
		
		public void setmodel(String newmodel){
			model = newmodel;
		}
		
		public void setcolor(String newcolor){
			color = newcolor;
		}
		
		public void setmaxSpeed(int newmaxSpeed){
			maxSpeed = newmaxSpeed;
		}
		
		public void setprice(int newprice){
			price = newprice;
		}
	
		public void getcompany(String newcompany){
			company = newcompany;
		}
		
		public void getmodel(String newmodel){
			model = newmodel;
		}
		
		public void getcolor(String newcolor){
			color = newcolor;
		}
		
		public void getmaxSpeed(int newmaxSpeed){
			maxSpeed = newmaxSpeed;
		}
		
		public void getprice(int newprice){
			price = newprice;
		}
	
	}