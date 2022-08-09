package sourcehan;

public class MyStackApp {
	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStackImpl<>(10); 

		ms.push(10); 
		ms.push(20); 
		ms.push(30); 
		System.out.println(ms.peek()); 
		ms.pop(); 
		System.out.println(ms.peek()); 
		ms.pop(); 
		System.out.println(ms.peek()); 
		ms.pop();
		
		System.out.println(ms.isEmpty());
	}
}

interface MyStack<E> {
	// 스택 가장 상단의 데이터를 가져오고 삭제하는 메소드
	public E pop();
	
	// 현재 가장 상단의 데이터를 가져오는 메소드
	public E peek();
	
	// 스택이 비었는지 확인하는 메소드
	public boolean isEmpty();
	
	// 데이터를 스택에 삽입하는 메소드
	public void push(E data);
}

class MyStackImpl<E> implements MyStack<E>{
	private Object[] elementData;
	private int index; // 현재 인덱스 확인

    public MyStackImpl(int size){
        elementData = new Object[size];
        index = 0;
    }
	
	@Override
	public E pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		} else {
			E item = peek();
			elementData[index--] = null;
			return item;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public E peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		} else {
			return (E)elementData[index - 1];
		}
	}

	@Override
	public boolean isEmpty() {
		return (index <= 0);
	}

	@Override
	public void push(E data) {
		if (index >= elementData.length) {
			throw new IndexOutOfBoundsException("stack full");
		} else {
			elementData[index++] = data;
		}
	}
}