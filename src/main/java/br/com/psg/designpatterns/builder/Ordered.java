package br.com.psg.designpatterns.builder;

import java.util.LinkedList;
import java.util.List;

final class Ordered implements Activity {

	private final Long id;

	private final String description;

	private final Integer order;

	private Ordered(Builder builder) {
		this.id = builder.id;
		this.description = builder.description;
		this.order = builder.order;
	}

	static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "Ordered{" +
				"id=" + id +
				", description='" + description + '\'' +
				", order=" + order +
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
		return new LinkedList<>();
	}

	@Override
	public Integer getOrder() {
		return order;
	}

	@Override
	public List<String> getVoicesResponses() {
		return new LinkedList<>();
	}

	public static class Builder implements Activity.Builder {

		private Long id;

		private String description;

		private Integer order;

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

		public Builder atOrder(Integer order) {
			this.order = order;
			return this;
		}

		@Override
		public Activity build() {
			return new Ordered(this);
		}
	}
}
