package com.onetmanybi.direction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "POSTM")
public class Post {

	@Id
	@GeneratedValue
	@Column(name="POST_ID")
	private Integer id;
	
	@Column(name="TITLE")
	private String title;
	
	public Post(String title) {
		this.title = title;
	}
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="post")	
	private List<PostComment> comments = new ArrayList<PostComment>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<PostComment> getComments() {
		return comments;
	}

	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}

}
