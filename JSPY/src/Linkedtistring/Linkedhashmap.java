package Linkedtistring;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Mobile2 {
	int mobile_cost;
	String mobile_name;
	String mobile_color;

	Mobile2(int mobile_cost, String mobile_name, String mobile_color) {
		this.mobile_cost = mobile_cost;
		this.mobile_name = mobile_name;
		this.mobile_color = mobile_color;
	}

	public String toString() {
		return "Mobile2 [mobile_cost=" + mobile_cost + ", mobile_name=" + mobile_name + ", mobile_color=" + mobile_color
				+ "]";
	}
}

class Car2 {
	int car_cost;
	String car_model_name;
	String car_type;

	Car2(int car_cost, String car_model_name, String car_type) {
		this.car_cost = car_cost;
		this.car_model_name = car_model_name;
		this.car_type = car_type;
	}

	public String toString() {
		return "Car2 [car_cost=" + car_cost + ", car_model_name=" + car_model_name + ", car_type=" + car_type + "]";
	}
}

class School1 {
	String S_name;
	char S_grade;
	int S_strength;

	School1(String S_name, char S_grade, int S_strength) {
		this.S_name = S_name;
		this.S_grade = S_grade;
		this.S_strength = S_strength;
	}

	public String toString() {
		return "School1 [S_name=" + S_name + ", S_grade=" + S_grade + ", S_strength=" + S_strength + "]";
	}
}

class Tv1 {
	int tv_cost;
	String tv_brand;
	String tv_type;

	Tv1(int tv_cost, String tv_brand, String tv_type) {
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}

	public String toString() {
		return "Tv [tv_cost=" + tv_cost + ", tv_brand=" + tv_brand + ", tv_type=" + tv_type + "]";
	}
}

class Bike1 {
	int b_cost;
	String b_brand;
	String b_colour;

	Bike1(int b_cost, String b_brand, String b_colour) {
		this.b_cost = b_cost;
		this.b_brand = b_brand;
		this.b_colour = b_colour;
	}

	@Override
	public String toString() {
		return "Bike [b_cost=" + b_cost + ", b_brand=" + b_brand + ", b_colour=" + b_colour + "]";
	}
}

class Collage1 {
	String course_name;
	String unvir_name;
	int exam_cost;

	Collage1(String course_name, String unvir_name, int exam_cost) {
		this.course_name = course_name;
		this.unvir_name = unvir_name;
		this.exam_cost = exam_cost;
	}

	@Override
	public String toString() {
		return "Collage [course_name=" + course_name + ", unvir_name=" + unvir_name + ", exam_cost=" + exam_cost + "]";
	}
}

class Laptop1 {
	String l_name;
	int l_cost;
	String l_brand;

	Laptop1(String l_name, int l_cost, String l_brand) {
		this.l_name = l_name;
		this.l_cost = l_cost;
		this.l_brand = l_brand;
	}

	@Override
	public String toString() {
		return "Laptop [l_name=" + l_name + ", l_cost=" + l_cost + ", l_brand=" + l_brand + "]";
	}
}

class Home1 {
	String h_name;
	int h_cost;
	String h_colour;

	Home1(String h_name, int h_cost, String h_colour) {
		this.h_name = h_name;
		this.h_cost = h_cost;
		this.h_colour = h_colour;
	}

	@Override
	public String toString() {
		return "Home1 [h_name=" + h_name + ", h_cost=" + h_cost + ", h_colour=" + h_colour + "]";
	}
}

class Employee1 {
	int E_id;
	int E_sal;
	char E_grade;

	Employee1(int E_id, int E_sal, char E_grade) {
		this.E_id = E_id;
		this.E_sal = E_sal;
		this.E_grade = E_grade;
	}

	@Override
	public String toString() {
		return "Employee1 [E_id=" + E_id + ", E_sal=" + E_sal + ", E_grade=" + E_grade + "]";
	}
}

class Cloth1 {
	String C_colour;
	int C_cost;
	String C_size;

	Cloth1(String C_colour, int C_cost, String C_size) {
		this.C_colour = C_colour;
		this.C_cost = C_cost;
		this.C_size = C_size;
	}

	@Override
	public String toString() {
		return "Cloth1 [C_colour=" + C_colour + ", C_cost=" + C_cost + ", C_size=" + C_size + "]";
	}
}

public class Linkedhashmap {

