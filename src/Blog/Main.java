package Blog;

import Post.Comment;
import Forms.CommentForm;
import Observers.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test da rotina de observers
		
		//
		
		Comment comentario = new Comment();
		
		comentario.addObserver(new MailAuthorObserver());
		comentario.addObserver(new MailCommenterObserver());
		comentario.addObserver(new MailFriendsObserver());
		
		CommentForm data = new CommentForm(1, 3, 50, "Um comentário qualquer");
		
		comentario.postComment(data);
		
	}

}
