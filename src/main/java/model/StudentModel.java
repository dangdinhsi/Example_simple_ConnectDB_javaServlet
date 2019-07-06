package model;


import entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentModel {

    public boolean save(Student student){
        try {
            String sql ="insert into student (username,password,email) values (?,?,?)";   //  thêm phần tử vào bảng student.
            PreparedStatement pstm = DBhelper.ketnoi().prepareStatement(sql);
            pstm.setString(1,student.getUsername());
            pstm.setString(2,student.getPassword());
            pstm.setString(3,student.getEmail());
            pstm.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }




    public ArrayList<Student> getList(){
        ArrayList<Student> list = new ArrayList<Student>();


        try {
            String sql = "select * from student";                 //truy vấn dũ liệu từ bảng student.
            PreparedStatement pstm = DBhelper.ketnoi().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                String rsUsername= rs.getString("username");
                String rsPassword =rs.getString("password");
                String rsEmail =rs.getString("email");
                Student student =new Student();
                student.setUsername(rsUsername);
                student.setPassword(rsPassword);
                student.setEmail(rsEmail);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
