package com.xhc.model;

import java.sql.Timestamp;

/**
 * Poetries entity. @author MyEclipse Persistence Tools
 */

public class Poetries implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer poetId;
	private String content;
	private String title;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Poets poets;
	// Constructors

	/** default constructor */
	public Poetries() {
	}

	/** full constructor */
	public Poetries(Integer poetId, String content, String title,
			Timestamp createdAt, Timestamp updatedAt) {
		this.poetId = poetId;
		this.content = content;
		this.title = title;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPoetId() {
		return this.poetId;
	}

	public void setPoetId(Integer poetId) {
		this.poetId = poetId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Poets getPoets() {
		return poets;
	}

	public void setPoets(Poets poets) {
		this.poets = poets;
	}

}