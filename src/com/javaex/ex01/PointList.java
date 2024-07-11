package com.javaex.ex01;

public class PointList {
	
	//다른 자료형이 들어올수 없다 
	
	//필드
	private Point[] pArray;
	private int crtPos;
	
	
	//생성자
	public PointList() {
		//메모리 올리고
		pArray = new Point[3];
		crtPos = 0;
	}
	
	//메소드gs
	
	//메소드일반
	public void add(Point point){
		this.pArray[crtPos] = point;
		crtPos++;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
