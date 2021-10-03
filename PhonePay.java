package com.mywork;

public class PhonePay {
	String userName;
	String place;
	long PhoneNo;
	long adharNo;
	String PAN;
	
	PhonePay(){
		System.out.println("Constructor with no parameters invoked");
	}	
	PhonePay(String userName,String place,long PhoneNo){
		System.out.println("Constructor with parameters(mandatory fields) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
	}
	PhonePay(String userName,String place,long PhoneNo,long adharNo){
		System.out.println("Constructor with parameters(mandatory fields & Adhar No.) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.adharNo=adharNo;
	}
	PhonePay(String userName,String place,long PhoneNo,String PAN){
		System.out.println("Constructor with parameters(mandatory fields & PAN) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.PAN=PAN;
	}
	PhonePay(String userName,String place,long PhoneNo,long adharNo,String PAN){
		System.out.println("Constructor with parameters(all fields) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.adharNo=adharNo;
		this.PAN=PAN;
	}
	public void Registration() {
		System.out.println(this.userName);
		System.out.println(this.place);
		System.out.println(this.PhoneNo);
		System.out.println(this.adharNo);
		System.out.println(this.PAN);
	}
		public static void transferMoney() {
			System.out.println("Money transfered successfully");
		}
		public static void rechargeMobile() {
			System.out.println("Mobile recharge successfully");
		}
		public static void electricityBill() {
			System.out.println(" Electricity bill paid");
		}
		public static void rechargeDTH() {
			System.out.println("DTH recharge done..");
		}
}


