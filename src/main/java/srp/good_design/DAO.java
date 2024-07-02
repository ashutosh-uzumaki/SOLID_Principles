package srp.good_design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
    private Pen pen;
    private Connection connection;

    DAO(Pen pen, Connection connection){
        //save to db
    }
}
