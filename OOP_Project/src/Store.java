
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	private String name;
	ArrayList<Product> product=new ArrayList<Product>();
	ArrayList<Provider_command> provider_command=new ArrayList<Provider_command>();
	ArrayList<Client_command> client_command=new ArrayList<Client_command>();
	ArrayList<Old_Computer> oc= new ArrayList<Old_Computer>();
	ArrayList<New_Computer> nc= new ArrayList<New_Computer>();
	ArrayList<Old_Part> op= new ArrayList<Old_Part>();
	ArrayList<New_Part> np= new ArrayList<New_Part>();
	ArrayList<Accessory> a= new ArrayList<Accessory>();
	public Store(String name, ArrayList<Product> product, ArrayList<Provider_command> provider_command,ArrayList<Client_command> client_command) {
		super();
		this.name = name;
		this.product = product;
		this.provider_command = provider_command;
		this.client_command = client_command;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addProduct(Product p) {
		System.out.println("how many products do you want to enter ?");
		Scanner scan= new Scanner(System.in);
		int nbr;
		nbr=scan.nextInt();
		try {
		FileWriter file = new FileWriter("Product.txt",true);
		BufferedWriter out=new BufferedWriter(file);
		for(int i=0;i<nbr;i++) {
			int a=i+1;
			System.out.println(" product "+a+":");
			System.out.println("enter product ID:");
			int id = 0;
			do {
			id=scan.nextInt();
			if(id<=0)
				System.out.println("Error!enter product ID:");
			}while(id<=0);
			scan.nextLine();
			p.setID(id);
			System.out.println("enter product name:");
			String name;
			name=scan.nextLine();
			p.setName(name);
			System.out.println("enter product price:");
			int price;
			do {
			price=scan.nextInt();
			if(price<=0)
				System.out.println("Error! enter product price:");
			}while(price<=0);
			p.setPrice(price);
			int days=1;
			p.setDays(days);
			product.add(p);
			out.write(id+" "+name+" "+price+" "+days+"\n");
			scan.nextLine();
		}
		out.close();
		}  catch (Exception e) {
			System.out.println("Error while writing to file");
			e.printStackTrace();
		}
	}
	public Provider_command addProviderCommand(Provider_command p) {

		System.out.println("how many provider do you want to enter ?");
		Scanner scan= new Scanner(System.in);
		int nbr;
		nbr=scan.nextInt();
		try {
		FileWriter file = new FileWriter("Provider_command.txt",true);
		BufferedWriter b=new BufferedWriter(file);
		for(int i=0;i<nbr;i++) {
			int a=i+1;
			System.out.println(" provider "+a+":");
			System.out.println("enter provider ID:");
			int id;
			do {
			id=scan.nextInt();
			if(id<=0)
				System.out.println("Error!enter provider id:");
			}while(id<=0);
			scan.nextLine();
			p.setID(id);
			System.out.println("enter privider name:");
			String name;
			name=scan.nextLine();
			p.setProvider_name(name);
			System.out.println("enter the date:");
			String date;
			date=scan.nextLine();
			p.setDate(date);
			System.out.println("enter the quantity:");
			int quantity;
			quantity=scan.nextInt();
			p.setQuantity(quantity);
			scan.nextLine();
			provider_command.add(p);
			b.write(id+" "+name+" "+date+" "+quantity+"\n");
		}
		b.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		provider_command.add(p);
		return p;
	}
	
	public Client_command addClientCommand(Client_command p) {
        System.out.println("how many clients do you want to enter ?");
		Scanner scan= new Scanner(System.in);
		int nbr;
		nbr=scan.nextInt();
		try {
			FileWriter file= new FileWriter("Client_command.txt",true);
			BufferedWriter b=new BufferedWriter(file);
		for(int i=0;i<nbr;i++) {
			int a=i+1;
			System.out.println(" client "+a+":");
			System.out.println("enter client ID:");
			int id;
			do {
			id=scan.nextInt();
			if(id<=0)
				System.out.println("Error!enter client id:");
			}while(id<=0);
			scan.nextLine();
			p.setId(id);
			System.out.println("enter client name:");
			String name;
			name=scan.nextLine();
			p.setClient_name(name);
			System.out.println("enter client date:");
			String date;
			date=scan.nextLine();
			p.setDate(date);
			System.out.println("enter  quantity:");
			int quantity;
			do {
			quantity=scan.nextInt();
			if(quantity<=0)
				System.out.println("Error!enter quantity:");
			}while(quantity<=0);
			scan.nextLine();
			p.setQuantity(quantity);
			client_command.add(p);
			b.write(id+" "+name+" "+date+" "+quantity+"\n");
		}
		b.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
		client_command.add(p);
		return p;
	}
	
	public void displayProduct() {
		try {
			FileReader file= new FileReader("Product.txt");
			Scanner scan = new Scanner (file);
			while(scan.hasNextLine()) {
				String data= scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void displayClient_command() {
		try {
			FileReader file= new FileReader("Client_command.txt");
			Scanner scan = new Scanner (file);
			while(scan.hasNextLine()) {
				String data= scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void displayproductfromDate() {
		System.out.println("type the days where the product is sold:");
		int days;
		Scanner scan=new Scanner(System.in);
		do {
			days=scan.nextInt();
			if(days<=0)
				System.out.println("*Error!Enter the days.*");
		}while(days<=0);
		int a=0;
		for(int i=0;i<product.size();i++) {
			
			if(product.get(i).getDays()==days)
				a++;
				System.out.println("product "+a+":"+" ID:"+product.get(i).getID()+"   Name:"+product.get(i).getName()+"  Days:"+product.get(i).getDays());
		}
	}
	public Old_Computer addoldcomputer(Old_Computer p) {
		System.out.println("how many computer do you want to enter ?");
		Scanner scan= new Scanner(System.in);
		int nbr;
		nbr=scan.nextInt();
		try {
		FileWriter file = new FileWriter("old_computer.txt",true);
		BufferedWriter b=new BufferedWriter(file);
		for(int i=0;i<nbr;i++) {
			int a=i+1;
			System.out.println(" old product "+a+":");
			System.out.println("enter computer ID:");
			int id;
			id=scan.nextInt();
			scan.nextLine();
			p.setID(id);
			System.out.println("enter computer name:");
			String name;
			name=scan.nextLine();
			p.setName(name);
			System.out.println("enter computer price:");
			int price;
			price=scan.nextInt();
			p.setPrice(price);
			System.out.println("enter computer screensize:");
			int screensize;
			screensize=scan.nextInt();
			p.setScreensize(screensize);
			System.out.println("enter computer screen resolution:");
			int screenresolution;
			screenresolution=scan.nextInt();
			p.setScreenresolution(screenresolution);
			System.out.println("enter computer ram:");
			int ram;
			ram=scan.nextInt();
			p.setRam(ram);
			int harddisk;
			System.out.println("enter computer harddisk:");
			harddisk=scan.nextInt();
			p.setHarddisk(harddisk);
			String OS;
			scan.nextLine();
			System.out.println("enter computer os:");
			OS=scan.nextLine();
			p.setOS(OS);
			String type;
			System.out.println("enter computer type:");
			type=scan.nextLine();
			p.setType(type);
			System.out.println("how old is your computer?");
			int years;
			int officialprice=price;
			officialprice=p.calculatePrice();
			price=officialprice;
			p.setPrice(price);
			int days=1;
			p.setDays(days);
			years=scan.nextInt();
			scan.nextLine();
			p.setYears(years);
			String status;
			System.out.println("enter computer status(good average excellent):");
				status=scan.nextLine();
			p.setStatus(status);
			b.write(id+" "+name+" "+officialprice+" "+screensize+" "+screenresolution+" "+ram+" "+OS+" "+" "+years+" "+days+" "+status+"\n");
		}
		b.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oc.add(p);
		return p;
	}
	public void displayoldcomputer() {
		try {
			FileReader file= new FileReader("old_computer.txt");
			Scanner scan = new Scanner (file);
			while(scan.hasNextLine()) {
				String data= scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public New_Computer addnewcomputer(New_Computer p) {
		System.out.println("How many computers do you want add?");
		int nbr;
		Scanner scan=new Scanner(System.in);
		nbr=scan.nextInt();
		try {
			FileWriter file=new FileWriter(("new_computer.txt"),true);
			BufferedWriter b=new BufferedWriter(file);
			for(int i=0;i<nbr;i++) {
				int a=i+1;
				System.out.println(" new computer "+a+":");
				System.out.println("enter computer ID:");
				int id;
				id=scan.nextInt();
				p.setID(id);
				scan.nextLine();
				System.out.println("enter computer name:");
				String name;
				name=scan.nextLine();
				p.setName(name);
				System.out.println("enter computer price:");
				int price;
				price=scan.nextInt();
				p.setPrice(price);
				System.out.println("enter screen size:");
				int screensize;
				screensize=scan.nextInt();
				p.setScreensize(screensize);
				System.out.println("enter screen resolution:");
				int screenresolution;
				screenresolution=scan.nextInt();
				p.setScreenresolution(screenresolution);
				System.out.println("enter ram:");
				int ram;
				ram=scan.nextInt();
				p.setRam(ram);
				System.out.println("enter Hard disk:");
				int harddisk;
				harddisk=scan.nextInt();
				p.setHarddisk(harddisk);
				String os;
				scan.nextLine();
				System.out.println("enter OS:");
				os=scan.nextLine();
				p.setOS(os);
				String type;
				System.out.println("enter type:");
				type=scan.nextLine();
				p.setType(type);
				System.out.println("enter years");
				int years;
				int days=1;
				p.setDays(days);
				years=scan.nextInt();
				p.setYears(years);
				b.write(id+" "+name+" "+price+" "+screensize+" "+screenresolution+" "+ram+" "+harddisk+" "+os+" "+type+" "+years+" "+days+"\n");
			}
			b.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		nc.add(p);
			return p;
		
	}

public Accessory addaccessory(Accessory p) {
	System.out.println("how many accessories do you want to enter ?");
	Scanner scan= new Scanner(System.in);
	int nbr;
	nbr=scan.nextInt();
	try {
	FileWriter file = new FileWriter(("accessory.txt"),true);
	BufferedWriter b=new BufferedWriter(file);
	for(int i=0;i<nbr;i++) {
		int a=i+1;
		System.out.println(" accessory "+a+":");
		System.out.println("enter acc ID:");
		int id;
		id=scan.nextInt();
		p.setID(id);
		scan.nextLine();
		System.out.println("enter acc name:");
		String name;
		name=scan.nextLine();
		p.setName(name);
		System.out.println("enter acc price:");
		int price;
		price=scan.nextInt();
		p.setPrice(price);
		scan.nextLine();
		System.out.println("enter monitor name:");
		String monitor;
		monitor=scan.nextLine();
		p.setMonitor(monitor);
		System.out.println("enter keyboard name:");
		String keyboard;
		keyboard=scan.nextLine();
		p.setKeyboard(keyboard);;
		System.out.println("enter headset name:");
		String headset;
		headset=scan.nextLine();
		p.setHeadset(headset);;
		System.out.println("enter pccase name:");
		String pccase;
		pccase=scan.nextLine();
		p.setPccase(pccase);;
		String speaker;
		System.out.println("enter Speaker name:");
		speaker=scan.nextLine();
		p.setSpeakers(speaker);
		System.out.println("enter camera name:");
		String camera;
		int days=1;
		camera=scan.nextLine();
		p.setCamera(camera);
		p.setDays(days);

		b.write(id+" "+name+" "+price+" "+monitor+" "+" "+keyboard+" "+headset+" "+pccase+" "+speaker+" "+camera+" "+days+" "+"\n");
	}
	b.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	a.add(p);
	return p;
}

public New_Part addnewpart(New_Part p) {
	System.out.println("how many parts do you want to enter ?");
	Scanner scan= new Scanner(System.in);
	int nbr;
	nbr=scan.nextInt();
	try {
	FileWriter file = new FileWriter(("new_part.txt"),true);
	BufferedWriter b=new BufferedWriter(file);
	for(int i=0;i<nbr;i++) {
		int a=i+1;
		System.out.println(" new part"+a+":");
		System.out.println("enter computer ID:");
		int id;
		id=scan.nextInt();
		p.setID(id);
		scan.nextLine();
		System.out.println("enter computer name:");
		String name;
		name=scan.nextLine();
		p.setName(name);
		System.out.println("enter computer price:");
		int price;
		price=scan.nextInt();
		p.setPrice(price);
		System.out.println("enter GPU:");
		String GPU;
		GPU=scan.nextLine();
		p.setGPU(GPU);
		System.out.println("enter RAM:");
		int ram;
		ram=scan.nextInt();
		p.setRam(ram);
		System.out.println("enter Harddisk:");
		int Harddisk;
		Harddisk=scan.nextInt();
		p.setHarddisk(Harddisk);
		scan.nextLine();
		System.out.println("enter Monitor:");
		String monitor;
		monitor=scan.nextLine();
		p.setMonitor(monitor);
		String speaker;
		System.out.println("enter Speaker:");
		speaker=scan.nextLine();
		p.setSpeaker(speaker);
		System.out.println("how old is your parts?");
		int years;
		int days=1;
		years=scan.nextInt();
		p.setYears(years);
		p.setDays(days);

		b.write(id+" "+name+" "+price+" "+GPU+" "+" "+ram+" "+Harddisk+" "+monitor+" "+speaker+" "+years+" "+days+"\n");
	}
	b.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	np.add(p);
	return p;
}

public Old_Part addoldpart(Old_Part p) {
	System.out.println("how many parts do you want to enter ?");
	Scanner scan= new Scanner(System.in);
	int nbr;
	nbr=scan.nextInt();
	try {
	FileWriter file = new FileWriter(("old_part.txt"),true);
	BufferedWriter b=new BufferedWriter(file);
	for(int i=0;i<nbr;i++) {
		int a=i+1;
		System.out.println(" old part "+a+":");
		System.out.println("enter computer ID:");
		int id;
		id=scan.nextInt();
		p.setID(id);
		scan.nextLine();
		System.out.println("enter computer name:");
		String name;
		name=scan.nextLine();
		p.setName(name);
		System.out.println("enter computer price:");
		int price;
		price=scan.nextInt();
		p.setPrice(price);
		scan.nextLine();
		System.out.println("enter GPU:");
		String GPU;
		GPU=scan.nextLine();
		p.setGPU(GPU);
		System.out.println("enter RAM:");
		int ram;
		ram=scan.nextInt();
		p.setRam(ram);
		System.out.println("enter Harddisk:");
		int Harddisk;
		Harddisk=scan.nextInt();
		p.setHarddisk(Harddisk);
		scan.nextLine();
		System.out.println("enter Monitor:");
		String monitor;
		monitor=scan.nextLine();
		p.setMonitor(monitor);
		String speaker;
		System.out.println("enter Speaker:");
		speaker=scan.nextLine();
		p.setSpeaker(speaker);
		System.out.println("how old is your parts?");
		int years;
		int officialprice=price;
		officialprice=p.calculatePrice();
		price=officialprice;
		p.setPrice(price);
		int days=1;
		p.setDays(days);
		years=scan.nextInt();
		p.setYears(years);
		String status;
		scan.nextLine();
		System.out.println("enter computer status(good average excellent):");
			status=scan.nextLine();
		p.setStatus(status);
		b.write(id+" "+name+" "+officialprice+" "+GPU+" "+" "+ram+" "+Harddisk+" "+monitor+" "+speaker+" "+years+" "+days+" "+status+"\n");
	}
	b.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	op.add(p);
	return p;
}

public void displayoldpart() {
	try {
		FileReader file= new FileReader("old_part.txt");
		Scanner scan = new Scanner (file);
		while(scan.hasNextLine()) {
			String data= scan.nextLine();
			System.out.println(data);
		}
		scan.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void displaynewcomputert() {
	try {
		FileReader file= new FileReader("new_computer.txt");
		Scanner scan = new Scanner (file);
		while(scan.hasNextLine()) {
			String data= scan.nextLine();
			System.out.println(data);
		}
		scan.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void displaynewpart() {
	try {
		FileReader file= new FileReader("new_part.txt");
		Scanner scan = new Scanner (file);
		while(scan.hasNextLine()) {
			String data= scan.nextLine();
			System.out.println(data);
		}
		scan.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void displayaccessory() {
	try {
		FileReader file= new FileReader("accessory.txt");
		Scanner scan = new Scanner (file);
		while(scan.hasNextLine()) {
			String data= scan.nextLine();
			System.out.println(data);
		}
		scan.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}