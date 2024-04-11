package com.db;


public interface Database {
	
	boolean connect(String url, String username, String password);
	
	boolean disconnect();
	
	void saveData(String data);
	
	String readData();

}

class DatabaseTest {
	
	public static void main(String[] args) {
		
		Database postgres = new PostgresSQL();
		// Database postgres = new MariaDB();
		
		postgres.connect("localhost:", "admin", "123");
		
		postgres.saveData("mi dato a guardar");
		postgres.readData();
		
		postgres.disconnect();
		
	}
}



class MariaDB implements Database {

	@Override
	public boolean connect(String url, String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveData(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}



class PostgresSQL implements Database{

	@Override
	public boolean connect(String url, String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveData(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return null;
	}
	
}