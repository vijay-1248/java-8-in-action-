import java.util.*;
public class CopingRChanges{
	public static List<Apple> FilterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory){
			if("green".equals(apple.getColor())){
				result.add(apple);
			}

		}
		return result;
	}
}



