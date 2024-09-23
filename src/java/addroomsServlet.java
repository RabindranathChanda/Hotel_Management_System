/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Rabindra
 */
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2MB threshold after which files will be written to disk
        maxFileSize = 1024 * 1024 * 10, // 10MB max file size
        maxRequestSize = 1024 * 1024 * 50 // 50MB max request size
)
public class addroomsServlet extends HttpServlet {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/online";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    // SQL query to insert a new room
//    private static final String INSERT_ROOM_SQL = "INSERT INTO roomcard (roomPic, roomName, roomPrice roomDesc, roomType) VALUES (?, ?, ?, ?, ?)";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the form data
        Part roomPic = request.getPart("roomPic");
        String roomName = request.getParameter("roomName");
        String roomPrice = request.getParameter("roomPrice");
        String roomDesc = request.getParameter("roomDesc");
        String roomType = request.getParameter("roomType");
        String picFName = roomPic.getSubmittedFileName();

        String uploadPath = "F:/JAVA/HMS/web/Assets/uplRoomImg/" + picFName;

        try {

            FileOutputStream fos = new FileOutputStream(uploadPath);
            InputStream is = roomPic.getInputStream();

            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Connect to the database and insert the data
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO roomcard (roomPic, roomName, roomPrice, roomDesc, roomType) VALUES (?, ?, ?, ?, ?)");

            stmt.setString(1, picFName);
            stmt.setString(2, roomName);
            stmt.setString(3, roomPrice);
            stmt.setString(4, roomDesc);
            stmt.setString(5, roomType);
            stmt.executeUpdate();
            response.sendRedirect("addrooms.jsp?status=success");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("addrooms.jsp?status=error");
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
