package com.dp.creational.builder;

public class Pizza {

	private boolean c;
	private boolean d;
	private boolean s;

	public Pizza(Builder builder) {
		this.c = builder.cheese;
		this.d = builder.addOn;
		this.s = builder.sauce;
	}

	static class Builder {
		private boolean cheese;
		private boolean addOn;
		private boolean sauce;
		
		public static Builder getInstance() {
			return new Builder();
		}

		public Builder addCheese() {
			this.cheese = true;
			return this;
		}

		public Builder addAddOn() {
			this.addOn = true;
			return this;
		}

		public Builder addSauce() {
			this.sauce = true;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

	@Override
	public String toString() {
		return "Your Pizza ready with Cheese - " + this.c + ", Addon - " + this.d + ", Sauce - " + this.s;
	}
}
