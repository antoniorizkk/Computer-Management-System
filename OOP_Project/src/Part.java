

public class Part extends Product {
	public String GPU;
	public int ram;
	public int harddisk;
	public String monitor;
	public String speaker;
	public Part(int ID, String name, int price, String GPU, int ram, int harddisk, String monitor, String speaker,int days) {
		super(ID, name, price,days);
		this.GPU = GPU;
		this.ram = ram;
		this.harddisk = harddisk;
		this.monitor = monitor;
		this.speaker = speaker;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
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
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	
}
