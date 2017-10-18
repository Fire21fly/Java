package 存款功能;
/*
Filename:TestAccount.cpp
Author:刘珂
IDE:eclipse
Description:模拟银行定期存款功能
*/
class DepositAccount{
	private String name;                               //储户名
	private String accountNumber;                      //账号
	private int password;                              //密码
	private double balance;                             //余额
	static double rate;                                 //年利率
	DepositAccount(String nam,String num,double bal){    //初始化开户
		this.name=nam;
		this.accountNumber=num;
		this.balance=bal;
	}
	public void save(float m){balance+=m;}              //存款
	public boolean draw(float m){                       //取款
		if(m<=balance){
			balance-=m;
			return true;
		}
		else return false;
		}
	public String getName(){return name;}               //查询用户名
	public String getAccountNumber(){return accountNumber;}  //查询账号
	public void setPassword(int p){password=p;}         //设置密码
	public double getBalance(){return balance;}          //查询余额
	public static void  setRate(double r){rate=r;}       //设置年利率
	public double calcu_year(){                          //计算年利息
		return balance*rate;
	}
	public double calcu_mon(){                           //计算月利息
		return balance*(rate/12);
	}
	}
	

public class TestAccount {                                    //测试

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount("ZhangSan","1234567890",5000);
		DepositAccount.setRate(0.023); 
		saver.save(2000); 
		System.out.println("账号:"+saver.getAccountNumber());
		System.out.println("户名:"+saver.getName());
		System.out.println("余额:"+saver.getBalance());
		System.out.println("年利息:"+saver.calcu_year()); 
	}

}
