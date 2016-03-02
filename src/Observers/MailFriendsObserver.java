package Observers;

import Forms.CommentForm;

public class MailFriendsObserver implements MailObserver {

	@Override
	public void update(CommentForm data) {
		// TODO Auto-generated method stub
		
		//Pegar informaçoes dos amigos do usuario que comentou em CommentForm data
		
		//Envia email para amigos do usuario que comentou
		this.send(data, null); //lista de email de amigos no segundo paranmetro
	}

	@Override
	public void send(CommentForm data, String[] emails) {
		// TODO Auto-generated method stub
		System.out.println("MailFriendsObserver: Email enviado para os amigos do usuario que comentou.");

	}

}
