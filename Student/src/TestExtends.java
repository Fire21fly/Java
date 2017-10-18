class Student{
	String name;                                                         //����
	int age;                                                             //����
	String education;                                                    //ѧ��
	Student(String nam,int ag,String edu){                               //ѧ�����ʼ����Ϣ�����췽��
		this.name=nam;
		this.age=ag;
		this.education=edu;
	}
	void show(){                                                         //���
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("ѧ��:"+education);
	}
}
class Undergraduate extends Student{
	String specialty;                                                    //רҵ
	Undergraduate(String name,int age,String education,String spe){      //���������ʼ����Ϣ�����췽��
		super(name,age,education);
		this.specialty=spe;
	}
	public void show(){                                                  //���
		super.show();
		System.out.println("רҵ:"+specialty);
	}
}
class Graduate extends Student{                                               
	String direction;                                                    //�о�����
	Graduate(String name,int age,String education,String dir){           //�о������ʼ��Ϣ�����췽��
		super(name,age,education);
		this.direction=dir;
	}
	public void show(){                                                  //���
		super.show();
		System.out.println("�о�����:"+direction);
	}
}
public class TestExtends {                                                    //����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate o1=new Undergraduate("��ޱ",21,"������","�����רҵ");
		o1.show();
		Graduate o2=new Graduate("�쳿",26,"�о���","�˹����ܷ���");
		o2.show();
	}
}

