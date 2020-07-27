package model.dao;

import model.dao.impl.SellerDAOImplJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDAOImplJDBC();
	}
}
