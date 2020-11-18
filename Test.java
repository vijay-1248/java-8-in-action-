import java.util.*;
class Test {
	public static void main(String args[]){
		Apple apple1 = new Apple("green");
		Apple apple2 = new Apple("red");
		Apple apple3 = new Apple("green");
		Apple apple4 = new Apple("blue");

		List<Apple> inventory = new ArrayList();
		inventory.add(apple1);
		inventory.add(apple2);
		inventory.add(apple3);
		inventory.add(apple4);
		
		List<Apple> greenAppleInventory = CopingRChanges.FilterGreenApples(inventory,"red");

		for(Apple apple : greenAppleInventory){
			System.out.println(apple.getColor());
		}
		
	}
}
