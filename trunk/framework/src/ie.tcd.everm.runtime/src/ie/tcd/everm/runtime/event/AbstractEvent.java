package ie.tcd.everm.runtime.event;

public abstract class AbstractEvent {
	public boolean execute(Object event){
		return false;
	}
}
