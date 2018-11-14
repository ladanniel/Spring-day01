package cn.teud.demo;

public class BeanLife {
	public BeanLife(){
		System.out.println("BeanLife:bean的生命周期");
	}
	//自定义初始化方法
	public void Init(){
		System.out.println("初始化bean方法");
	}
	public void Destroy(){
		System.out.println("bean方法的销毁");
	}
}
