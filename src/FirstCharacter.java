

import java.util.*;
        import java.util.stream.*;
        import java.util.function.Function;

public class FirstCharacter {
    public static void main(String args[]) {
        String inputStr = "kriti raushan is a knowledgeable Software Engineer";

//        Character result = input.chars() // Stream of String
//                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1L)
//                .map(entry -> entry.getKey())
//                .findFirst()
//                .get();
//        System.out.println(result);
        for(char i :inputStr.toCharArray()){
            if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }
}
