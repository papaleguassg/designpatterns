package br.com.psg.designpatterns.template_method;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MultipleChoiceTest {

	
	@Test
	public void should_be_valid() {
		
		Answer answer = new Answer();
		answer.setIsCorrect(false);
		answer.setText("Buenos Aires");
		
		Answer answer1 = new Answer();
		answer1.setIsCorrect(false);
		answer1.setText("Londres");
		
		Answer answer2 = new Answer();
		answer2.setIsCorrect(true);
		answer2.setText("Brasilia");
		
		Answer answer3 = new Answer();
		answer3.setIsCorrect(true);
		answer3.setText("Sao Paulo");
		
		Activity choice = new MultipleChoice();
		choice.setAnswers(Arrays.asList(answer,answer1, answer2, answer3));
		choice.setQuestion("What`s cities are from Brazil?");
		
		Assert.assertTrue(choice.isValid());
		
	}
	
	@Test
	public void should_be_invalid() {
		
		Answer answer = new Answer();
		answer.setIsCorrect(false);
		answer.setText("Buenos Aires");
		
		Answer answer2 = new Answer();
		answer2.setIsCorrect(false);
		answer2.setText("Brasilia");
		
		Activity choice = new MultipleChoice();
		choice.setAnswers(Arrays.asList(answer, answer2));
		choice.setQuestion("What`s the capital of Brazil");
		
		Assert.assertFalse(choice.isValid());
		
	}
	
	@Test(expected = RuntimeException.class)
	public void should_throw_an_exception() {
		Activity choice = new MultipleChoice();
		choice.setQuestion("What`s the capital of Brazil");
		
		Assert.assertFalse(choice.isValid());
		
	}

}
