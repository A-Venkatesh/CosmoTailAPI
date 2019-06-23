/**
 * 
 */
package com.cosmotail.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author Anbu
 *
 */
@Entity
public class User {
	@NotBlank(message="Enter email")
	@Email
	@Id
	private String email;
	@NotBlank(message="Enter name")
	private String name;
	@NotBlank(message="Enter password")
	private String password;
	@NotBlank(message="Enter confirmPassword")
	private String confirmPassword;
	@NotBlank(message="Enter age")
	private String age;
	@NotBlank(message="Enter phoneNumber")
	private String phoneNum;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @param email
	 * @param name
	 * @param password
	 * @param confirmPassword
	 * @param age
	 * @param phoneNum
	 */
	public User(String email, String name, String password, String confirmPassword, String age, String phoneNum) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	

}
