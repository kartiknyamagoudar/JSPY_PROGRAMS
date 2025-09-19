package wrapperclass;


import java.util.ArrayList;

class Mobile1 {
	int mobile_cost;
	String mobile_name;
	String mobile_color;
	Mobile1(int mobile_cost,String mobile_name,String mobile_color){
		this.mobile_cost=mobile_cost;
		this.mobile_name=mobile_name;
		this.mobile_color=mobile_color;
	}
	public String toString() {
		return this.mobile_cost+" "+this.mobile_name+" "+this.mobile_color;
	}
}
class Car1 {
	int car_cost;
	String car_model_name;
	String car_type;
	Car1(int car_cost,String car_model_name,String car_type){
		this.car_cost=car_cost;
		this.car_model_name=car_model_name;
		this.car_type=car_type;
	}
	public String toString() {
		return this.car_cost+" "+this.car_model_name+" "+this.car_type;
	}
}

class School{
	String S_name;
	char S_grade;
	int S_strength;
	School(String S_name,char S_grade,int S_strength){
		this.S_name=S_name;
		this.S_grade=S_grade;
		this.S_strength=S_strength;
	}
	public String toString() {
		return this.S_name+" "+this.S_grade+" "+this.S_strength;
	}
}
class Tv{
	int tv_cost;
	String tv_brand;
	String tv_type;
	Tv(int tv_cost,String tv_brand,String tv_type){
		this.tv_cost=tv_cost;
		this.tv_brand=tv_brand;
		this.tv_type=tv_type;
	}
	public String toString() {
		return this.tv_cost+" "+this.tv_brand+" "+this.tv_type;
	}
}
class Bike{
	int b_cost;
	String b_brand;
	String b_colour;
	Bike(int b_cost,String b_brand,String b_colour){
		this.b_cost=b_cost;
		this.b_brand=b_brand;
		this.b_colour=b_colour;
	}
	public String toString() {
		return this.b_cost+" "+this.b_brand+" "+this.b_colour;
	
	}
}
class Collage{
	String course_name;
	String unvir_name;
	int exam_cost;
	Collage(String course_name,String unvir_name,int exam_cost){
		this.course_name=course_name;
		this.unvir_name=unvir_name;
		this.exam_cost=exam_cost;
	}
	public String toString() {
		return this.course_name+" "+this.unvir_name+" "+this.exam_cost;
	
	}
}
class Laptop{
	String l_name;
	int l_cost;
	String l_brand;
	Laptop(String l_name,int l_cost,String l_brand){
		this.l_name=l_name;
		this.l_cost=l_cost;
		this.l_brand=l_brand;
	}
	public String toString() {
		return this.l_name+" "+this.l_cost+" "+this.l_brand;
	
	}
}
class Home{
	String h_name;
	int h_cost;
	String h_colour;
	Home(String h_name,int h_cost,String h_colour){
		this.h_name=h_name;
		this.h_cost=h_cost;
		this.h_colour=h_colour;
	}
	public String toString() {
		return this.h_name+" "+this.h_cost+" "+this.h_colour;
	
	}
}
class Employee{
	int E_id;
	int E_sal;
	char E_grade;
	Employee(int E_id,int E_sal,char E_grade){
		this.E_id=E_id;
		this.E_sal=E_sal;
		this.E_grade=E_grade;
	}
	public String toString() {
		return this.E_id+" "+this.E_sal+" "+this.E_grade;
	
	}
}
class Cloth{
	String C_colour;
	int C_cost;
	String C_size;
	Cloth(String C_colour,int C_cost,String C_size){
		this.C_colour=C_colour;
		this.C_cost=C_cost;
		this.C_size=C_size;
	}
	public String toString() {
		return this.C_colour+" "+this.C_cost+" "+this.C_size;
	
	}
}


public class Mainclass {

