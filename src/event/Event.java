package event;

public class Event<T> {
	private Trigger<T> trigger;
	private boolean canceled = false;
	
	protected Event(Trigger<T> trigger) {
		this.trigger = trigger;
	}
	
	protected boolean isCanceled() {
		return canceled;
	}

	public Trigger<T> getTrigger() {
		return trigger;
	}
	
	public void cancel() {
		canceled = true;
	}
}

