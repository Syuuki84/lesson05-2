package animalpackaga;
 //Bridクラス
class Bird extends Animal implements Flyable {
	@Override
	void makeSound() {
		System.out.println("チュンチュン");
	}
	
	@Override
	public void fly() {
		System.out.println("飛んでいます");
	}
}
