package cn.teud.demo;

public class BeanLife {
	public BeanLife(){
		System.out.println("BeanLife:bean����������");
	}
	//�Զ����ʼ������
	public void Init(){
		System.out.println("��ʼ��bean����");
	}
	public void Destroy(){
		System.out.println("bean����������");
	}
}
