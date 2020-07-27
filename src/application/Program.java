package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Teste 1: seller findById ----");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	
		System.out.println("--- Teste 2: seller findByDepartment ----");
		Department department = new Department(2, null);
		List<Seller> listSeller = sellerDao.findByDepartment(department);
		for (Seller obj : listSeller) {
			System.out.println(obj);	
		}
	
		System.out.println("--- Teste 2: seller findAll ----");
		List<Seller> listSellers = sellerDao.findAll();
		for (Seller obj : listSellers) {
			System.out.println(obj);	
		}
	}
}
