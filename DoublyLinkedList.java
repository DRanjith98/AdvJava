package com.linkedlist;



public class DLL {

    class DLL_Node{  
        int data;  
        DLL_Node previous;  
        DLL_Node next;  
  
        public DLL_Node(int data) {  
            this.data = data;  
        }  
    }  
  
    DLL_Node start, end;
    int length;

    public DLL() {  
        this.start = null; 
        this.end = null; 
        this.length = 0; 
    }  
    
    
    public void displayList() {
    	DLL_Node temp = start;
    	if(start == null)
    	{
    		System.out.println("List is Empty");
    		return;
    	}
    	System.out.println("Values in list: "); 
    	while(temp != null) {
    		System.out.println(temp.data + " ");
    		temp=temp.next;
    	}	
    }
    
    
    public void addNode(int data) {  
         
    	DLL_Node newNode = new DLL_Node(data);  
       
        if(start == null) {  
        	start = end = newNode;          
        	start.previous = null;             
        	end.next = null;  
        }  
        else {          
        	end.next = newNode;            
            newNode.previous = end;              
            end = newNode;            
            end.next = null;  
        } 
        length++;
          
    }  
  
//    public int findSize() 
//    { 
//        int length = 0; 
//        while (start != null)  
//        { 
//        	length++; 
//            start = start.next; 
//        } 
//        return length; 
//    } 
    
    
    public void set(int data, int position) 
    {    	
    	DLL_Node temp = start;
    	DLL_Node newNode = new DLL_Node(data);          
        if(temp == null && length<position) {
        	return;
         }
        else {
        for(int i=0; i<position-1; i++) {
        	temp=temp.next;
        }
        newNode.previous = temp;
        newNode.next = temp.next;
       
        newNode.next.previous = newNode;
        temp.next = newNode;             
    }     
    } 
    
    
    public void delete(int position) 
    {    	
    	DLL_Node temp = start;             
        if(temp == null && length<position) {
        	return;
         }
        else {
        for(int i=0; i<position; i++) {
        	temp=temp.next;
        }
       temp.previous.next = temp.next;
       temp.next.previous = temp.previous;
        
    } 
    
    } 
    public void get(int position) 
    {    	
    	DLL_Node current = start; 
        int count = 0; 
        while (current != null) 
        { 
            if (count == position) 
                System.out.println("The data : " + current.data); 
            count++; 
            current = current.next; 
        }    
    } 
    
    
    public static void main(String[] args) {  
    	DLL dList = new DLL();         
        dList.addNode(1);  
        dList.addNode(2); 
        dList.addNode(3); 
        dList.addNode(4);
        System.out.println("The size of List : " + dList.length);
        dList.set(5,3); 
        dList.displayList(); 
        dList.delete(3); 
        dList.displayList(); 
        dList.get(2);

        
    }  
}  