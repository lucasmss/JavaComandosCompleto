package stringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	
	private String titulo;
	
	private String content;
	
	private Integer likes;
	
	private List<Comments> comment = new ArrayList<>();

	public Post() {
	
	}

	public Post(Date moment, String titulo, String content, Integer likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getCommet() {
		return comment;
	}
	
	public void addComments(Comments comments) {
		
		comment.add(comments);
		
	}
	public void removeComments(Comments comments) {
		
		comment.remove(comments);
		
	}
	
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(titulo+"\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+"\n");
		sb.append(content+"\n");
		sb.append("Comments: \n");
		for(Comments c : comment) {
			
			sb.append(c.getText()+ "\n");
		}
		
		return sb.toString();
		
	}
		
	
}
