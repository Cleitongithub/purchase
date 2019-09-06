package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String Name;
	private String Email;
	private Date birthDate;
	
	public Client() {
	}
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Client(String name, String email, Date birthDate) {
		this.Name = name;
		this.Email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return  Name + "(" +sdf.format(birthDate) + ") - " + Email;
	}
	
	
}
