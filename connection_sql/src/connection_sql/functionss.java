package connection_sql;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;



public class functionss {

	public static void printDname(Statement st) {
	    try {
	        ResultSet resultSet = st.executeQuery("SELECT * FROM DEPARTMENT   limit 10");
	        while (resultSet.next()) {
	            System.out.println(resultSet.getString("Dname") );
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static List<String> getDepartmentNames(Statement st) {
	    List<String> departmentNames = new ArrayList<>();
	    try {
	        ResultSet resultSet = st.executeQuery("SELECT Dname FROM DEPARTMENT LIMIT 10");
	        while (resultSet.next()) {
	            departmentNames.add(resultSet.getString("Dname"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return departmentNames;
	}

	
}
