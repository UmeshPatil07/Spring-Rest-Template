package com.infy;

public class Customer {
	
	int custId;
	String custName;
	int custAge;
	String custAddr;
	
	public Customer() {
		super();
	}

	public Customer(int custId, String custName, int custAge, String custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custAddr = custAddr;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", custAddr="
				+ custAddr + "]";
	}
	
	

}
