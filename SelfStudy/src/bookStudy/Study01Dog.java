package bookStudy;

public class Study01Dog {
	String name;

	public static void main(String[]args) {
		Study01Dog dog1 = new Study01Dog();
		dog1.bark();
		dog1.name = "bart";


		Study01Dog[] myDog = new Study01Dog[3];
		myDog[0] = new Study01Dog();
		myDog[1] = new Study01Dog();
		myDog[2] = dog1;

		myDog[0].name = "Fred";
		myDog[1].name = "Marge";

		System.out.println("������ ���� �̸�: ");
		System.err.println(myDog[2].name);


		int x = 0;
		while (x < myDog.length) {
			myDog[x].bark();
			x = x + 1;
		}

	}


	public void bark() {
		System.out.println(name + "��(��) ��! �ϰ� ¢���ϴ�.");
	}

	public void eat() { }
	public void chase(){ }

}

