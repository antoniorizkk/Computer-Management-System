
public class New_Computer extends Computer {

	int years;//how old is the pc;

	public New_Computer(int ID, String name, int price, int screensize, int screenresolution, int ram, int harddisk,String OS, String type, int years,int days) {
		super(ID, name, price, screensize, screenresolution, ram, harddisk, OS, type,days);
		this.years = years;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
}
