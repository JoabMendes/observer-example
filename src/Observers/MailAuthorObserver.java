package Observers;

import Post.CommentForm;

public class MailAuthorObserver implements MailObserver {

	@Override
	public void update(CommentForm data) {
		// TODO Auto-generated method stub
		
		//Pegar informaçoes do autor do post que foi comentado em CommentForm data
		
		//Envia email para o usuario que comentou
		this.send(data, null); //Segundo paranmetro é o email do autor do post que foi comentado
	}

	@Override
	public void send(CommentForm data, String[] emails) {
		// TODO Auto-generated method stub
		System.out.println("MailAuthorObserver: Email enviado para o autor do post comentado.");

	}

}
