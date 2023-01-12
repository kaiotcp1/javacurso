package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES" + "(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Kaio");
			st.setString(2, "kaiotcp1@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("08/08/2000").getTime()));
			st.setDouble(4, 3333.00);
			st.setInt(5, 4);

			int rowsAffectd = st.executeUpdate();
			
			if(rowsAffectd > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done id = " + id);
				}
			} else {
				System.out.println("No rown affected!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}