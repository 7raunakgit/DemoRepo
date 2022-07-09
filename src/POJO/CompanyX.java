package POJO;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class CompanyX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setId(10);
		emp.setName("Tom");
		emp.setMobile("9876543210");
		emp.setGender("male");
		emp.setDeptId(1001);
		
		Address a = new Address();
		a.setHouseNo(101);
		a.setPinNo(100001);
		a.setState("ABCD");
		a.setStreet("XYZ");
		
		Address ad = new Address();
		ad.setHouseNo(201);
		ad.setPinNo(200001);
		ad.setState("ABC");
		ad.setStreet("XYZW");
		
		List<Address> list=new ArrayList<Address>();
		list.add(ad);
		list.add(a);
		
		emp.setAddress(list);
		
		
		RestAssured.given().log().all().body(emp).when().get();
		

	}

}
