package javaKids;

public class PetMaster {

	public static void main(String[] args) {
String petReaction;
Pet myPet= new Pet();
myPet.eat();
petReaction = myPet.say(" Чик чирик ! !");
System.out.println(petReaction);
myPet.sleep();
Fish myFish = new Fish();
myFish.sleep();

	}

}
