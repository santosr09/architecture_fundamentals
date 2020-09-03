public class BuilderLunchOrderDemo {
    public static void main(String args[]) {

		LunchOrder.Builder builder = new LunchOrder.Builder(); //Get an instance of the inner class

		builder.bread("Wheat").condiments("lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());

	}
}