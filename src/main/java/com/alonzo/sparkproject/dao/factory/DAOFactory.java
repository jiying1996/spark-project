package com.alonzo.sparkproject.dao.factory;

import com.alonzo.sparkproject.dao.ISessionAggrStatDAO;
import com.alonzo.sparkproject.dao.ISessionDetailDAO;
import com.alonzo.sparkproject.dao.ISessionRandomExtractDAO;
import com.alonzo.sparkproject.dao.ITaskDAO;
import com.alonzo.sparkproject.dao.ITop10CategoryDAO;
import com.alonzo.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.alonzo.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.alonzo.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.alonzo.sparkproject.dao.impl.TaskDAOImpl;
import com.alonzo.sparkproject.dao.impl.Top10CategoryDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
}