package com.thaleswell;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * I don't think we can create lists with intersection or looping nodes with
 * Java's list classes, so I'll create my own basic list class.
 * 
 */
class ListNode{
	
	public ListNode(Object data){
		super();
		this.data = data;
		this.next = null;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}
	
	public void append(ListNode next) {
		
		ListNode n = this;
		
		while ( n.getNext() != null ) {
			n = n.getNext();
		}
		
		n.setNext(next);
	}

	private Object data;
	private ListNode next;
}


public class Main {
	
	static void iterateList(ListNode start){
		ListNode n = start;
		
		while ( n != null ) {
			if ( n.getData() != null) {
				System.out.println(n.toString() + " data:" +n.getData().toString());
			}
			else {
				System.out.println(n.toString() + " data:null");
			}
			
			n = n.getNext();
		}
	}
	
	public static ListNode loopDetection(ListNode root) {
		ListNode loopStart = null;
		
		Set<ListNode> alreadySeen = new HashSet<>();
		
		while ( root != null ) {
			if ( alreadySeen.contains(root) ) {
				loopStart = root;
				break;
			}
			
			alreadySeen.add(root);
			root = root.getNext();
		}
		
		return loopStart;
	}
	
	public static ListNode listIntersection(ListNode first, ListNode second) {
		
		boolean found = false;
		
		while ( second != null ) {
			ListNode curentFirst = first;
			while ( curentFirst != null ) {
				
				if ( curentFirst == second ) {
					found = true;
					break;
				}
				
				curentFirst = curentFirst.getNext();
			}
			
			if ( found ) {
				break;
			}
			
			second = second.getNext();
		}
		
		return second;
	}
	
	public static void main(String[] args) {
	}

}
