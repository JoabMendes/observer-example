package Observers;

import Post.CommentForm;

public interface MailObserver {
	public void update(CommentForm data);
	public void send(CommentForm data, String[] emails);
}
