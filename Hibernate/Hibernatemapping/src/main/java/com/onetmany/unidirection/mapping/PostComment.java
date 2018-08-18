package com.onetmany.unidirection.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSTCOMMENT")
public class PostComment {

	@Id
	@GeneratedValue
	@Column(name = "COMMENT_ID")
	private Long id;

	@Column(name = "REVIEW")
	
	private String review;

	public PostComment(String review) {
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
