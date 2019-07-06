package controller;

import entity.Student;
import model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/student/create")
public class AddStudent extends HttpServlet {
    private static StudentModel model =new StudentModel();
    private static Student student =new Student();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("student",student);
        req.getRequestDispatcher("/register.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username =req.getParameter("username");
        String password =req.getParameter("password");
        String email =req.getParameter("email");
        student.setUsername(username);
        student.setPassword(password);
        student.setEmail(email);
        model.save(student);
        resp.sendRedirect("/student/list");
    }
}
