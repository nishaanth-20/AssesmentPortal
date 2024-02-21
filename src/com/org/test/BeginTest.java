package com.org.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.org.mcq.Answer;
import com.org.mcq.Questions;



public class BeginTest {
	static ArrayList<Questions> questionList;
	static ArrayList<Answer> answerList=new ArrayList<Answer>();
	static {
		questionList = new ArrayList<Questions>();
		
		questionList.add(new Questions(1, "what did we learn today", "1)Java", "2)C", "3)C++", "4)Python", 1));
		questionList.add(new Questions(2, "short form of Structured Query Language", "1)SWL", "2)UWL", "3)SQL", "4)MYSQL", 3));
		questionList.add(new Questions(3, "Which of the following is not a Java features?", "1)Dynamic", "2)Architecture Neutral", "3)pointer", "4)oops", 3));
		questionList.add(new Questions(4, "Number of primitive data types in Java are?", "1)6", "2)7", "3)8", "4)9", 3));
		questionList.add(new Questions(5, "What is the size of float and double in java?", "1)32 and 64", "2)32 and 32", "3)64 and 64", "4)64 and 32", 1));
		questionList.add(new Questions(6, "Which is a reserved word in the Java programming language?", "1)native", "2)subclasses", "3)reference", "4)array", 1));
		questionList.add(new Questions(7, "Which is a valid keyword in java?", "1)interface", "2)string", "3)Float", "4)unsigned", 1));
		questionList.add(new Questions(8, "Which is the valid declarations within an interface definition?", "1)public double methoda();", "2)public final double methoda();", "3)static void methoda(double d1);", "1)protected void methoda(double d1)", 3));
		questionList.add(new Questions(9, "Which is a valid declarations of a String", "1)String s1 = null;", "2)String s2 = 'null';", "3)String s3 = (String) 'abc';", "4)String s4 = (String) '\\ufeed';", 1));
		questionList.add(new Questions(10, "What is the numerical range of a char?", "1)-128 to 127", "2)-(215) to (215) - 1", "3)0 to 32767", "4)0 to 65535", 4));
		
		
		
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
	
	
	public void showQuestion() {
		
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
	
	public float percentage() {
		Answer a;
		float score = 0;
		float per;
		int x=questionList.size();
		for(Questions q1:questionList ) {
			a=findAnswer(q1.getqId());
			if(a.getAnswer()==q1.getAnswer()) {
				score=score+1;
			}
		}
		per=(score/x);
		
		return per*100;
		
	}
	

}