	public static void main(String[] args) {
		System.out.println("Mobile details");
		ArrayList<Object> a1=new ArrayList<Object>();
		
		a1.add(new Mobile1(17000,"Samsung","Black"));
		a1.add(new Mobile1(15000,"vivo","gray"));
		a1.add(new Mobile1(19000,"moto","blue"));
		for(int i=0; i<a1.size(); i++) {
			Mobile1 m=(Mobile1)a1.get(i);
			System.out.println(m);
		}
		System.out.println("");
		System.out.println("car details");
		ArrayList<Object> a2=new ArrayList<Object>();
		a2.add(new Car1(2000000,"Thar","Desial"));
		a2.add(new Car1(1000000,"swift","petrol"));
		a2.add(new Car1(3000000,"omini","cng"));
		for(int i=0; i<a2.size(); i++) {
			
			Car1 c=(Car1)a2.get(i);
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("School details");
		ArrayList<Object> a3=new ArrayList<Object>();
		a3.add(new School("MDRS",'A',50));
		a3.add(new School("MDRS",'B',50));
		a3.add(new School("MDRS",'C',50));
		for(int i=0; i<a3.size(); i++) {
					
					School s=(School)a3.get(i);
					System.out.println(s);
		
			}
		System.out.println("");
		System.out.println("Tv details");
		ArrayList<Object> a4=new ArrayList<Object>();
		a4.add(new Tv(12000,"LG","LED"));
		a4.add(new Tv(14000,"Samsung","LED"));
		a4.add(new Tv(6000,"videocan","LED"));
		for(int i=0; i<a4.size(); i++) {
					
					Tv t=(Tv)a4.get(i);
					System.out.println(t);
		
			}
		System.out.println("");
		System.out.println("Bike details");
		ArrayList<Object> a5=new ArrayList<Object>();
		a5.add(new Bike(2500000,"Royal Enfield","Gray"));
		a5.add(new Bike(1200000,"ducati","orange"));
		a5.add(new Bike(500000,"hero honda","black"));
		for(int i=0; i<a5.size(); i++) {
			
			Bike b=(Bike)a5.get(i);
			System.out.println(b);

		}
		System.out.println("");
		System.out.println("Collage details");
		ArrayList<Object> a6=new ArrayList<Object>();
		a6.add(new Collage("SJMIT","VTU",1680));
		a6.add(new Collage("DB","VTU",1680));
		a6.add(new Collage("RV","VTU",1680));
		for(int i=0; i<a6.size(); i++) {
			
			Collage c=(Collage)a6.get(i);
			System.out.println(c);

		}
		System.out.println("");
		System.out.println("Laptoop deatils");
		ArrayList<Object> a7=new ArrayList<Object>();
		a7.add(new Laptop("Tuf A15",500000,"ASUS"));
		a7.add(new Laptop("Tuf F15",700000,"ASUS"));
		a7.add(new Laptop("Rog",1500000,"ASUS"));
		for(int i=0; i<a7.size(); i++) {
			
			Laptop l=(Laptop)a7.get(i);
			System.out.println(l);

		}
		System.out.println("");
		System.out.println("Home details");
		ArrayList<Object> a8=new ArrayList<Object>();
		a8.add(new Home("Banashankari Nilaya",20000000, "Blue"));
		a8.add(new Home("Basava Nilaya",20000000, "pink"));
		a8.add(new Home("Mallikarjun Nilaya",20000000, "marun"));
		for(int i=0; i<a8.size(); i++) {
			
			Home h=(Home)a8.get(i);
			System.out.println(h);

		}
		System.out.println("");
		System.out.println("Employee details");
		ArrayList<Object> a9=new ArrayList<Object>();
		a9.add(new Employee(101,15000,'A'));
		a9.add(new Employee(102,16000,'B'));
		a9.add(new Employee(103,13000,'C'));
		for(int i=0; i<a9.size(); i++) {
			
			Employee e=(Employee)a9.get(i);
			System.out.println(e);

		}
		System.out.println("");
		System.out.println("Clothndetails");
		ArrayList<Object> a10=new ArrayList<Object>();
		a10.add(new Cloth("Green",350,"M"));
		a10.add(new Cloth("blue",370,"L"));
		a10.add(new Cloth("black",390,"M"));
		
		for(int i=0; i<a10.size(); i++) {
	
			Cloth c=(Cloth)a10.get(i);
			System.out.println(c);
		
		}
		
	}
}