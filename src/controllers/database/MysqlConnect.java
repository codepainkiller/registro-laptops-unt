package controllers.database;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnect { 
	
	public Connection conn;
    private Statement statement;
    public static MysqlConnect db;
    
    private MysqlConnect() {
    	
    	String url= "jdbc:mysql://localhost:3306/";
	    String dbName = "laptops_db";
	    String driver = "com.mysql.jdbc.Driver";
	    String userName = "root";
	    String password = "";
        
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Conexion a BD exitosa!");
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
            System.out.println("Fallo en conexion a BD!");
        }
    }
    
    public static synchronized MysqlConnect getInstance() {
        if ( db == null ) {
            db = new MysqlConnect();
        }
        return db;
    }
    
    public ResultSet query(String query) throws SQLException{
    	System.out.println("Query: " + query);
    	
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
 
    public int insert(String insertQuery) throws SQLException {
    	System.out.println("Insert Query: " + insertQuery);
    	
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
}
