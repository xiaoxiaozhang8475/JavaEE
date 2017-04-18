package com.shw;
import java.util.*;

public class XmlBeanAssemble {
	//���弯�����͵�����	
	List myList1;
	List myList2;
	Set mySet;
	Map myMap;
	
	//�����ʼ������
	public void init(){
		System.out.println("XmlBeanAssemble��ĳ�ʼ������init�����ã�");
	}
	
	//�������ٷ���
	public void destroy(){
		System.out.println("XmlBeanAssemble������ٷ���destroy�����ã�");
	}
	
	//���巽��show���ڿ���̨�����������
	public void show(){
		System.out.print("ԭ��ģʽ��zhangsan���λ�õ�����ֱ�Ϊ��  ");
		for (Object obj : myList1) {
			System.out.print(((Users)obj).getLoginPwd()+"   ");			
		}	
		System.out.println("");
		System.out.print("����ģʽ��zhangsan���λ�õ�����ֱ�Ϊ��  ");
		for (Object obj : myList2) {
			System.out.print(((Users)obj).getLoginPwd()+"   ");			
		}		
		System.out.println("");
		for (Object obj : mySet) {
			if(obj instanceof Users)
				System.out.print(((Users)obj).getLoginName()+"����ѧϰ��ܣ�"+"   ");
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
