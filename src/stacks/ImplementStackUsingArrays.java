package stacks;

/*
 * @author gktp
 * 
 * Refer Stacks.html for more information
 * For simplicity, using data type integer to store in stack
 */
public class ImplementStackUsingArrays {
	
	private int[] array = null;
	private int top = -1;
	private int size = 0;
	
	public ImplementStackUsingArrays(int capacity) {
		this.array = new int[capacity];
	}
	
	public boolean push(int val) {
		if (isFull()) {
			System.out.println("Stack is full! Cannot insert more items.");
			return false;
		}
		this.array[++top] = val;
		this.size++;
		return true;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot remove items.");
			return Integer.MIN_VALUE;
			//throw new EmptyStackException(); //commented for program to execute completely
		} 
		int val = this.array[top];
		this.top--;
		this.size--;
		return val;
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot remove items.");
			return Integer.MIN_VALUE;
			//throw new EmptyStackException(); //commented for program to execute completely
		}
		return this.array[top];
	}
	
	private boolean isFull() {
		return this.size == this.array.length;
	}
	
	private boolean isEmpty() {
		return this.size == 0;
	}
	
	public String toString() {
		if (this.size == 0) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++) {
			sb.append(this.array[i] + " ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ImplementStackUsingArrays stack = new ImplementStackUsingArrays(3);
		System.out.println("Capacity of stack: " + stack.array.length);
		System.out.println("Element peeked: "); 
		stack.peek(); //throws EmptyStackException
		
		System.out.println("Element Pushed : " + stack.push(1));
		System.out.println("Element Pushed : " + stack.push(2));
		System.out.println("Element Pushed : " + stack.push(3));
		System.out.println("Element Pushed : " + stack.push(4)); //returns false
		
		System.out.println("Elements in stack: " + stack.toString());
		System.out.println("Size of stack: " + stack.size);
		
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element peeked: " + stack.peek());
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element popped: " + stack.pop()); //throws EmptyStackException
	}
}
