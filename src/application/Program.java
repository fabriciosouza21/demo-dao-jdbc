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
		seller = sellerDao.findById(1);
		seller.setName("graial teste");
		sellerDao.update(seller);
		System.out.println("ok!");
		
		

	}

}
