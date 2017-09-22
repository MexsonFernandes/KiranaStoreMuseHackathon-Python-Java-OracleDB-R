
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;


public class DBConnection {
        public static Connection getDBConnection() throws SQLException
{
  Connection con=null;
  OracleDataSource ods;
  ods=new OracleDataSource();
  ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
  con=ods.getConnection("system","Duggu12345");
return con;
}
    
}
