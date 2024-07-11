package com.javaex.ex01;

public class CircleList {
	
	//다른 자료형이 들어올수 없다 
	
		//필드
	private Circle[] cArray;
	private int crtPos;
	
	
	//생성자
		public CircleList() {
			//메모리 올리고
			cArray = new Circle[3];
			crtPos = 0;
		}
		
		//메소드gs
		
		//메소드일반
		public void add(Circle circle){
			this.cArray[crtPos] = circle;
			crtPos++;
		}
		
		public Circle get(int index) {
			return cArray[index];
		}
		
		public int size() {
			return crtPos;
		}

}
