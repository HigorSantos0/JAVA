package jacajdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Bancoacesso {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String sql = "Select código, nome, sexo, from PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
				
		try (Connection con = DriverManager.getConnetion(url, "curso", "curso1234"));
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()) {
				
				while(rs.next()) {
					System.out.println(rs.getString("Nome"));
				}
			}

	}

}
