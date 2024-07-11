package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(14,14);
		Point p03 = new Point(122,122);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		Point p = pList.get(1);
		System.out.println(p.toString());
		
//---------------------------------------------//
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(15);
		Circle c03 = new Circle(115);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c = cList.get(0);
		System.out.println(c.toString());
	}

}
