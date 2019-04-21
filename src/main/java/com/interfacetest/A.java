package com.interfacetest;
class A implements I1
{
public void foo(){System.out.println(I1.b);}

public static void main(String[] args) {
	System.out.println(I1.b);
}
}