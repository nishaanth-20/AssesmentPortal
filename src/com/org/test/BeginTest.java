package com.org.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.org.mcq.Answer;
import com.org.mcq.Questions;



public class BeginTest {
	static ArrayList<Questions> questionList;
	static ArrayList<Answer> answerList;
	static {
		questionList = new ArrayList<Questions>();
		
		questionList.add(new Questions(1, "?????????????", "1)Java", "2)C", "3)C++", "4)Python", 1));
		
		
	}
	
	
	public Questions findQuestion(int id){
        for(Questions e:questionList){
            if(e.getqId()==id) return e;
        }
        return null;
    }
	
	
	public Answer findAnswer(int id){
        for(Answer e:answerList){
            if(e.getId()==id) return e;
        }
        return null;
    }
	
	
	void showQuestion() {
		
		int choice;
		
		Scanner s=new Scanner(System.in) ;
		
		for(Questions q:questionList) {
		System.out.println("Question" + q.getqId());
		System.out.println( q.getQuestion());
		System.out.println( q.getOption1());
		System.out.println( q.getOption2());
		System.out.println( q.getOption3());
		System.out.println( q.getOption4());
		
		System.out.println("enter your choice");
		choice=s.nextInt();
		storeAnswer(q.getqId(), choice);
		
		}
		s.close();
	}
	
	void storeAnswer(int qid,int choice) {
		answerList.add(new Answer(qid, choice));
		
		
	}
	
	int percentage() {
		Answer a;
		int score = 0;
		for(Questions q1:questionList ) {
			a=findAnswer(q1.getqId());
			if(a.getAnswer()==q1.getAnswer()) {
				score=score+1;
			}
		}
		
		
		return score;
		
	}
	

}
