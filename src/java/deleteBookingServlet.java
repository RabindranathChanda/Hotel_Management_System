/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
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
public class deleteBookingServlet extends HttpServlet {  
    // JDBC URL, username, and password of MySQL server

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/online";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    // SQL query to insert a new room
    private static final String DELETE_BOOKING_SQL = "DELETE FROM bookings WHERE id = ?";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookingId = request.getParameter("bookingId");
         Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Load MySQL JDBC Driver
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish connection

            // SQL delete query
//            String sql = "DELETE FROM bookings WHERE id = ?";
            pstmt = conn.prepareStatement(DELETE_BOOKING_SQL);
            pstmt.setString(1, bookingId);

            // Execute update
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                // Redirect back to the bookings page after successful deletion
                response.sendRedirect("bookings.jsp?status=delSuccess");
            } else {
                response.sendRedirect("bookings.jsp?status=error");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
