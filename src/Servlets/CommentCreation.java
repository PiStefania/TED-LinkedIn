package Servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.comment.CommentDAO;
import database.dao.comment.CommentDAOImpl;
import database.entities.Comment;

/**
 * Servlet implementation class CommentCreation
 */
@WebServlet("/CommentCreation")
public class CommentCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CommentCreation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommentDAO dao = new CommentDAOImpl(true);
		
		//get text
		String text = request.getParameter("comment");
		if(text.equals("")) {
			text = null;
		}
		
		//get current time
		Date dNow = new Date();
		
		//get post id
		int postId = Integer.valueOf(request.getParameter("post_id"));
		
		//get user id
		int userId = Integer.valueOf((String) request.getSession().getAttribute("id"));
		
		//create comment
		Comment comment = new Comment();
		comment.setDatePosted(dNow);
		comment.setText(text);
		
		dao.create(comment,userId,postId);
		
	}

}
