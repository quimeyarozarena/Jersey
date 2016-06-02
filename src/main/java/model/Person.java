package model;

public class Person {

	private int idPerson;
	
	private String name;
	
	private String lastname;
	
	private String email;
	
	private String phone;
	
	private String password;
	
	private boolean administrator;
	
	private boolean locked;
	
	
	public Person() {
	}
	
	public Person(int idPerson, String name, String lastname, String email, String phone, String password,
			boolean administrator, boolean locked) {
		this.idPerson = idPerson;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.administrator = administrator;
		this.locked = locked;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

}
