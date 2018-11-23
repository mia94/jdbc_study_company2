package jdbc_study_company2.dao;

import java.sql.SQLException;
import java.util.List;

import jdbc_study_company2.dto.Department;

public interface DepartmentDao {
List<Department> selectDepartmentByAll() throws SQLException;
	
	int insertDepartment(Department item) throws SQLException;
	int deleteDepartment(Department item) throws SQLException;
	int updateDepartment(Department item) throws SQLException;
	
	String nextNoDepartment() throws SQLException;
}
