
public class Old_Part extends Part implements Usable {

	private int officialprice;
	private String status;
	private int percentage=2/100;
	private int years;
	public Old_Part(int ID, String name, int price, String GPU, int ram, int harddisk, String monitor,String speaker,int days,int years,String status) {
		super(ID, name, price, GPU, ram, harddisk, monitor, speaker,days);
		this.years=years;
		this.status=status;
	}
	public int getYears() {
		return years;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setYears(int years) {
		this.years=years;
	}
	public double getOfficialPrice() {
		return officialprice;
	}
	public void setofficialPrice(int officialprice) {
		this.officialprice=officialprice;
	}
	public int calculatePrice() {
		int p;
		if(status.equals("average")) {
			for(int i=0;i<years;i++) {
				p=officialprice-(officialprice*percentage)-200;
				officialprice=p;
			}
		}else if(status.equals("good")) {
			for(int i=0;i<years;i++) {
				p=officialprice-(officialprice*percentage)-150;
				officialprice=p;
			}
		}else if(status.equals("excellent")) {
			for(int i=0;i<years;i++) {
				p=officialprice-(officialprice*percentage)-100;
				officialprice=p;
			}
		}
		return officialprice;
	}

}
