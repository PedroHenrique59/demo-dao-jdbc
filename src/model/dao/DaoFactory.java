package model.dao;

import db.DB;
import model.dao.impl.SellerDAOImplJDBC;

public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDAOImplJDBC(DB.getConnection());
	}
}
