
	public class Stack1 {

		private int[] arr;
		private int size;
		private int top;
		
		public Stack1(int size) {
			this.size=size;
			arr=new int[size];
			top=-1;
		}
		
		public boolean isEmpty() {
			return top==-1;
		}
		
		public boolean isFull() {
			return top==(size-1);
		}
		
		public boolean push(int data) {
			if(isFull()) {
				return false;
			}
			arr[++top]=data;
			return true;
		}
		
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			return arr[top--];
		}
		
//		public boolean Update(int prevdata, int newData) {
//			//int [] arrr=arr;
//			Stack<Integer> s1 = new Stack<Integer>(size);
//			
//			int i=0;
//			int data;
//			do {
//				data=pop();
//				i++;
//				s1.push(data);
//			}while(data!=prevdata);
//			data=newData;
//			s1.pop();
//			s1.push(data);
//			for(int k=0;k<i;k++) {
//				push(s1.pop());
//			}
//					return true;
//				
//				
//		}
		
			
		public boolean update(int oldNo, int newNo) {
			Stack<Integer> s= new Stack<>(size);
			
			int data;
			int count=0;
			
			do {
				data = pop();
				count++;
				s.push(data);
			} while (data != oldNo);
			
			
			data = newNo;
			s.pop();
			s.push(data);
			
			for (int i = 0; i < count; i++) {
				push(s.pop());
			}
			
			return true;
		}
		
	}

