package POJO;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String mobile;
	private String gender;
	private int deptId;
	private List<Address> address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> list) {
		this.address = list;
	}
	

}
