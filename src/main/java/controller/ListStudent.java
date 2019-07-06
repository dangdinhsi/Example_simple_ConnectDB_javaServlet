package controller;

import entity.Student;
import model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(urlPatterns = "/student/list")
public class ListStudent extends HttpServlet {

        private static StudentModel model = new StudentModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> list = model.getList();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
