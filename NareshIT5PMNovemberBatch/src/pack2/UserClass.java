package pack2;

public class UserClass 
{

	public static void main(String[] args) 
	{
		
		Animal mydog = new Dog();
		mydog.sound();
		mydog.eat();
		
		Animal mycat = new Cat();
		mycat.sound();
		mycat.eat();
	}

}
