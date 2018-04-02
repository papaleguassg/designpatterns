package br.com.psg.designpatterns.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
	
	private String question;
	private List<Answer> answers = new ArrayList<>();
	
	public Boolean isValid() {
		if(this.answers.isEmpty()) {
			throw new RuntimeException("Activity must contains answers");
		}
		Long correctAnswersCount = getAnswers().stream().filter(answer -> answer.getIsCorrect()).count();
		Long fakeAnswersCount = getAnswers().stream().filter(answer -> !answer.getIsCorrect()).count();
		return validate(correctAnswersCount, fakeAnswersCount);
	}

	protected abstract Boolean validate(Long correctAnswersCount, Long fakeAnswersCount);

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
	
}
