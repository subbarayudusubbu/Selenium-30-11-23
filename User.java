package encapsulation;

public class User {
 private  String username;
 private  String mail;
 private  String phonenumber;
 private  String adderes;
 private  String city;
 
 
 
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	

	this.username = username;
}

public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getAdderes() {
	return adderes;
}
public void setAdderes(String adderes) {
	this.adderes = adderes;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

 
}
