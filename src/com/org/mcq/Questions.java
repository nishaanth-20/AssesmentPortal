package com.org.mcq;

public class Questions {
	int qId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	int answer;
	public Questions(int qId, String question, String option1, String option2, String option3, String option4,
			int answer) {
		
		this.qId = qId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}


}
