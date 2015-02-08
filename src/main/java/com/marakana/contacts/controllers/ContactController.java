package com.marakana.contacts.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.entities.Contact;
import com.marakana.contacts.repositories.ContactRepository;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;

	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public void getContactList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("contacts", contactRepository.findAll());
		RequestDispatcher view = request
				.getRequestDispatcher("view/contact/list.jsp");
		view.forward(request, response);

	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public void getContact(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("add") != null) {
			request.getRequestDispatcher("view/contact/add.jsp").forward(
					request, response);
		} else {
			long id = Long.parseLong(request.getParameter("id"));
			Contact contact = contactRepository.findOne(id);
			request.setAttribute("contact", contact);

			if (request.getParameter("edit") != null) {

				request.getRequestDispatcher("view/contact/edit.jsp").forward(
						request, response);
			} else {

				request.getRequestDispatcher("view/contact/view.jsp").forward(
						request, response);
			}
		}
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public void postContact(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		if (request.getParameter("add") != null) {
			Address address = new Address(request.getParameter("street"),
					request.getParameter("city"),
					request.getParameter("state"), request.getParameter("zip"));
			Contact contact = new Contact(request.getParameter("name"), address);
			contact = contactRepository.save(contact);
			response.sendRedirect("contact?id=" + contact.getId());
		} else if (request.getParameter("edit") != null) {
			long id = Long.parseLong(request.getParameter("id"));
			Contact contact = contactRepository.findOne(id);
			Address address = contact.getAddress();
			contact.setName(request.getParameter("name"));
			address.setStreet(request.getParameter("street"));
			address.setCity(request.getParameter("city"));
			address.setState(request.getParameter("state"));
			address.setZip(request.getParameter("zip"));
			contactRepository.save(contact);

			response.sendRedirect("contact?id=" + contact.getId());
		} else if (request.getParameter("delete") != null) {
			long id = Long.parseLong(request.getParameter("id"));
			Contact contact = contactRepository.findOne(id);
			contactRepository.delete(contact);
			response.sendRedirect("contacts");
		}
	}
}