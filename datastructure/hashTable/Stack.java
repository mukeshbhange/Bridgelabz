package com.fellowship.datastructure.hashTable;

public class Stack<T> {
	Node<T> head;
	int count = 0;

	@SuppressWarnings("hiding")
	class Node<T> {
		public T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	public Stack() {
		this.head = null;
	}

	
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = head;
		head = node;
		count++;
	}

	
	public T pop() {
		if (head == null) {
			System.out.println("Stack UnderFlow");
			return null ;
		}
		Node<T> temp = head;
		head = temp.next;
		count--;
		return temp.data;
	}

	
	public T peek() {
		if (head == null) {
			System.out.println("no data present");
		}
		T temp = head.data;
		return temp;
	}

	public boolean isEmpty() {
		return count == 0 ? true : false;
	}

	public int size() {
		return count;
	}

	public void display() {
		Node<T> node = head;
		String temp = "";

		while (node.next != null) {
			temp += node.data+"->";
			node = node.next;
		}
		temp += node.data;
		System.out.print(temp+"->");

	}
	
	public static int evaluate(String expression)
	{
		char[] ch = expression.toCharArray();

		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> operation = new Stack<Character>();

		for (int i = 0; i < ch.length; i++)
		{

			if (ch[i] >= '0' && ch[i] <= '9'){
				StringBuffer sbuf = new StringBuffer();
				while (i < ch.length && ch[i] >= '0' &&ch[i] <= '9')
					sbuf.append(ch[i++]);
				values.push(Integer.parseInt(sbuf.toString()));
				i--;
			}

			else if (ch[i] == '(')
				operation.push(ch[i]);

			else if (ch[i] == ')')
			{
				while (operation.peek() != '(')
					values.push(applyOp(operation.pop(),
							values.pop(),
							values.pop()));
				operation.pop();
			}
			else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' ||
					ch[i] == '/'){
				while (!operation.isEmpty() && hasPrecedence(ch[i],operation.peek()))
					values.push(applyOp(operation.pop(),values.pop(),values.pop()));
				operation.push(ch[i]);
			}
		}

		while (!operation.isEmpty())
			values.push(applyOp(operation.pop(),values.pop(),values.pop()));
		return values.pop();
	}

	public static boolean hasPrecedence(
			char op1, char op2)
	{
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') &&
				(op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	public static int applyOp(char op,
			int b, int a)
	{
		switch (op)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException(
						"Cannot divide by zero");
			return a / b;
		}
		return 0;
	}
}