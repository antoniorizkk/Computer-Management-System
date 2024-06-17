

public class Client_command {
	private int id;
	private String client_name;
	private String date;
	private int quantity;
	public Client_command(int id, String client_name, String date, int quantity) {
		this.id = id;
		this.client_name = client_name;
		this.date = date;
		this.quantity = quantity;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
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
