package Observers;

import Post.CommentForm;

public class MailCommenterObserver implements MailObserver {

	@Override
	public void update(CommentForm data) {
		// TODO Auto-generated method stub
		
		//Pegar informaçoes do usuario que comentou em CommentForm data
		
		//Envia email para o usuario que comentou
		this.send(data, null); //Segundo paranmetro é um lista com o email do usuario que comentou
	}

	@Override
	public void send(CommentForm data, String[] emails) {
		// TODO Auto-generated method stub
		System.out.println("MailCommenterObserver: Email enviado para o usuario que comentou.");

	}

}
