package jdbc_study_company2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc_study_company2.dto.Department;
import jdbc_study_company2.jdbc.ConnectionProvider;
import jdbc_study_company2.jdbc.LogUtil;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public List<Department> selectDepartmentByAll() throws SQLException {
		List<Department> list = new ArrayList<>();
		String sql = "Select deptno, deptname, floor from department";
		try(Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			LogUtil.prnLog(pstmt);
			while(rs.next()) {
				list.add(getDepartment(rs));
			}
		}
		return list;
	}

	private Department getDepartment(ResultSet rs) throws SQLException {
		String deptNo = rs.getString("deptno");
		String deptName = rs.getString("deptName");
		int floor = rs.getInt("floor");
		return new Department(deptNo, deptName, floor);
	}

	@Override
	public int insertDepartment(Department item) throws SQLException {
		String sql = "insert into Department values (?,?,?,?,?,?,?,?)";
		return 0;
	}

	@Override
	public int deleteDepartment(Department item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDepartment(Department item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String nextNoDepartment() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
