package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoopDetectionTest {

	@Test
	void noLoopTest() {
		ListNode root = new ListNode(Integer.valueOf(3));
		root.append( new ListNode(Integer.valueOf(2)) );
		root.append( new ListNode(Integer.valueOf(4)) );
		root.append( new ListNode(Integer.valueOf(5)) );
		
		ListNode loopStart = Main.loopDetection(root);
		
		assertNull(loopStart);
	}
	
	@Test
	void loopDetectionTest() {
		ListNode root3 = new ListNode(Integer.valueOf(1));
		root3.append( new ListNode(Integer.valueOf(2)) );
		ListNode looper = new ListNode(Integer.valueOf(3));
		root3.append(looper);
		root3.append( new ListNode(Integer.valueOf(4)) );
		root3.append( new ListNode(Integer.valueOf(5)) );
		root3.append(looper);
		
		ListNode loopStart = Main.loopDetection(root3);
		
		assertEquals(looper,loopStart);
	}

}
