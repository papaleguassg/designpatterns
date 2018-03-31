package br.com.psg.designpatterns.builder;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ActivityTest {

	@Test
	public void should_create_a_multiple_choice_activity() throws Exception {
		Activity builded = Activity.multipleChoice()
				.withId(1L)
				.withDescription("Multiple choice activities")
				.containingChoice("Choice one")
				.containingChoice("Choice two")
				.build();

		assertThat(builded.getId(), equalTo(1L));
		assertThat(builded.getDescription(), equalTo("Multiple choice activities"));
		assertThat(builded.getChoices(), equalTo(Lists.newArrayList("Choice one", "Choice two")));
		assertThat(builded.getOrder(), equalTo(-1));
		assertThat(builded.getVoicesResponses(), empty());
	}

	@Test
	public void should_create_a_ordered_activity() throws Exception {
		Activity builded = Activity.ordered()
				.withId(2L)
				.withDescription("Ordered activities")
				.atOrder(1)
				.build();

		assertThat(builded.getId(), equalTo(2L));
		assertThat(builded.getDescription(), equalTo("Ordered activities"));
		assertThat(builded.getChoices(), empty());
		assertThat(builded.getOrder(), equalTo(1));
		assertThat(builded.getVoicesResponses(), empty());
	}

	@Test
	public void should_create_a_voice_response_activity() throws Exception {
		Activity builded = Activity.voiceResponse()
				.withId(3L)
				.withDescription("Voice response activities")
				.containingVoiceResponse("Voice one")
				.containingVoiceResponse("Voice two")
				.build();

		assertThat(builded.getId(), equalTo(3L));
		assertThat(builded.getDescription(), equalTo("Voice response activities"));
		assertThat(builded.getChoices(), empty());
		assertThat(builded.getOrder(), equalTo(-1));
		assertThat(builded.getVoicesResponses(), equalTo(Lists.newArrayList("Voice one", "Voice two")));
	}
}