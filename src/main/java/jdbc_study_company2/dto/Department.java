package jdbc_study_company2.dto;

public class Department {
	private String deptNo;
	private String deptName;
	private int floor;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	//생성자
	public Department(String deptNo) {
		this.deptNo = deptNo;
	}

	public Department(String deptNo, String daptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = daptName;
		this.floor = floor;
	}
	//get set
	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDaptName() {
		return deptName;
	}

	public void setDaptName(String daptName) {
		this.deptName = daptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptNo == null) ? 0 : deptNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptNo == null) {
			if (other.deptNo != null)
				return false;
		} else if (!deptNo.equals(other.deptNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Department [%s, %s, %s]", deptNo, deptName, floor);
	}

	
	
}
