package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactorialStream {

	public static void main(String[] args) {
		
		//int number = 5;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your number");
		int number =num.nextInt();
		int factorial = IntStream.rangeClosed(1, number)
				.reduce(1, (a,b) -> a*b);
		System.out.println("Factorial of"+number+"is:"+factorial);

	}

}

//5*4*3*2*1=120
/*
LongStream.rangeClosed(1, number):

Generates a stream of numbers from 1 to number (inclusive).
.reduce(1, (a, b) -> a * b):

Accumulates the product of the numbers in the stream.
The first argument, 1, is the identity for multiplication.
Result:

The result of the reduce operation is the factorial of the number.
*/

/*
 * ### **Java Program లో Step-by-Step వివరణ**

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialStream {

    public static void main(String[] args) {
        
        // Step 1: User Input కోసం Scanner object సృష్టించండి
        Scanner num = new Scanner(System.in);  
        
        // Step 2: Console లో "Enter your number" అనే మెసేజ్ ప్రింట్ అవుతుంది
        System.out.println("Enter your number:");
        
        // Step 3: User ఇచ్చిన నంబర్‌ను తీసుకుని "number" అనే variable లో భద్రపరచండి
        int number = num.nextInt();  
        
        // Step 4: IntStream.rangeClosed(1, number) 
        // → ఇది 1 నుండి number వరకు (ఇంక్లూసివ్) ఉన్న అన్ని సంఖ్యల యొక్క స్రవంతిని (stream) తయారు చేస్తుంది.
        
        // Step 5: reduce(1, (a, b) -> a * b)
        // → ఈ ఫంక్షన్ ప్రతి సంఖ్యను గుణించి మొత్తంగా factorial లెక్కిస్తుంది.
        int factorial = IntStream.rangeClosed(1, number)
                                 .reduce(1, (a, b) -> a * b);
        
        // Step 6: ఫలితాన్ని ప్రింట్ చేయడం
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
```

---

### **పూర్తి వివరాలు**

#### **Step 1: Scanner Class ఉపయోగించడం**
```java
Scanner num = new Scanner(System.in);
```
- **Scanner:** Console నుండి నంబర్ తీసుకోవడం కోసం ఈ క్లాస్ ఉపయోగిస్తారు.
- **nextInt():** User ఇచ్చిన నంబర్‌ను integer గా తీసుకుంటుంది.

---

#### **Step 2: IntStream.rangeClosed(1, number)**
```java
IntStream.rangeClosed(1, number)
```
- **rangeClosed(1, number):**  
  ఇది 1 నుంచి user ఇచ్చిన నంబర్ వరకు ఉన్న **అన్ని** సంఖ్యలను స్రవంతి (stream) రూపంలో తీసుకుంటుంది.  
  ఉదాహరణకు, `number = 5` అయితే ఇది:  
  ```
  1, 2, 3, 4, 5
  ```

---

#### **Step 3: reduce(1, (a, b) -> a * b)**
```java
.reduce(1, (a, b) -> a * b);
```
- **reduce:** Stream లో ఉన్న అన్ని సంఖ్యలను ఒకే సంఖ్యగా **గుణించడానికి** ఈ ఫంక్షన్ ఉపయోగిస్తారు.
- **a * b:**  
  - **a:** ఇప్పటివరకు గుణించిన మొత్తం.
  - **b:** Stream లోని ప్రస్తుత సంఖ్య.

**ఉదాహరణ:**  
- మొదట `1 * 1 = 1`
- తరువాత `1 * 2 = 2`
- తరువాత `2 * 3 = 6`
- తరువాత `6 * 4 = 24`
- చివరగా `24 * 5 = 120` 

---

#### **Step 4: ఫలితాన్ని ప్రింట్ చేయడం**
```java
System.out.println("Factorial of " + number + " is: " + factorial);
```
- **Example Output:**  
  ```
  Enter your number:
  5
  Factorial of 5 is: 120
  ```

---

### **Factorial అంటే ఏమిటి?**
- Factorial అనేది **n!** అని వ్రాయబడుతుంది.
- \( n! = n \times (n-1) \times (n-2) \times ... \times 1 \)  
  ఉదాహరణకు:  
  - **5! = 5 × 4 × 3 × 2 × 1 = 120**
  - **4! = 4 × 3 × 2 × 1 = 24**

### **ఈ ప్రోగ్రామ్ ఎలా పని చేస్తుందో క్లియర్ అవుతుందా?**
 */
*/