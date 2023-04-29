package Hospital;
abstract class Econ_management
{
	abstract public void caldSal();
	abstract public void calnSal();
}
class Doctor extends Econ_management
{
	String dname;
	int did;
	float dsal;
	float dtax;
	static String org_name = "Wockhardt Hospital";
	
	public Doctor(String dname, int did, float dsal, float dtax) {
		super();
		this.dname = dname;
		this.did = did;
		this.dsal = dsal;
		this.dtax = dtax;
	}

	

	@Override
	public String toString() {
		return "Doctor [dname=" + dname + ", did=" + did + ", dsal=" + dsal + ", dtax=" + dtax + "]";
	}



	@Override
	public void caldSal() {
		// TODO Auto-generated method stub
		dtax=dtax/100*dsal;
		dsal=dsal-dtax;
		System.out.println("Name : "+dname);
		System.out.println("ID : "+did);
		System.out.println("Salary after the tax deduction : "+dsal);
		System.out.println(Doctor.org_name);
	}

	@Override
	public void calnSal() {
		// TODO Auto-generated method stub
		
	}
	
}
class Nurse extends Econ_management
{
	String nname;
	int nid;
	float nsal;
	float ntax;
	static String ngo_name = "Being Human";

	public Nurse(String nname, int nid, float nsal, float ntax) {
		super();
		this.nname = nname;
		this.nid = nid;
		this.nsal = nsal;
		this.ntax = ntax;
	}

	@Override
	public String toString() {
		return "Nurse [nname=" + nname + ", nid=" + nid + ", nsal=" + nsal + ", ntax=" + ntax + "]";
	}

	@Override
	public void caldSal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calnSal() {
		// TODO Auto-generated method stub
		ntax=ntax/100*nsal;
		nsal=nsal-ntax;
		System.out.println("Name : "+nname);
		System.out.println("ID : "+nid);
		System.out.println("Salary after the tax deduction : "+nsal);
		System.out.println("NGO recruit : "+Nurse.ngo_name);
	}
	
}
public class Main {
public static void main(String args[])
{
	Doctor d = new Doctor("Ajay",1201 , 100000,7);
	Nurse n = new Nurse("Akruti", 1211, 20000,14);
	System.out.println(d);
	d.caldSal();
	System.out.println(n);
	n.calnSal();	
}
}
