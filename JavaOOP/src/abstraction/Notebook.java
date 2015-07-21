package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : ProductSpec을 상속한 Notebook 객체 클래스
 */ 
public class Notebook extends ProductSpec {
	private String cpu;
	private String ram;
	private String hdd;
	
	public void writeInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		super.writeInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this. hdd = hdd;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("cpu 사양 : " + this.cpu);
		System.out.println("ram 사양 : " + this.ram);
		System.out.println("hdd 사양 : " + this.hdd);
	}
}
