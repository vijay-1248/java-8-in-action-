import java.util.*;
public class CopingRChanges{
	public static List<Apple> FilterGreenApples(List<Apple> inventory,String color){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory){
			if(apple.getColor().equals(color)){
				result.add(apple);
			}

		}
		return result;
	}
}



