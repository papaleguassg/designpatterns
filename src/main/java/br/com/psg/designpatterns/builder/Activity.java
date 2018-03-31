package br.com.psg.designpatterns.builder;

import java.util.List;

public interface Activity {

	static MultipleChoice.Builder multipleChoice() {
		return MultipleChoice.builder();
	}

	static Ordered.Builder ordered() {
		return Ordered.builder();
	}

	static VoiceResponse.Builder voiceResponse() {
		return VoiceResponse.builder();
	}

	Long getId();

	String getDescription();

	List<String> getChoices();

	Integer getOrder();

	List<String> getVoicesResponses();

	interface Builder<T extends Builder> {

		T withId(Long id);

		T withDescription(String description);

		Activity build();

	}

}
