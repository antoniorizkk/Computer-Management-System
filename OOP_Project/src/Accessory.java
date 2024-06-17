

public class Accessory extends Product {
	private String mouse;
	private String monitor;
	private String keyboard;
	private String headset;
	private String pccase;
	private String speakers;
	private String camera;
	public Accessory(int ID, String name, int price, String mouse, String monitor, String keyboard, String headset,String pccase, String speakers, String camera,int days) {
		super(ID, name, price,days);
		this.mouse = mouse;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.headset = headset;
		this.pccase = pccase;
		this.speakers = speakers;
		this.camera = camera;
	}
	public String getMouse() {
		return mouse;
	}
	public String getMonitor() {
		return monitor;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public String getHeadset() {
		return headset;
	}
	public String getPccase() {
		return pccase;
	}
	public String getSpeakers() {
		return speakers;
	}
	public String getCamera() {
		return camera;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public void setHeadset(String headset) {
		this.headset = headset;
	}
	public void setPccase(String pccase) {
		this.pccase = pccase;
	}
	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
}
