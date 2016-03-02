# Observer-example

Um exemplo de implementação do padrão de arquitetura *Observer* em Java (Eclipse project)

##Descrição do exemplo

Este exemplo simula um blog onde os posts permitem comentários de usuários. A classe que abstrai o conceito
de comentário permite o acoplamento dinâmico de observers que serão notificados na ação de submissão
de um comentário em um post. Este diagrama de classes representa a estrutura deste exemplo:


![class diagram](http://classdiagram.adresss)


A sequência de execução deste exemplo se dá pela postagem de um comentário:
a função `Comment::postComment(CommentForm)` irá chamar a função privada
`Comment::notifyObservers(CommentForm)` que irá chamar a função *update()* de
cada `Observer` acoplado na classe `Comment`.

##Exemplo de execução

```
Java

//Cria um instância de comentário
Comment comentario = new Comment();

//Adiciona observers
comentario.addObserver(new MailAuthorObserver());
comentario.addObserver(new MailCommenterObserver());
comentario.addObserver(new MailFriendsObserver());

//Cria um comentário
CommentForm data = new CommentForm(1, 3, 50, "Um comentário qualquer");

//Posta um comentário
comentario.postComment(data);

```
