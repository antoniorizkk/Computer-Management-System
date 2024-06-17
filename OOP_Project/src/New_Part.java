
public class New_Part extends Part {

	private int years;

	public New_Part(int ID, String name, int price, String GPU, int ram, int harddisk, String monitor, String speaker,int years,int days) {
		super(ID, name, price, GPU, ram, harddisk, monitor, speaker,days);
		this.years = years;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years=years;
	}

}
