import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Old_Computer extends Computer implements Usable {

	private int officialprice;
	private String status;
	private int percentage=2/100;
	private int years;
	public Old_Computer(int ID, String name, int price, int screensize, int screenresolution, int ram, int harddisk,String OS, String type,int years,int days, String status) {
		super(ID, name, price, screensize, screenresolution, ram, harddisk, OS, type,days);
		this.years=years;
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getOfficialPrice() {
		return officialprice;
	}
	public void setOfficielPrice(int officialprice) {
		this.officialprice=officialprice;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years=years;
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
