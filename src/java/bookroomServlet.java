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
public class bookroomServlet extends HttpServlet {
    // JDBC URL, username, and password of MySQL server

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/online";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    // SQL query to insert a new room
    private static final String INSERT_BOOKROOM_SQL = "INSERT INTO bookings(name, phone, email, chkInTime, chkInDate, chkOutTime, chkOutDate, roomName, roomType, noofrooms, totalPrice) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String chkInTime = request.getParameter("chkInTime");
        String chkInDate = request.getParameter("chkInDate");
        String chkOutTime = request.getParameter("chkOutTime");
        String chkOutDate = request.getParameter("chkOutDate");
        String roomName = request.getParameter("roomName");
        String roomType = request.getParameter("roomType");
        String noofrooms = request.getParameter("noOfRooms");
        String totalPrice = request.getParameter("totalPrice");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(INSERT_BOOKROOM_SQL);

            stmt.setString(1, Name);
            stmt.setString(2, phone);
            stmt.setString(3, email);
            stmt.setString(4, chkInTime);
            stmt.setString(5, chkInDate);
            stmt.setString(6, chkOutTime);
            stmt.setString(7, chkOutDate);
            stmt.setString(8, roomName);
            stmt.setString(9, roomType);
            stmt.setString(10, noofrooms);
            stmt.setString(11, totalPrice);
            stmt.executeUpdate();
            response.sendRedirect("bookings.jsp?status=success");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("bookroom.jsp?status=error");
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
