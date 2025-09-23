package Linkedtistring;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Mobile3 implements Comparable<Mobile3> {
	int mobile_cost;
	String mobile_name;
	String mobile_color;

	Mobile3(int mobile_cost, String mobile_name, String mobile_color) {
		this.mobile_cost = mobile_cost;
		this.mobile_name = mobile_name;
		this.mobile_color = mobile_color;
	}

	@Override
	public int compareTo(Mobile3 o) {
		return Integer.compare(this.mobile_cost, o.mobile_cost);
	}

	public String toString() {
		return "Mobile3 [mobile_cost=" + mobile_cost + ", mobile_name=" + mobile_name + ", mobile_color=" + mobile_color + "]";
	}
}

class Car3 implements Comparable<Car3> {
	int car_cost;
	String car_model_name;
	String car_type;

	Car3(int car_cost, String car_model_name, String car_type) {
		this.car_cost = car_cost;
		this.car_model_name = car_model_name;
		this.car_type = car_type;
	}

	@Override
	public int compareTo(Car3 o) {
		return Integer.compare(this.car_cost, o.car_cost);
	}

	public String toString() {
		return "Car3 [car_cost=" + car_cost + ", car_model_name=" + car_model_name + ", car_type=" + car_type + "]";
	}
}

class School2 implements Comparable<School2> {
	String S_name;
	char S_grade;
	int S_strength;

	School2(String S_name, char S_grade, int S_strength) {
		this.S_name = S_name;
		this.S_grade = S_grade;
		this.S_strength = S_strength;
	}

	@Override
	public int compareTo(School2 o) {
		return Character.compare(this.S_grade, o.S_grade);
	}

	public String toString() {
		return "School2 [S_name=" + S_name + ", S_grade=" + S_grade + ", S_strength=" + S_strength + "]";
	}
}

class Tv2 implements Comparable<Tv2> {
	int tv_cost;
	String tv_brand;
	String tv_type;

	Tv2(int tv_cost, String tv_brand, String tv_type) {
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}

	@Override
	public int compareTo(Tv2 o) {
		return Integer.compare(this.tv_cost, o.tv_cost);
	}

	public String toString() {
		return "Tv2 [tv_cost=" + tv_cost + ", tv_brand=" + tv_brand + ", tv_type=" + tv_type + "]";
	}
}

class Bike2 implements Comparable<Bike2> {
	int b_cost;
	String b_brand;
	String b_colour;

	Bike2(int b_cost, String b_brand, String b_colour) {
		this.b_cost = b_cost;
		this.b_brand = b_brand;
		this.b_colour = b_colour;
	}

	@Override
	public int compareTo(Bike2 o) {
		return Integer.compare(this.b_cost, o.b_cost);
	}

	@Override
	public String toString() {
		return "Bike2 [b_cost=" + b_cost + ", b_brand=" + b_brand + ", b_colour=" + b_colour + "]";
	}
}

class Collage2 implements Comparable<Collage2> {
	String course_name;
	String unvir_name;
	int exam_cost;

	Collage2(String course_name, String unvir_name, int exam_cost) {
		this.course_name = course_name;
		this.unvir_name = unvir_name;
		this.exam_cost = exam_cost;
	}

	@Override
	public int compareTo(Collage2 o) {
		return Integer.compare(this.exam_cost, o.exam_cost);
	}

	@Override
	public String toString() {
		return "Collage2 [course_name=" + course_name + ", unvir_name=" + unvir_name + ", exam_cost=" + exam_cost + "]";
	}
}

class Laptop2 implements Comparable<Laptop2> {
	String l_name;
	int l_cost;
	String l_brand;

	Laptop2(String l_name, int l_cost, String l_brand) {
		this.l_name = l_name;
		this.l_cost = l_cost;
		this.l_brand = l_brand;
	}

	@Override
	public int compareTo(Laptop2 o) {
		return Integer.compare(this.l_cost, o.l_cost);
	}

	@Override
	public String toString() {
		return "Laptop2 [l_name=" + l_name + ", l_cost=" + l_cost + ", l_brand=" + l_brand + "]";
	}
}

class Home2 implements Comparable<Home2> {
	String h_name;
	int h_cost;
	String h_colour;

	Home2(String h_name, int h_cost, String h_colour) {
		this.h_name = h_name;
		this.h_cost = h_cost;
		this.h_colour = h_colour;
	}

	@Override
	public int compareTo(Home2 o) {
		return Integer.compare(this.h_cost, o.h_cost);
	}

	@Override
	public String toString() {
		return "Home2 [h_name=" + h_name + ", h_cost=" + h_cost + ", h_colour=" + h_colour + "]";
	}
}

class Employee2 implements Comparable<Employee2> {
	int E_id;
	int E_sal;
	char E_grade;

	Employee2(int E_id, int E_sal, char E_grade) {
		this.E_id = E_id;
		this.E_sal = E_sal;
		this.E_grade = E_grade;
	}

	@Override
	public int compareTo(Employee2 o) {
		return Integer.compare(this.E_sal, o.E_sal);
	}

