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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rabindra
 */
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2MB threshold after which files will be written to disk
        maxFileSize = 1024 * 1024 * 10, // 10MB max file size
        maxRequestSize = 1024 * 1024 * 50 // 50MB max request size
)
public class loginServlet extends HttpServlet {
    // JDBC URL, username, and password of MySQL server

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/online";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    // SQL query to insert a new room
    private static final String SELECT_USER_SQL = "SELECT * FROM users WHERE uname=? AND pass=?";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(SELECT_USER_SQL);

            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            rs.next();
            if (rs.getString("uname").equals(username) && rs.getString("pass").equals(password)) {
                
                HttpSession session = request.getSession();
                session.setAttribute("name", rs.getString("name"));
                session.setAttribute("email", rs.getString("email"));
                session.setAttribute("phone", rs.getString("phone"));
                
                response.sendRedirect("dash.jsp?status=success");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp?status=error");
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
