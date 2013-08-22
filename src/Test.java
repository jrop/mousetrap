class Test {
	public final event.Trigger<Void> somethingHappened = new event.Trigger<Void>();
	
	public void doSomething() {
		somethingHappened.trigger(null);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.somethingHappened.addListener(new event.Listener<Void>() {
			public void handle(event.Event<Void> evt, Void arg) {
				this.removeListener(); // this unwires this event from bing called in the future
				System.out.println("Something happened!");
			}
		});
		t.doSomething();
		t.doSomething();
		t.doSomething();
	}
}