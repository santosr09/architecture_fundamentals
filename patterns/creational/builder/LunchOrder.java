public class LunchOrder {
    
    //We use an object as the builder, instead constructors
    public static class Builder {

		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		public Builder() {

		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

        // Return the instance of the builder
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

	}//Inner Class Builder

	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

    // We construct the instance using the builder
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
        this.meat = builder.meat;
	}

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}