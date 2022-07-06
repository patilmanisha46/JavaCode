package JavaCode.JavaCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamExample {
	
	@Test
	public void streamMap() {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(5);
		list.add(9);
		list.add(21);
		list.add(4);
		
		list.stream().sorted().forEach(s->System.out.println(s));
		List<Integer> li=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Third element"+li.get(3));
		
		
		int count=(int) Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).count();
		System.out.println("Count is:"+count);	
		
		List<String> name= Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama","Komal");
		name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("++++++++++++++++++");
		name.stream().filter(s->s.startsWith("A")).map(s->s.toLowerCase()).forEach(S->System.out.println(S));
		List<String> name1=name.stream().filter(s->s.contains("am")).collect(Collectors.toList());
		System.out.println("Name containing am:"+name1);
		
		count=(int) Stream.concat(name.stream(),name1.stream()).distinct().count();
		System.out.println("Count of concatinating string:"+count);
		
		
		Boolean val= Stream.concat(name.stream(),name1.stream()).anyMatch(s->s.contains("on"));
		System.out.println("boolean val:"+val);
		
		
	}
}
