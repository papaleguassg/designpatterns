package br.com.psg.designpatterns.template_method;

public class Choice extends Activity{

	/**
	 * Choice must have one correct answer and a less one fake answer
	 */
	@Override
	protected Boolean validate(Long correctAnswersCount, Long fakeAnswersCount) {
		return (correctAnswersCount.equals(1l) && fakeAnswersCount > 0);
	}

}