	public static void main(String[] args) {

		LinkedHashMap<String, Mobile2> M = new LinkedHashMap<>();
		M.put("Samsung", new Mobile2(17000, "Samsung", "Black"));
		M.put("vivo", new Mobile2(15000, "vivo", "gray"));
		M.put("moto", new Mobile2(19000, "moto", "blue"));
		for (Entry<String, Mobile2> o1 : M.entrySet()) {
			System.out.println(o1.getValue());
		}

		LinkedHashMap<String, Car2> a2 = new LinkedHashMap<>();
		a2.put("Thar", new Car2(2000000, "Thar", "Diesel"));
		a2.put("swift", new Car2(1000000, "swift", "petrol"));
		a2.put("omini", new Car2(3000000, "omini", "cng"));
		for (Entry<String, Car2> o2 : a2.entrySet()) {
			System.out.println(o2.getValue());
		}

		LinkedHashMap<String, School1> a3 = new LinkedHashMap<>();
		a3.put("MDRS", new School1("MDRS", 'A', 50));
		a3.put("nnh", new School1("nnh", 'B', 50));
		a3.put("udj", new School1("udj", 'C', 50));
		for (Entry<String, School1> o3 : a3.entrySet()) {
			System.out.println(o3.getValue());
		}

		LinkedHashMap<String, Tv1> a4 = new LinkedHashMap<>();
		a4.put("LG", new Tv1(12000, "LG", "LED"));
		a4.put("Samsung", new Tv1(14000, "Samsung", "LED"));
		a4.put("videocon", new Tv1(6000, "videocon", "LED"));
		for (Entry<String, Tv1> o4 : a4.entrySet()) {
			System.out.println(o4.getValue());
		}

		LinkedHashMap<String, Bike1> a5 = new LinkedHashMap<>();
		a5.put("Royal Enfield", new Bike1(2500000, "Royal Enfield", "Gray"));
		a5.put("ducati", new Bike1(1200000, "ducati", "orange"));
		a5.put("hero honda", new Bike1(500000, "hero honda", "black"));
		for (Entry<String, Bike1> o5 : a5.entrySet()) {
			System.out.println(o5.getValue());
		}

		LinkedHashMap<String, Collage1> a6 = new LinkedHashMap<>();
		a6.put("SJMIT", new Collage1("SJMIT", "VTU", 1680));
		a6.put("DB", new Collage1("DB", "VTU", 1680));
		a6.put("RV", new Collage1("RV", "VTU", 1680));
		for (Entry<String, Collage1> o6 : a6.entrySet()) {
			System.out.println(o6.getValue());
		}

		LinkedHashMap<String, Laptop1> a7 = new LinkedHashMap<>();
		a7.put("Tuf A15", new Laptop1("Tuf A15", 500000, "ASUS"));
		a7.put("Tuf F15", new Laptop1("Tuf F15", 700000, "ASUS"));
		a7.put("Rog", new Laptop1("Rog", 1500000, "ASUS"));
		for (Entry<String, Laptop1> o7 : a7.entrySet()) {
			System.out.println(o7.getValue());
		}

		LinkedHashMap<String, Home1> a8 = new LinkedHashMap<>();
		a8.put("Banashankari Nilaya", new Home1("Banashankari Nilaya", 20000000, "Blue"));
		a8.put("Basava Nilaya", new Home1("Basava Nilaya", 20000000, "pink"));
		a8.put("Mallikarjun Nilaya", new Home1("Mallikarjun Nilaya", 20000000, "maroon"));
		for (Entry<String, Home1> o8 : a8.entrySet()) {
			System.out.println(o8.getValue());
		}

		LinkedHashMap<String, Employee1> a9 = new LinkedHashMap<>();
		a9.put("101", new Employee1(101, 15000, 'A'));
		a9.put("102", new Employee1(102, 16000, 'B'));
		a9.put("103", new Employee1(103, 13000, 'C'));
		for (Entry<String, Employee1> o9 : a9.entrySet()) {
			System.out.println(o9.getValue());
		}

		LinkedHashMap<String, Cloth1> a10 = new LinkedHashMap<>();
		a10.put("Green", new Cloth1("Green", 350, "M"));
		a10.put("blue", new Cloth1("blue", 370, "L"));
		a10.put("black", new Cloth1("black", 390, "M"));
		for (Entry<String, Cloth1> o10 : a10.entrySet()) {
			System.out.println(o10.getValue());
		}
	}
}