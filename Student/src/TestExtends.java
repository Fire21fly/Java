class Student{
	String name;                                                         //姓名
	int age;                                                             //年龄
	String education;                                                    //学历
	Student(String nam,int ag,String edu){                               //学生类初始化信息，构造方法
		this.name=nam;
		this.age=ag;
		this.education=edu;
	}
	void show(){                                                         //输出
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("学历:"+education);
	}
}
class Undergraduate extends Student{
	String specialty;                                                    //专业
	Undergraduate(String name,int age,String education,String spe){      //本科生类初始化信息，构造方法
		super(name,age,education);
		this.specialty=spe;
	}
	public void show(){                                                  //输出
		super.show();
		System.out.println("专业:"+specialty);
	}
}
class Graduate extends Student{                                               
	String direction;                                                    //研究方向
	Graduate(String name,int age,String education,String dir){           //研究生类初始信息，构造方法
		super(name,age,education);
		this.direction=dir;
	}
	public void show(){                                                  //输出
		super.show();
		System.out.println("研究方向:"+direction);
	}
}
public class TestExtends {                                                    //测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate o1=new Undergraduate("许薇",21,"本科生","计算机专业");
		o1.show();
		Graduate o2=new Graduate("徐晨",26,"研究生","人工智能方向");
		o2.show();
	}
}

