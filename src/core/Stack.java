package core;
import java.util.*;

public class Stack implements IStack {

	private ArrayList <Object>  a = new ArrayList <Object>();
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (a.size()==0)
		return true;
		else
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return a.size();
	}
	
	public boolean isFull() {
		return true;
	}
	

	public void push (Object elm){
	a.add (elm);
		
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return a.get(getSize()-1);
	}
	
	public Object pop() {
		
		Object out = a.get(getSize()-1);
		System.out.print(out);
		
		a.remove(a.get(getSize()-1));
		
		return out;
	}
}
