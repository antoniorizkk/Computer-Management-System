import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Application {
	public static boolean verifyLogin(String username, String password, String filepath) {
		Scanner x;
		boolean found =false;
		String tempUsername="";
		String tempPassword="";
		try {
			x=new Scanner (new FileReader(filepath));
			x.useDelimiter("[ \n]");
			while(x.hasNextLine() && !found) {
				tempUsername=x.next();
				tempPassword=x.next();
				if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
					found =true;
					return true;
				}else return false;
			}
			x.close();
			System.out.println(found);
		}catch(Exception e) {
			System.out.println("Error");
		}
		return found;
	}
	
	
	
	public static void main(String[] args) {
	    ArrayList<Product> p= new ArrayList<Product>();
	    ArrayList<Provider_command> pc= new ArrayList<Provider_command>();
	    ArrayList<Old_Computer> oc=new ArrayList<Old_Computer>();
	    ArrayList<Client_command> cc=new ArrayList<Client_command>();
	    ArrayList<Old_Part> op=new ArrayList<Old_Part>();
	    ArrayList<New_Computer> nc=new ArrayList<New_Computer>();
	    ArrayList<Accessory> a= new ArrayList<Accessory>();
	    ArrayList<New_Part> np=new ArrayList<New_Part>();
	    String name="Electronics Shop";
	    Store s=new Store(name,p,pc,cc);
	   String line;
	    try{
	    	FileReader f=new FileReader("Product.txt");
	    	 BufferedReader reader= new BufferedReader(f);
	    	while((line=reader.readLine()) !=null) {
	    		String[] prod = line.split(" ");
	    		// id name price days
	    		Product px=new Product(Integer.parseInt(prod[0]), prod[1] ,Integer.parseInt(prod[2]),Integer.parseInt(prod[3]));
	    		p.add(px);
	    		s.product.add(px);
	    	}
	    	f.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	  String line1;
	    try {
	    	FileReader f1=new FileReader("Client_command.txt");
	    	BufferedReader reader1=new BufferedReader(f1);
	    	while((line1=reader1.readLine()) != null) {
	    		String[] prod1=line1.split(" ");
	    		//id name date quantity
	    		Client_command cc1= new Client_command(Integer.parseInt(prod1[0]),prod1[1],prod1[2],Integer.parseInt(prod1[3]));
	    		cc.add(cc1);
	    	}
	    	f1.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	    String line2;
	    try {
	    	FileReader f2=new FileReader("old_computer.txt");
	    	BufferedReader reader2=new BufferedReader(f2);
	    	while((line2=reader2.readLine()) != null) {
	    		String[] prod2=line2.split(" ");
	    		//id name date quantity
	    		Old_Computer oc1= new Old_Computer(Integer.parseInt(prod2[0]),prod2[1],Integer.parseInt(prod2[2]),Integer.parseInt(prod2[3]),Integer.parseInt(prod2[4]),Integer.parseInt(prod2[5]),Integer.parseInt(prod2[6]),prod2[7],prod2[8],Integer.parseInt(prod2[9]),Integer.parseInt(prod2[10]),prod2[11]);
	    		oc.add(oc1);
	    	}
	    	f2.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	    String line3;
	    try {
	    	FileReader f3=new FileReader("old_part.txt");
	    	BufferedReader reader3=new BufferedReader(f3);
	    
	    	while((line3=reader3.readLine()) != null) {
	    		String[] prod3=line3.split(" ");
	    		//id name date quantity
	    		Old_Part op1= new Old_Part(Integer.parseInt(prod3[0]),prod3[1],Integer.parseInt(prod3[2]),prod3[3],Integer.parseInt(prod3[4]),Integer.parseInt(prod3[5]),prod3[6],prod3[7],Integer.parseInt(prod3[8]),Integer.parseInt(prod3[9]),prod3[10]);
	    		op.add(op1);
	    	}
	    	f3.close();
	    }catch(Exception e) {
	    }
	   String line4;
	    try {
	    	FileReader f4=new FileReader("new_computer.txt");
	    	BufferedReader reader4=new BufferedReader(f4);
	    
	    	while((line4=reader4.readLine()) != null) {
	    		String[] prod4=line4.split(" ");
	    		//id name date quantity
	    		New_Computer nc1= new New_Computer(Integer.parseInt(prod4[0]),prod4[1],Integer.parseInt(prod4[2]),Integer.parseInt(prod4[3]),Integer.parseInt(prod4[4]),Integer.parseInt(prod4[5]),Integer.parseInt(prod4[6]),prod4[7],prod4[8],Integer.parseInt(prod4[9]),Integer.parseInt(prod4[10]));
	    		nc.add(nc1);
	    	}
	    	f4.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	    String line5;
	    try {
	    	FileReader f5=new FileReader("new_part.txt");
	    	BufferedReader reader5=new BufferedReader(f5);
	    	
	    	while((line5=reader5.readLine()) != null) {
	    		String[] prod5=line5.split(" ");
	    		//id name date quantity
	    		New_Part np1= new New_Part(Integer.parseInt(prod5[0]),prod5[1],Integer.parseInt(prod5[2]),prod5[3],Integer.parseInt(prod5[4]),Integer.parseInt(prod5[5]),prod5[6],prod5[7],Integer.parseInt(prod5[8]),Integer.parseInt(prod5[9]));
	    		np.add(np1);
	    	}
	    	f5.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	    String line6;
	    try {
	    	FileReader f6=new FileReader("accessory.txt");
	    	BufferedReader reader6=new BufferedReader(f6);
	    	
	    	while((line6=reader6.readLine())!= null) {
	    		String[] prod6=line6.split(" ");
	    		//id name date quantity
	    		Accessory a1= new Accessory(Integer.parseInt(prod6[0]),prod6[1],Integer.parseInt(prod6[2]),prod6[3],prod6[4],prod6[5],prod6[6],prod6[7],prod6[8],prod6[9],Integer.parseInt(prod6[10]));
	    		a.add(a1);
	    		
	    	}
	    	f6.close();
	    }catch(Exception e) {
	    	System.out.println("Error!");
	    }
	    System.out.println("Antonio Rizk 201810283");
	   String answer;
	   do {
		System.out.println("********************************************");
		System.out.println("Options: 1-Provider command 2-Client command");
		Scanner scan = new Scanner (System.in);
		int number;
		System.out.println("Choose an option:");
		do {
			number=scan.nextInt();
			scan.nextLine();
			if(number!=1 && number!=2)
				System.out.println("Error! Enter an option.");
		}while(number!=1 && number!=2 );
		if(number ==1) {
			System.out.println("*****************");
			System.out.println("Provider command:");
			boolean f1;
			do {
			System.out.println("Enter your username:");
			String username;
			Scanner scan1= new Scanner(System.in);
			username=scan1.nextLine();
			System.out.println("Enter your password:");
			String password;
			password=scan1.nextLine();
			String file="login.txt";
			f1=verifyLogin(username, password, file);
			if(f1==false)
				System.out.println("Error");
			}while (f1==false);
			System.out.println("Options:0-add provider 1-add product 2-display products 3-add client 4-display clients 5-add new pc 6-add new part 7-add accessory 8-display new pc 9-display new part 10-display accessory");
			System.out.println("Choose an option:");
			int nbr;
			do {
				nbr=scan.nextInt();
				if(nbr!=0 && nbr!=1 && nbr!=2 && nbr!=3 && nbr!=4 && nbr!=5 && nbr!=6 && nbr!=7 && nbr!=8 && nbr!=9 && nbr!=10)
					System.out.println("Error! Enter an option.");
			}while(nbr!=0 && nbr!=1 && nbr!=2 && nbr!=3 && nbr!=4 && nbr!=5 && nbr!=6 && nbr!=7&& nbr!=8 && nbr!=9 && nbr!=10);
			if(nbr==0) {
				System.out.println("*************");
				System.out.println("add provider:");
				Provider_command pc1=new Provider_command(0,"w","w",0);
				s.addProviderCommand(pc1);
			}else if(nbr==1) {
				System.out.println("***********");
				System.out.println("Add product:");
				Product p1=new Product(0,"xyz",0,0);
				s.addProduct(p1);	
			}else if(nbr==2) {
				System.out.println("****************");
				System.out.println("Display product:");
				s.displayProduct();
			}else if(nbr==3) {
				System.out.println("****************");
				System.out.println("Add clients:");
				Client_command c= new Client_command(0,"w","e",0);
				c=s.addClientCommand(c);
			}else if(nbr==4) {
				System.out.println("****************");
				System.out.println("Display clients:");
				s.displayClient_command();
			}else if(nbr==5) {
				System.out.println("***********");
				System.out.println("add new pc:");
				New_Computer c1=new  New_Computer(0,"d",12,12,12,12,12,"g","2",0,0);
				s.addnewcomputer(c1);
			}else if(nbr==6) {
				System.out.println("*************");
				System.out.println("add new part:");
				New_Part p1=new New_Part(0,"",0,"",0,0,"","",0,0);
				s.addnewpart(p1);
			}else if(nbr==7) {
				System.out.println("**************");
				System.out.println("add accessory:");
				Accessory a2=new Accessory(0,"",0,"","","","","","","",0);
				s.addaccessory(a2);
			}else if(nbr==8) {
				System.out.println("***************");
				System.out.println("display new pc:");
				s.displaynewcomputert();
			}else if(nbr==9) {
				System.out.println("*****************");
				System.out.println("display new part:");
				s.displaynewpart();
				
			}else if(nbr==10) {
				System.out.println("******************");
				System.out.println("display accessory:");
				s.displayaccessory();
			}
			
	}else if(number==2) {
		System.out.println("**************");
		System.out.println("Client commend");
		System.out.println("Options: 1-add old computer 2-display old computer 3-add old part 4-display old part 5-display new computer 6- display new part 7- display accessories 8-display product ");
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter an option:");
		int nb;
		do {
			nb=scan2.nextInt();
			if(nb!=1 && nb!=2 && nb!=3 && nb!=4 && nb!=5 && nb!=6 && nb!=7 && nb!=8)
				System.out.println("Error!Enter an option.");
		}while(nb!=1 && nb!=2 && nb!=3 && nb!=4 && nb!=5 && nb!=6 && nb!=7 && nb!=8);
		if(nb==1) {
			System.out.println("****************");
			System.out.println("add old computer:");
			Old_Computer opc=new Old_Computer(0,"",0,0,0,0,0,"","",0,0,"");
			opc=s.addoldcomputer(opc);
		}else if(nb==2) {
			System.out.println("********************");
			System.out.println("display old computer:");
			s.displayoldcomputer();
		}else if(nb==3) {
			System.out.println("****************");
			System.out.println("add old product:");
			Old_Part ops=new Old_Part(0,"",0,"",0,0,"","",0,0,"");
			s.addoldpart(ops);
		}else if(nb==4) {
			System.out.println("*****************");
			System.out.println("display old part:");
			s.displayoldpart();
		}else if(nb==5) {
			System.out.println("*********************");
			System.out.println("display new computer:");
			s.displaynewcomputert();
		}else if(nb==6) {
			System.out.println("*****************");
			System.out.println("display new part:");
			s.displaynewpart();
		}else if(nb==7) {
			System.out.println("********************");
			System.out.println("Display Accessories:");
			s.displayaccessory();
		}else if(nb==8) {
			System.out.println("**************************");
			System.out.println("display product from date:");
			s.displayProduct();
		}
	}
		System.out.println("do you want to restart the program? yes or no.");
			answer=scan.next();
			if(answer.equals("no"))
				System.out.println("Thanks for using my program!");
	   }while(answer.equals("yes"));
	  
}
}