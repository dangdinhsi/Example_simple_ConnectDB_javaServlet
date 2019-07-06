package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBhelper {
    public static Connection ketnoi() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String DbName = "mytest";   // Tên của database
        String DBusername = "root";
        String DBpassword = "";
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL ="jdbc:mysql://localhost:3306/" + DbName;   // tạo chuỗi kết nối với database
        if(conn==null||conn.isClosed()){
            conn =DriverManager.getConnection(connectionURL,DBusername,DBpassword);
        }
        return conn;
    }
}
