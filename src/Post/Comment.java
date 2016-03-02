package Post;

import java.util.ArrayList;

import Observers.MailObserver;

public class Comment {
	
	protected ArrayList<MailObserver> observers;
	
	public Comment() {
		this.observers = new ArrayList<MailObserver>();
	}
	
	public void postComment(CommentForm data){
		
		//.....
		// Essa função iria enviar um comentário num post
		//......
		System.out.println("Post comentado com '"+data.getCommentText()+"'");
		
		//Aqui chama a notificação da execução desta função (Ou execução deste evento)
		this.notifyObservers(data);
	}
	
	public void addObserver(MailObserver obs){
		this.observers.add(obs);
	}
	
	public void rmvObserver(MailObserver obs){
		this.observers.remove(obs);
	}
	
	public void notifyObservers(CommentForm data){
		if(this.observers.size() > 0){
			System.out.println("Notifing observers...");
			for(int i = 0; i < this.observers.size(); i++){
				//Atualiza todos os observadores adicionandos nesta classe
				this.observers.get(i).update(data);
			}
		}else{
			//just for log
			System.out.println("No observers found");
		}
		
	}
	
}
