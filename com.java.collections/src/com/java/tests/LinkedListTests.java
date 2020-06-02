package com.java.tests;

//import all static methods from Assert class
//this way all static method of the calss can be invoked without using Class reference
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.java.collections.LinkedList;


public class LinkedListTests {

	@Test
	public void new_listIsEmpty() {
		LinkedList<Integer> list=new LinkedList<>();
		assertEquals(0, list.size());
	}

	@Test
	public void toString_returnsListWithEmptyParenthesis() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		assertEquals("LinkedList()", list.toString());
	}
	
	
	@Test
	public void add_canAddToAnEmptyList() {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);
		assertEquals(1, list.size());
	}
	
	
	@Test
	public void add_addingToANonEmptyListAddsItemAtTheEnd() {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		assertEquals(2, list.size()-1);
	}
	
	
	@Test
	public void add_addedItemsAreShownInToString() {
        LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals("LinkedList(	1	2	3	)", list.toString());
	}
	
	
	@Test
	public void get_0GetsTheFirstItem() {
		 LinkedList<Integer> list=new LinkedList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);			
		assertEquals(Integer.valueOf(1),list.get(0));
	}
	
	
	
	@Test
	public void get_PosReturnsItemsFromZeroBasedIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);			
		assertEquals(Integer.valueOf(3),list.get(2));
		
	}
	
	 
	@Test
	public void get_throwsIndexExceptionForInvalidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);			
		assertEquals(Integer.valueOf(3),list.get(4));	
	}
	
	@Ignore 
	@Test
	public void get_NegativeIndexIsACirclularIndex() {
		//-1 is last item
		//-2 is second last item
		//-3 is third last item
		//size() is first item
		
		//you will have to modify LinkedList to implement this feature
	}
	
	
	@Test
	public void set_setDoesntAddNewItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.set(5,4);
	   assertEquals("IndexOutOfBoundsException",list.get(5));	
		
	}
	
	 
	@Test
	public void set_replacesCurrentItem() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.insert(2, 4);
		 assertEquals(Integer.valueOf(4),list.get(2));	
		
	}
	
	
	@Test
	public void set_failsForInvalidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);	
		list.set(4, 4);;
		assertEquals("IndexOutOfBoundsException",list.get(4));	
	}
	
	
	@Test
	public void remove_removesTheItemFromValidIndex() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		assertEquals(Integer.valueOf(3),list.get(1));	
//		assertEquals(2,list.size());	
	}
	
	@Ignore 
	@Test
	public void remove_usesCircularIndex() {
		
	}
	
	@Test
	public void get_removeReturnsTheRemovedItem() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		assertEquals(Integer.valueOf(3), list.get(2));
	} 

	
}
