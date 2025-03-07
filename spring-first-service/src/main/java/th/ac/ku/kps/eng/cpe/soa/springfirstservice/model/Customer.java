package th.ac.ku.kps.eng.cpe.soa.springfirstservice.model;
// Generated Feb 3, 2025, 9:36:52 AM by Hibernate Tools 5.5.9.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer cusId;
	private String username;
	private String pwd;
	private String userroles;
	@JsonIgnore
	private Set phonenumbers = new HashSet(0);

	public Customer() {
	}

	public Customer(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	public Customer(String username, String pwd, String userroles, Set phonenumbers) {
		this.username = username;
		this.pwd = pwd;
		this.userroles = userroles;
		this.phonenumbers = phonenumbers;
	}

	public Integer getCusId() {
		return this.cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserroles() {
		return this.userroles;
	}

	public void setUserroles(String userroles) {
		this.userroles = userroles;
	}

	public Set getPhonenumbers() {
		return this.phonenumbers;
	}

	public void setPhonenumbers(Set phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

}
