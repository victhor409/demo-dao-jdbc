package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
	    System.out.println("\n==== TESTE 1: Department FindById =======");
	    Department department = departmentDao.findById(3);
	    System.out.println(department);
	    
	    System.out.println("\n==== TESTE 2: Department Insert =======");
		Department newDepartment = new Department(17, "Music");
	    departmentDao.insert(newDepartment);
	    System.out.println("Inserted! New id = "+ newDepartment.getId());
	    
	    System.out.println("\n==== TESTE 3: Department Update =======");
	    department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
	    
		System.out.println("\n==== TESTE 4: Department deleteById =======");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.delteteById(id);
		System.out.println("Delete completed!");
	    
	    
		sc.close();

	}

}
