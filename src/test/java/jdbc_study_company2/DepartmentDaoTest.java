package jdbc_study_company2;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jdbc_study_company2.dao.DepartmentDao;
import jdbc_study_company2.dao.DepartmentDaoImpl;
import jdbc_study_company2.dto.Department;
import jdbc_study_company2.jdbc.LogUtil;

public class DepartmentDaoTest {
	static DepartmentDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println();
		LogUtil.prnLog("Start Test");
		dao = new DepartmentDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println();
		LogUtil.prnLog("End Test");
		dao = null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println();
	}

	@Test
	public void test01selectDepartmentTest() throws SQLException {
		List<Department> list = dao.selectDepartmentByAll();
		LogUtil.prnLog(list.toString());
		Assert.assertNotNull(list);
		
	}

}
























