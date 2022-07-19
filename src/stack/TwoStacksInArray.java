package stack;

import java.util.*;
public class TwoStacksInArray {

	
	//Space optimzied solution
	
	class TwoStack
{
	
	int size;
	int top1,top2;
	//int arr[] = new int[size];
	int arr[] = new int[100]; 
	
	TwoStack()
	{
		int n =100;
		size = n;
		//arr[] = new int[n];
		top1 = -1;
		top2 = size;
	}
	
	
	public static void main(String args[])
	{
		
	}
	}

/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
  //Function to push an integer into the stack1.
  void push1(int x, TwoStack sq)
  {   if(sq.top1<sq.top2){
      sq.arr[sq.top1+1] = x;
      sq.top1++;
  }
  }

  //Function to push an integer into the stack2.
  void push2(int x, TwoStack sq)
  {   if(sq.top2>sq.top1){ 
         sq.arr[sq.top2-1] = x;
          sq.top2--;}
  }

  //Function to remove an element from top of the stack1.
  int pop1(TwoStack sq)
  {   if(sq.top1>-1){
      int p =sq.arr[sq.top1]; 
      sq.top1--;
      return p;        
      }else{return -1;}
  }

  //Function to remove an element from top of the stack2.
  int pop2(TwoStack sq)
  {  if(sq.top2<100){
      int p = sq.arr[sq.top2];
      sq.top2++;
      return p;
          }else {return -1;}
  }
}


}