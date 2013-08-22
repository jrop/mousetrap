package event;

import java.util.LinkedList;

public class Trigger<T> {
	private LinkedList<Listener<T>> listeners = new LinkedList<Listener<T>>();
	
	public Trigger() { }
	
	public void addListener(Listener<T> listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener<T> listener) {
		listeners.remove(listener);
	}
	
	public void trigger(T args) {
		Event<T> evt = new Event<T>(this);
		for (Listener<T> listener : listeners) {
			if (evt.isCanceled())
				break;
			
			if (listener.isEnabled())
				listener.handle(evt, args);
			
			if (listener.isRemovalPending())
				removeListener(listener);
		}
	}
}

