package event;

public abstract class Listener<T> {
	private boolean enabled = true;
	public void enable() { enabled = true; }
	public void disable() { enabled = false; }
	public boolean isEnabled() { return enabled; }

	private boolean removePending = false;
	protected boolean isRemovalPending() { return removePending; }
	public void remove() { removePending = true; }
	
	public abstract void handle(Event<T> event, T args);
}

