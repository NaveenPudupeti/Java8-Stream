package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int limit = 10;
		System.out.println("Enter your limits:");
		int limit=in.nextInt();
		
		Stream.iterate(new long[] {0,1}, fib -> new long[] {fib[1],fib[0]+fib[1]})
		 .limit(limit)
		 .map(n->n[0])
		 .forEach(System.out::println);
	
	
	}

}



/*
Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]}):

Starts with an initial pair {0, 1} representing the first two Fibonacci numbers.

Produces the next pair by summing the two numbers: {previous_second, previous_first + previous_second}.
.limit(limit):

Limits the stream to the desired number of Fibonacci numbers.
.map(n -> n[0]):

Extracts the first number in each pair, which corresponds to the Fibonacci sequence.
.forEach(System.out::println):

Prints each number in the sequence.
*/

/*
 * ### **Java Program for Fibonacci Series Explanation in Telugu**

```java
import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Step 1: User Input కోసం Scanner object సృష్టించండి
        Scanner in = new Scanner(System.in);

        // Step 2: Console లో "Enter your limits:" అనే మెసేజ్ ప్రింట్ అవుతుంది
        System.out.println("Enter your limits:");
        
        // Step 3: User ఇచ్చిన లిమిట్‌ను "limit" అనే variable లో భద్రపరచండి
        int limit = in.nextInt();

        // Step 4: Fibonacci సిరీస్‌ను Java 8 Streams ఉపయోగించి ప్రింట్ చేయండి
        Stream.iterate(new long[] {0, 1}, fib -> new long[] {fib[1], fib[0] + fib[1]})
              .limit(limit)  // User ఇచ్చిన limit వరకూ సిరీస్ ఉత్పత్తి చేయండి
              .map(n -> n[0])  // మొదటి సంఖ్యను ప్రింట్ చేయడానికి map
              .forEach(System.out::println);  // ప్రతి సంఖ్యను ప్రింట్ చేయండి
    }
}
```

---

### **Step-by-Step వివరణ**

#### **Step 1: Scanner Class ఉపయోగించడం**
```java
Scanner in = new Scanner(System.in);
```
- **Scanner:** Console నుండి లిమిట్ తీసుకోవడం కోసం ఉపయోగిస్తారు.
- **nextInt():** User ఇచ్చిన లిమిట్‌ను integer గా తీసుకుంటుంది.

---

#### **Step 2: Fibonacci సిరీస్ తయారు చేయడం**
```java
Stream.iterate(new long[] {0, 1}, fib -> new long[] {fib[1], fib[0] + fib[1]})
```
- **`Stream.iterate(new long[] {0, 1})`:**  
  - మొదటి రెండు Fibonacci సంఖ్యలు `0` మరియు `1` గా ఇక్కడ initialize చేయబడతాయి.
  
- **Lambda Function:**  
  ```java
  fib -> new long[] {fib[1], fib[0] + fib[1]}
  ```  
  - ప్రస్తుతం ఉన్న రెండు సంఖ్యల ఆధారంగా తదుపరి సంఖ్యను లెక్కించడానికి ఈ ఫంక్షన్ ఉపయోగిస్తారు.
  - ఉదాహరణకు:
    - మొదట `{0, 1}`
    - తరువాత `{1, 1}` 
    - తరువాత `{1, 2}`  
    - తరువాత `{2, 3}`  
    - ఇలా కొనసాగుతుంది.

---

#### **Step 3: Limit Set చేయడం**
```java
.limit(limit)
```
- **limit:** User ఇచ్చిన లిమిట్ వరకే Fibonacci సిరీస్ ఉత్పత్తి చేస్తుంది.

---

#### **Step 4: Fibonacci సంఖ్యను ప్రింట్ చేయడం**
```java
.map(n -> n[0])
.forEach(System.out::println);
```
- **map(n -> n[0]):**  
  - ప్రతి `long[]` లో మొదటి సంఖ్య మాత్రమే తీసుకోవడానికి ఉపయోగిస్తారు.
  
- **forEach(System.out::println):**  
  - ప్రతీ Fibonacci సంఖ్యను ప్రింట్ చేయడానికి ఉపయోగిస్తారు.

---

### **ఉదాహరణ Output**

```
Enter your limits:
10
0
1
1
2
3
5
8
13
21
34
```
 */
*/