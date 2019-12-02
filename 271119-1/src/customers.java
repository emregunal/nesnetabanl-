
public class customers {
	private String name;
	private String surname;
	private int telephono;
	private String country;
	public customers(String name,String surname,int telephone,String country) {
		this.name=name;
		this.surname=surname;
		this.telephono=telephone;
		this.country=country;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public int getTelephone() {
		return telephono;
	}
	public void setTelephone(int telephone) {
		this.telephono=telephone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	
}
