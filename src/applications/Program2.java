package applications;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String args[]) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== Test 1: department findById ===");
        Department dep = departmentDao.findById(6);
        System.out.println(dep);

        System.out.println("=== Test 2: department findAll ===");
        List<Department> deps = departmentDao.findAll();
        for (Department d : deps){
            System.out.println(d);
        }
    }
}
