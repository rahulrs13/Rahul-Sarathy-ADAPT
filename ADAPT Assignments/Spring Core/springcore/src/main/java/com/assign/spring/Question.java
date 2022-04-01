package com.assign.spring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Question {
private int questionid;
private String question;
private List<String> answers;
private Set<String> answers1;
private Map<Integer,String> answers2;
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
public void setAnswers1(Set<String> answers1) {
	this.answers1 = answers1;
}
public void setAnswers2(Map<Integer,String> answers2) {
	this.answers2 = answers2;
}
void print() {
	System.out.println(getQuestionid()+":"+getQuestion());
    System.out.println("Answer in List Format: "+answers);  
    System.out.println("Answer in Set Format:" +answers1);
    System.out.println("Answer in Map Format:" +answers2);
}

}
