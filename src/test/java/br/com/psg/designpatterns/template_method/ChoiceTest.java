package br.com.psg.designpatterns.template_method;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ChoiceTest {

	
	@Test
	public void should_be_valid() {
		
		Answer answer = new Answer();
		answer.setIsCorrect(false);
		answer.setText("Buenos Aires");
		
		Answer answer2 = new Answer();
		answer2.setIsCorrect(true);
		answer2.setText("Brasilia");
		
		Activity choice = new Choice();
		choice.setAnswers(Arrays.asList(answer, answer2));
		choice.setQuestion("What`s the capital of Brazil");
		
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
		
		Activity choice = new Choice();
		choice.setAnswers(Arrays.asList(answer, answer2));
		choice.setQuestion("What`s the capital of Brazil");
		
		Assert.assertFalse(choice.isValid());
		
	}
	
	@Test(expected = RuntimeException.class)
	public void should_throw_an_exception() {
		Activity choice = new Choice();
		choice.setQuestion("What`s the capital of Brazil");
		
		Assert.assertFalse(choice.isValid());
		
	}

}
