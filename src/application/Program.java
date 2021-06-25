package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department departamento = new Department(1,"computacao");
		Seller seller = new Seller(1, "fabricio", "fabriciosouza21777@gmail", new Date(),3000.0 , departamento);
		System.out.println(departamento);
		System.out.println(seller);

	}

}
