package stacks;

import linkedlist.ListNode;

/*
 * @author gktp
 * 
 * Refer Stacks.html for more information
 * For simplicity, using data type integer to store in stack
 */
public class ImplementStackUsingLinkedList {

	private ListNode head = null;
	private int size = 0;
	
	public ImplementStackUsingLinkedList() {
	
	}
	
	public boolean push(int val) {
		ListNode node = new ListNode(val);
		node.next = head;
		head = node;
		this.size++;
		return true;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot remove items.");
			return Integer.MIN_VALUE;
			//throw new EmptyStackException(); //commented for program to execute completely
		} 
		int val = head.data;
		head = head.next;
		this.size--;
		return val;
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot remove items.");
			return Integer.MIN_VALUE;
			//throw new EmptyStackException(); //commented for program to execute completely
		} 
		return head.data;
	}
	
	private boolean isEmpty() {
		return this.size == 0;
	}
	
	public String toString() {
		if (this.size == 0) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		ListNode curr = head;
		while (curr != null) {
			sb.append(curr.data + " ");
			curr = curr.next;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ImplementStackUsingLinkedList stack = new ImplementStackUsingLinkedList();
		System.out.println("Element peeked: "); 
		stack.peek(); //throws EmptyStackException
		
		System.out.println("Element Pushed : " + stack.push(1));
		System.out.println("Element Pushed : " + stack.push(2));
		System.out.println("Element Pushed : " + stack.push(3));
		System.out.println("Element Pushed : " + stack.push(4)); 
		
		System.out.println("Elements in stack: " + stack.toString());
		System.out.println("Size of stack: " + stack.size);
		
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element peeked: " + stack.peek());
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element popped: " + stack.pop());
		System.out.println("Element popped: " + stack.pop()); //throws EmptyStackException
	}
}
