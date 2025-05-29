package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enttities.EmployeeList;

public class ListEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<EmployeeList> list = new ArrayList<>();

		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		EmployeeList[] vect = new EmployeeList[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			EmployeeList emp = new EmployeeList(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idSalary);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
			System.out.println();			
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.addSalary(percentage);
			
		}

		System.out.println();
		System.out.println("List of employees:");
		
		for(EmployeeList e : list) {
			System.out.println(e);
		}
		
		sc.close();

	}
	
	
    public static Integer position(List<EmployeeList> list, int id) {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
    	return null;
    }
    
    public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
