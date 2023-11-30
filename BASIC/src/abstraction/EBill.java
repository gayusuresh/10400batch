package abstraction;

public class EBill implements  Bill
{
	private int noofunits;
	private int costperunit;
	public EBill()
	{
		
	}
	public EBill(int noofunits, int costperunit) {
		super();
		this.noofunits = noofunits;
		this.costperunit = costperunit;
	}
	public int getNoofunits() {
		return noofunits;
	}
	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return costperunit*noofunits;
	}
	@Override
	public void display() {
      System.out.println("The Bill =:"+calculateBill());		
	}
	@Override
	public String toString() {
		return "EBill [noofunits=" + noofunits + ", costperunit=" + costperunit + "]";
	}
	

}
