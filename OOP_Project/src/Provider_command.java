

public class Provider_command {
	private int ID;
	private String provider_name;
	private String date;
	private int quantity;
	public Provider_command(int ID, String provider_name, String date, int quantity) {
		this.ID = ID;
		this.provider_name = provider_name;
		this.date = date;
		this.quantity = quantity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProvider_name() {
		return provider_name;
	}
	public void setProvider_name(String name) {
		this.provider_name=name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
