package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Customer_Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String c_id = request.getParameter("id");
		int id = Integer.parseInt(c_id);

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		String mobNo = request.getParameter("mobNo");
		long phoneNo = Long.parseLong(mobNo);

		String city = request.getParameter("city");

		String pass = request.getParameter("pass");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch432", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"insert into customer(customer_id, customer_name,email,mobile_no,city,password)values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4, phoneNo);
			ps.setString(5, city);
			ps.setString(6, pass);
			int check = ps.executeUpdate();
			if (check > 0) {
				out.print("<h1 style = 'color:green'>" + "Registration Successfully ...! " + "</h1>");

				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);

			} else {
				out.print("<h1 style = 'color:red'>" + "NOT inserted ...! " + "</h1>");

				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				rd.include(request, response);
			}
		} catch (Exception e) {

		}
	}
}
