package br.com.psg.designpatterns.template_method;

public class MultipleChoice extends Activity{

	/**
	 * Multiple choice must have more than one correct answers and the size of fake answer must be
	 * equal to size of correct answers
	 */
	@Override
	protected Boolean validate(Long correctAnswersCount, Long fakeAnswersCount) {
		return (correctAnswersCount > 1 && fakeAnswersCount.equals(correctAnswersCount));
	}
	
}
