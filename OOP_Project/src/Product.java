
public class Product {
	private int ID;
	private String name;
	private int price;
	private int days;
	public Product(int ID, String name, int price,int days) {
		this.ID = ID;
		this.name = name;
		this.price = price;
		this.days=days;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getDays() {
		return days;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDays(int days) {
		this.days=days;
	}
}
