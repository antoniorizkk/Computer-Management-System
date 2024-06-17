import java.util.ArrayList;

public class Computer extends Product {
	private int screensize;
	private int screenresolution;
	private int ram,harddisk;
	private String OS;
	private String type;

	public Computer(int ID, String name, int price, int screensize, int screenresolution, int ram, int harddisk,String OS, String type,int days) {
		super(ID, name, price,days);
		this.screensize = screensize;
		this.screenresolution = screenresolution;
		this.ram = ram;
		this.harddisk = harddisk;
		this.OS = OS;
		this.type = type;
	}

	public int getScreensize() {
		return screensize;
	}

	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}

	public int getScreenresolution() {
		return screenresolution;
	}

	public void setScreenresolution(int screenresolution) {
		this.screenresolution = screenresolution;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

