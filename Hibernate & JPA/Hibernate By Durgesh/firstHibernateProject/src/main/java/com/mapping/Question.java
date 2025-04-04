package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int question_id;
	private String question;
	
	@OneToMany(mappedBy = "question" , fetch = FetchType.EAGER)
	private List<Answer> answers;
	
	
	public Question(int question_id, String question, List<Answer> answers) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answers = answers;
	}


	public int getQuestion_id() {
		return question_id;
	}


	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
