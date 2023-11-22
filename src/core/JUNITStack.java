package core;

import junit.framework.TestCase;


	public class JUNITStack extends TestCase {

		public void testCreateNewEmptyStack() {
			
			Stack s1 = new Stack();
			int size = s1.getSize();
			
			assertEquals (0, size);
			assertTrue (s1.isEmpty());
		}
		
		public void testElementPushElmToTop() {
			Stack s1= new Stack();
			
			s1.push(1);
			assertEquals ( 1 , s1.getTop());

		}

		
		public void testLastInFirstOut () {
			Stack s1 = new Stack();
			s1.push(1);
			s1.push(2);
			s1.push(3);
			s1.push(4);
			
			assertEquals (4, s1.getTop());
			
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			
			
		}
		
		public void testPushElmToLimitedSizeStack() {
			Stack s1 = new Stack ();
			
		}
}
