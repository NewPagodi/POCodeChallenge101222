package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListIntersectionTest {

	@Test
	void intersectionTest() {
		ListNode root = new ListNode(Integer.valueOf(3));
		root.append( new ListNode(Integer.valueOf(2)) );
		
		ListNode intersection = new ListNode(null);
		root.append(intersection);
		root.append( new ListNode(Integer.valueOf(4)) );
		root.append( new ListNode(Integer.valueOf(5)) );
		
		
		
		ListNode root2 = new ListNode(Integer.valueOf(6));
		root2.append( new ListNode(Integer.valueOf(7)) );
		root2.append(intersection);
				
		ListNode computedIntersection = Main.listIntersection(root,root2);
		
		assertEquals(intersection, computedIntersection);
	}
	
	@Test
	void noIntersectionTest() {
		ListNode root = new ListNode(Integer.valueOf(3));
		root.append( new ListNode(Integer.valueOf(2)) );
		root.append( new ListNode(Integer.valueOf(4)) );
		root.append( new ListNode(Integer.valueOf(5)) );
		
		
		
		ListNode root2 = new ListNode(Integer.valueOf(6));
		root2.append( new ListNode(Integer.valueOf(7)) );
		root2.append( new ListNode(Integer.valueOf(8)) );
				
		ListNode computedIntersection = Main.listIntersection(root,root2);
		
		assertNull(computedIntersection);
	}
}
