package core;

public interface IStack {

	boolean isEmpty();
	int getSize();
	boolean isFull();
	Object getTop();
	void push (Object elm) ;
	Object pop();
}