	@Override
	public String toString() {
		return "Employee2 [E_id=" + E_id + ", E_sal=" + E_sal + ", E_grade=" + E_grade + "]";
	}
}

class Cloth2 implements Comparable<Cloth2> {
	String C_colour;
	int C_cost;
	String C_size;

	Cloth2(String C_colour, int C_cost, String C_size) {
		this.C_colour = C_colour;
		this.C_cost = C_cost;
		this.C_size = C_size;
	}

	@Override
	public int compareTo(Cloth2 o) {
		return Integer.compare(this.C_cost, o.C_cost);
	}

	@Override
	public String toString() {
		return "Cloth2 [C_colour=" + C_colour + ", C_cost=" + C_cost + ", C_size=" + C_size + "]";
	}
}

public class Comap {
	public static void main(String[] args) {

		LinkedHashMap<String, Mobile3> M = new LinkedHashMap<>();
		M.put("Samsung", new Mobile3(17000, "Samsung", "Black"));
		M.put("vivo", new Mobile3(15000, "vivo", "gray"));
		M.put("moto", new Mobile3(19000, "moto", "blue"));
		for (Entry<String, Mobile3> o1 : M.entrySet()) {
			System.out.println(o1.getValue());
		}

		LinkedHashMap<String, Car3> a2 = new LinkedHashMap<>();
		a2.put("Thar", new Car3(2000000, "Thar", "Diesel"));
		a2.put("swift", new Car3(1000000, "swift", "petrol"));
		a2.put("omini", new Car3(3000000, "omini", "cng"));
		for (Entry<String, Car3> o2 : a2.entrySet()) {
			System.out.println(o2.getValue());
		}

		LinkedHashMap<String, School2> a3 = new LinkedHashMap<>();
		a3.put("MDRS", new School2("MDRS", 'A', 50));
		a3.put("nnh", new School2("nnh", 'B', 50));
		a3.put("udj", new School2("udj", 'C', 50));
		for (Entry<String, School2> o3 : a3.entrySet()) {
			System.out.println(o3.getValue());
		}

		LinkedHashMap<String, Tv2> a4 = new LinkedHashMap<>();
		a4.put("LG", new Tv2(12000, "LG", "LED"));
		a4.put("Samsung", new Tv2(14000, "Samsung", "LED"));
		a4.put("videocon", new Tv2(6000, "videocon", "LED"));
		for (Entry<String, Tv2> o4 : a4.entrySet()) {
			System.out.println(o4.getValue());
		}

		LinkedHashMap<String, Bike2> a5 = new LinkedHashMap<>();
		a5.put("Royal Enfield", new Bike2(2500000, "Royal Enfield", "Gray"));
		a5.put("ducati", new Bike2(1200000, "ducati", "orange"));
		a5.put("hero honda", new Bike2(500000, "hero honda", "black"));
		for (Entry<String, Bike2> o5 : a5.entrySet()) {
			System.out.println(o5.getValue());
		}

		LinkedHashMap<String, Collage2> a6 = new LinkedHashMap<>();
		a6.put("SJMIT", new Collage2("SJMIT", "VTU", 1680));
		a6.put("DB", new Collage2("DB", "VTU", 1680));
		a6.put("RV", new Collage2("RV", "VTU", 1680));
		for (Entry<String, Collage2> o6 : a6.entrySet()) {
			System.out.println(o6.getValue());
		}

		LinkedHashMap<String, Laptop2> a7 = new LinkedHashMap<>();
		a7.put("Tuf A15", new Laptop2("Tuf A15", 500000, "ASUS"));
		a7.put("Tuf F15", new Laptop2("Tuf F15", 700000, "ASUS"));
		a7.put("Rog", new Laptop2("Rog", 1500000, "ASUS"));
		for (Entry<String, Laptop2> o7 : a7.entrySet()) {
			System.out.println(o7.getValue());
		}

		LinkedHashMap<String, Home2> a8 = new LinkedHashMap<>();
		a8.put("Banashankari Nilaya", new Home2("Banashankari Nilaya", 20000000, "Blue"));
		a8.put("Basava Nilaya", new Home2("Basava Nilaya", 20000000, "pink"));
		a8.put("Mallikarjun Nilaya", new Home2("Mallikarjun Nilaya", 20000000, "maroon"));
		for (Entry<String, Home2> o8 : a8.entrySet()) {
			System.out.println(o8.getValue());
		}

		LinkedHashMap<String, Employee2> a9 = new LinkedHashMap<>();
		a9.put("101", new Employee2(101, 15000, 'A'));
		a9.put("102", new Employee2(102, 16000, 'B'));
		a9.put("103", new Employee2(103, 13000, 'C'));
		for (Entry<String, Employee2> o9 : a9.entrySet()) {
			System.out.println(o9.getValue());
		}

		LinkedHashMap<String, Cloth2> a10 = new LinkedHashMap<>();
		a10.put("Green", new Cloth2("Green", 350, "M"));
		a10.put("blue", new Cloth2("blue", 370, "L"));
		a10.put("black", new Cloth2("black", 390, "M"));
		for (Entry<String, Cloth2> o10 : a10.entrySet()) {
			System.out.println(o10.getValue());
		}
	}
}