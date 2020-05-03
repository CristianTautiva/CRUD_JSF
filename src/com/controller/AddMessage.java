package com.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MensajeDao;
import com.entities.Mensaje;
import com.util.JPAUtil;

/**
 * Servlet implementation class AddMessage
 */
@WebServlet("/AddMessage")
public class AddMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("add_message.jsp"); 
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String website = request.getParameter("website");
		String mensaje = request.getParameter("mensaje");
		Mensaje objMensaje = new Mensaje();
		objMensaje.setNombre(nombre);
		objMensaje.setEmail(email);
		objMensaje.setWebsite(website);
		objMensaje.setMensaje(mensaje);
		EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
		entity.getTransaction().begin();
		entity.persist(objMensaje);
		entity.getTransaction().commit();
		System.out.println("Producto registrado.."+objMensaje);
		request.getRequestDispatcher("index.jsp") .forward(request, response);
	}

}
