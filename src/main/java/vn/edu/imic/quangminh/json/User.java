package vn.edu.imic.quangminh.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User {
	private String id;
	private String name;
	private String username;
	private Address address;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", address=" + address + ", phone="
				+ phone + "]";
	}
}

@JsonIgnoreProperties(ignoreUnknown=true)
class Address {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	//ignore geo
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
}
