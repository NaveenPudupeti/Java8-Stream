package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		//int number = 29;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = num.nextInt();
		
		boolean isPrime = number > 1 &&
				IntStream.rangeClosed(2, (int)Math.sqrt(number))
				.noneMatch(i -> number% i ==0);
		
		System.out.println("Is"+number+"a number?"+isPrime);
		
	}

}

/*
IntStream.rangeClosed(2, (int) Math.sqrt(number)):

Generates a stream of integers from 2 to the square root of the number. This range is sufficient for checking primality.
.noneMatch(i -> number % i == 0):

Checks that none of the numbers in the range divide the target number evenly. If any number does, the target number is not prime.
number > 1:

Ensures the number is greater than 1, as 1 and smaller numbers are not prime.
Output:

The result is a boolean value indicating whether the number is prime.

*/

/*
### **Java Program to Check Prime Number in Telugu**

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {

        // Step 1: User Input కోసం Scanner object సృష్టించండి
        Scanner num = new Scanner(System.in);

        // Step 2: Console లో "Enter your number:" అనే మెసేజ్ ప్రింట్ అవుతుంది
        System.out.println("Enter your number:");

        // Step 3: User ఇచ్చిన నంబర్‌ను "number" అనే variable లో భద్రపరచండి
        int number = num.nextInt();

        // Step 4: Prime Check Logic
        boolean isPrime = number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                         .noneMatch(i -> number % i == 0);

        // Step 5: ఫలితాన్ని ప్రింట్ చేయడం
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }
}
```

---

### **Prime Number అంటే ఏమిటి?**
- Prime నంబర్ అనేది 1 మరియు తనకు తానే మాత్రమే divide అయ్యే నంబర్.
- **ఉదాహరణ:**  
  - 2, 3, 5, 7, 11, 13 లాంటి సంఖ్యలు Prime సంఖ్యలు.
  
- **Non-Prime:**  
  - 4, 6, 8, 9 లాంటి సంఖ్యలు Prime కాదు ఎందుకంటే ఇవి ఇతర సంఖ్యలతో divide అవుతాయి.

---

### **Step-by-Step వివరణ**

#### **Step 1: Scanner Class ఉపయోగించడం**
```java
Scanner num = new Scanner(System.in);
```
- **Scanner:** Console నుండి నంబర్ తీసుకోవడం కోసం ఉపయోగిస్తారు.
- **nextInt():** User ఇచ్చిన నంబర్‌ను integer గా తీసుకుంటుంది.

---

#### **Step 2: Prime Check Logic**
```java
boolean isPrime = number > 1 &&
                  IntStream.rangeClosed(2, (int) Math.sqrt(number))
                           .noneMatch(i -> number % i == 0);
```

- **number > 1:**  
  - Prime నంబర్ ఎప్పుడూ 1 కన్నా పెద్దది అవుతుంది. 1 Prime కాదు.

- **IntStream.rangeClosed(2, (int) Math.sqrt(number)):**  
  - **2 నుండి \( \sqrt{number} \)** వరకూ అన్ని సంఖ్యలను తీసుకుంటుంది.
  - అవసరం లేకుండా అన్ని సంఖ్యలను divide చేయడం బదులుగా \( \sqrt{number} \) వరకే చెక్ చేస్తే సరిపోతుంది.

- **noneMatch(i -> number % i == 0):**  
  - ఒకాయనైనా **`number % i == 0`** అయితే అది Prime కాదు.
  - **noneMatch:** Prime అయితే అన్ని division లో remainder 0 కాకూడదు అని చెక్ చేస్తుంది.

---

#### **Step 3: ఫలితాన్ని ప్రింట్ చేయడం**
```java
System.out.println("Is " + number + " a prime number? " + isPrime);
```

---

### **ఉదాహరణలు**

#### **Example 1**
```
Enter your number:
29
Is 29 a prime number? true
```

#### **Example 2**
```
Enter your number:
30
Is 30 a prime number? false
```
*/