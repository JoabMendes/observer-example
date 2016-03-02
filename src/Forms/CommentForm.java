package Forms;

public class CommentForm {
	
	private int autorId;
	private int postId;
	private int commenter;
	private  String commentText;
	
	
	
	public CommentForm(int autorId, int postId, int commenter, String commentText) {
		this.autorId = autorId;
		this.postId = postId;
		this.commenter = commenter;
		this.commentText = commentText;
	}
	
	public int getAutorId() {
		return autorId;
	}
	public void setAutorId(int autorId) {
		this.autorId = autorId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getCommenter() {
		return commenter;
	}
	public void setCommenter(int commenter) {
		this.commenter = commenter;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
}
