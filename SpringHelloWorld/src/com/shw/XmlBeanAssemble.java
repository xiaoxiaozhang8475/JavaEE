package com.shw;
import java.util.*;

public class XmlBeanAssemble {
	//定义集合类型的属性	
	List myList1;
	List myList2;
	Set mySet;
	Map myMap;
	
	//定义初始化方法
	public void init(){
		System.out.println("XmlBeanAssemble类的初始化方法init被调用！");
	}
	
	//定义销毁方法
	public void destroy(){
		System.out.println("XmlBeanAssemble类的销毁方法destroy被调用！");
	}
	
	//定义方法show，在控制台输出各个属性
	public void show(){
		System.out.print("原型模式，zhangsan两次获得的密码分别为：  ");
		for (Object obj : myList1) {
			System.out.print(((Users)obj).getLoginPwd()+"   ");			
		}	
		System.out.println("");
		System.out.print("单例模式，zhangsan两次获得的密码分别为：  ");
		for (Object obj : myList2) {
			System.out.print(((Users)obj).getLoginPwd()+"   ");			
		}		
		System.out.println("");
		for (Object obj : mySet) {
			if(obj instanceof Users)
				System.out.print(((Users)obj).getLoginName()+"正在学习框架："+"   ");
			else
				System.out.print(obj+"\t");
		}
		System.out.println("");
		for (Object key : myMap.keySet()) {
			System.out.print(key.toString()+":"+ myMap.get(key)+"    ");
		}	
		System.out.println("");
		
	}	

	public List getMyList1() {
		return myList1;
	}

	public void setMyList1(List myList1) {
		this.myList1 = myList1;
	}

	public List getMyList2() {
		return myList2;
	}

	public void setMyList2(List myList2) {
		this.myList2 = myList2;
	}

	public Set getMySet() {
		return mySet;
	}

	public void setMySet(Set mySet) {
		this.mySet = mySet;
	}

	public Map getMyMap() {
		return myMap;
	}

	public void setMyMap(Map myMap) {
		this.myMap = myMap;
	}	

}
