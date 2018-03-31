package br.com.psg.designpatterns.builder;

import java.util.LinkedList;
import java.util.List;

final class VoiceResponse implements Activity {

	private static final Integer UNORDERED = -1;

	private final Long id;

	private final String description;

	private final List<String> voicesResponses;

	private VoiceResponse(Builder builder) {
		this.id = builder.id;
		this.description = builder.description;
		this.voicesResponses = new LinkedList<>(builder.voicesResponses);
	}

	static Builder builder() {
		return new Builder();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public List<String> getChoices() {
		return new LinkedList<>();
	}

	@Override
	public Integer getOrder() {
		return UNORDERED;
	}

	@Override
	public List<String> getVoicesResponses() {
		return voicesResponses;
	}

	public static class Builder implements Activity.Builder {

		private Long id;

		private String description;

		private List<String> voicesResponses = new LinkedList<>();

		private Builder() {
		}

		@Override
		public String toString() {
			return "Builder{" +
					"id=" + id +
					", description='" + description + '\'' +
					", voicesResponses=" + voicesResponses +
					'}';
		}

		@Override
		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		@Override
		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder containingVoiceResponse(String voiceResponse) {
			this.voicesResponses.add(voiceResponse);
			return this;
		}

		@Override
		public Activity build() {
			return new VoiceResponse(this);
		}
	}

}
