package cn.tedu.ajax.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1216726316668482659L;
	
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private String phone;
	private String email;
	private Integer is_delete;
	private Integer department;
	public User() {
		super();
		
	}
	
	public User(String username, String password, Integer age, String phone, String email, Integer is_delete,
			Integer department) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.is_delete = is_delete;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", phone="
				+ phone + ", email=" + email + ", is_delete=" + is_delete + ", department=" + department + "]";
	}
	
	
	
	
}
