package ����;
/*
Filename:TestAccount.cpp
Author:����
IDE:eclipse
Description:ģ�����ж��ڴ���
*/
class DepositAccount{
	private String name;                               //������
	private String accountNumber;                      //�˺�
	private int password;                              //����
	private double balance;                             //���
	static double rate;                                 //������
	DepositAccount(String nam,String num,double bal){    //��ʼ������
		this.name=nam;
		this.accountNumber=num;
		this.balance=bal;
	}
	public void save(float m){balance+=m;}              //���
	public boolean draw(float m){                       //ȡ��
		if(m<=balance){
			balance-=m;
			return true;
		}
		else return false;
		}
	public String getName(){return name;}               //��ѯ�û���
	public String getAccountNumber(){return accountNumber;}  //��ѯ�˺�
	public void setPassword(int p){password=p;}         //��������
	public double getBalance(){return balance;}          //��ѯ���
	public static void  setRate(double r){rate=r;}       //����������
	public double calcu_year(){                          //��������Ϣ
		return balance*rate;
	}
	public double calcu_mon(){                           //��������Ϣ
		return balance*(rate/12);
	}
	}
	

public class TestAccount {                                    //����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount("ZhangSan","1234567890",5000);
		DepositAccount.setRate(0.023); 
		saver.save(2000); 
		System.out.println("�˺�:"+saver.getAccountNumber());
		System.out.println("����:"+saver.getName());
		System.out.println("���:"+saver.getBalance());
		System.out.println("����Ϣ:"+saver.calcu_year()); 
	}

}
