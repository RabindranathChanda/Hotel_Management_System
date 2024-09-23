/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rabindra
 */
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2MB threshold after which files will be written to disk
        maxFileSize = 1024 * 1024 * 10, // 10MB max file size
        maxRequestSize = 1024 * 1024 * 50 // 50MB max request size
)
public class regUserServlet extends HttpServlet {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/online";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    private static final String INSERT_BOOKROOM_SQL = "INSERT INTO users(name, uname, pass, email, phone) VALUES (?,?,?,?,?)";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("Name");
        String uname = request.getParameter("Username");
        String pass = request.getParameter("Password");
        String email = request.getParameter("Email");
        String phone = request.getParameter("Phone");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(INSERT_BOOKROOM_SQL);

            stmt.setString(1, name);
            stmt.setString(2, uname);
            stmt.setString(3, pass);
            stmt.setString(4, email);
            stmt.setString(5, phone);
            stmt.executeUpdate();
            response.sendRedirect("login.jsp?status=success");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?status=error");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
