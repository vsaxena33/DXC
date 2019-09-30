package inheritance;

public class ContractEmployee extends Employee{
	private int payPerHour;
	private int contractDuration;
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration
				+ ", getPayPerHour()=" + getPayPerHour() + ", getContractDuration()=" + getContractDuration()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName() + "]";
	}

}
