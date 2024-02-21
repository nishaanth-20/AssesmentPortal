package com.org.test;

import java.util.ArrayList;

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
	
	
	void showQuestion(int id) {
		Questions q=findQuestion(id);
		
		System.out.println("Question" + q.getqId());
		System.out.println( q.getQuestion());
		System.out.println( q.getOption1());
		System.out.println( q.getOption2());
		System.out.println( q.getOption3());
		System.out.println( q.getOption4());
		
		
	}
	
	void storeAnswer(int qid,int choice) {
		answerList.add(new Answer(qid, choice));
		
		
	}
	

}
