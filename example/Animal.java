package example;
public class Animal {
	void sound() {
	      System.out.println("animal makes a sound");
	       }

	}
	class Dog extends Animal{
		void sound() {
			System.out.println("dog barks");
		}
		
	}
	class cat extends Animal{
		void sound() {
			System.out.println("cat meow");
		}
		
	}
	class cow extends Animal{
		void sound() {
			System.out.println("cow moos");
		}
		
	}
	 class Geeks{
		public static void main(String[]args) {
			Animal a;
			a=new Dog();
			a.sound();
			a=new cat();
			a.sound();
			a=new cow();
			a.sound();
		}
	}






		
