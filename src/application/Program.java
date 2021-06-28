package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		List<Seller> sellers = new ArrayList<Seller>();
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		Seller seller ;
		sellerDao.deleteById(1);
		System.out.println("ok!");
		
		

	}

}
