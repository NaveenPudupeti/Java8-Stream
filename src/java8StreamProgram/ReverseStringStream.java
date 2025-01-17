package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringStream {
	public static void main(String[] args) {
		
		//String input ="Hello,World!";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter your String:");
		String input = str.next();
		
		String reversed = IntStream.range(0,input.length())
				.mapToObj(i -> input.charAt(input.length() -i-1))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println("Original String:"+input);
		System.out.println("reversed String:"+reversed);
				
	}

}
/*
 IntStream.range(0, input.length()):

Creates a stream of indices from 0 to the length of the string.
.mapToObj(i -> input.charAt(input.length() - i - 1)):

Maps each index to the corresponding character in reverse order.
.map(String::valueOf):

Converts each character to a String.
.collect(Collectors.joining()):

Joins all the characters into a single string.
 */

/*
 *### **Java Program to Reverse a String Using Streams - Telugu లో వివరణ**

```java
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ReverseStringStream {

    public static void main(String[] args) {

        // Step 1: String Input కోసం Scanner object సృష్టించండి
        Scanner str = new Scanner(System.in);

        // Step 2: Console లో "Enter your String:" అనే మెసేజ్ ప్రింట్ అవుతుంది
        System.out.println("Enter your String:");

        // Step 3: User ఇచ్చిన String ను "input" అనే variable లో భద్రపరచండి
        String input = str.next();

        // Step 4: String Reverse Logic
        String reversed = IntStream.range(0, input.length())  // 0 నుండి input.length() వరకు loop తీసుకోండి
                                    .mapToObj(i -> input.charAt(input.length() - i - 1))  // చివరి అక్షరం మొదటికి, మొదటి అక్షరం చివరికి మార్చండి
                                    .map(String::valueOf)  // ప్రతి అక్షరాన్ని String గా మార్చండి
                                    .collect(Collectors.joining());  // String ను కలిపి ఒకటిగా చేయండి

        // Step 5: Original మరియు Reversed String ను ప్రింట్ చేయడం
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
```

---

### **Step-by-Step వివరణ**

#### **Step 1: Scanner Class ఉపయోగించడం**
```java
Scanner str = new Scanner(System.in);
```
- **Scanner:** Console నుండి String తీసుకోవడం కోసం ఈ క్లాస్ ఉపయోగిస్తారు.
- **next():** Space లేకుండా ఒకే పదం తీసుకునే String ను చదవుతుంది.

---

#### **Step 2: String Reverse Logic**

```java
IntStream.range(0, input.length())
         .mapToObj(i -> input.charAt(input.length() - i - 1))
         .map(String::valueOf)
         .collect(Collectors.joining());
```

- **IntStream.range(0, input.length()):**  
  - 0 నుండి String పొడవు వరకు అన్ని index లను loop చేస్తుంది.
  
- **mapToObj(i -> input.charAt(input.length() - i - 1)):**  
  - String లోని చివరి అక్షరం నుంచి మొదటి అక్షరానికి వెనక్కి తిరిగిపోతూ ఒక ఒక అక్షరాన్ని తీసుకుంటుంది.
  
- **map(String::valueOf):**  
  - ప్రతి అక్షరాన్ని String గా మార్చుతుంది.
  
- **collect(Collectors.joining()):**  
  - అన్ని అక్షరాలను కలిపి ఒకే String గా మార్చుతుంది.

---

#### **Step 3: ఫలితాన్ని ప్రింట్ చేయడం**
```java
System.out.println("Original String: " + input);
System.out.println("Reversed String: " + reversed);
```

---

### **ఉదాహరణ Output**

```
Enter your String:
HelloWorld
Original String: HelloWorld
Reversed String: dlroWolleH
```

---

### **సాధారణ నోట్స్**
- ఈ ప్రోగ్రామ్ **Streams API** ద్వారా String ను రివర్స్ చేస్తుంది.
- **Collectors.joining()** అక్షరాలను కలిపి పూర్తి String ను ఉత్పత్తి చేయడంలో ఉపయోగపడుతుంది. 
 */
