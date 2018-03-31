package br.com.psg.designpatterns.builder;

import java.util.LinkedList;
import java.util.List;

final class MultipleChoice implements Activity {

	private static final Integer UNORDERED = -1;

	private final Long id;

	private final String description;

	private final List<String> choices;

	private MultipleChoice(Builder builder) {
		this.id = builder.id;
		this.description = builder.description;
		this.choices = new LinkedList<>(builder.choices);
	}

	static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "MultipleChoice{" +
				"id=" + id +
				", description='" + description + '\'' +
				", choices=" + choices +
				'}';
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
		return choices;
	}

	@Override
	public Integer getOrder() {
		return UNORDERED;
	}

	@Override
	public List<String> getVoicesResponses() {
		return new LinkedList<>();
	}

	public static class Builder implements Activity.Builder {

		private Long id;

		private String description;

		private List<String> choices = new LinkedList<>();

		private Builder() {
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

		public Builder containingChoice(String choice) {
			this.choices.add(choice);
			return this;
		}

		@Override
		public Activity build() {
			return new MultipleChoice(this);
		}
	}
}
