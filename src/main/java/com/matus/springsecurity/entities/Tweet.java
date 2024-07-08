package com.matus.springsecurity.entities;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tweets")
public class Tweet {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "tweet_id")
	private Long tId;
	
	@CreationTimestamp
	private Instant criateDataNow;
	private String content;
	private User user;
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public Instant getCriateDataNow() {
		return criateDataNow;
	}
	public void setCriateDataNow(Instant criateDataNow) {
		this.criateDataNow = criateDataNow;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
