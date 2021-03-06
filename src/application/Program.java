package application;

import java.util.Date;
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
	
		System.out.println("--- Teste 3: seller findAll ----");
		List<Seller> listSellers = sellerDao.findAll();
		for (Seller obj : listSellers) {
			System.out.println(obj);	
		}
		
		System.out.println("--- Teste 4: seller insert ----");
		Seller newSeller = new Seller(null, "Pedro", "pedro@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Id seller: " + newSeller.getId());
	
		System.out.println("--- Teste 5: seller update ----");
		seller = sellerDao.findById(9);
		seller.setName("Pedro Atualizado");
		sellerDao.update(seller);
	
		System.out.println("--- Teste 5: seller deleById ----");
		sellerDao.deleById(10);
	}
}
