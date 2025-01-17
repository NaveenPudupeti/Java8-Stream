package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your Palindrome String:");
        String in = input.next();
        
        boolean isPalindrome = IntStream.range(0, in.length() / 2)
                .allMatch(i -> in.charAt(i) == in.charAt(in.length() - i - 1));
        
        System.out.println("Is the string \"" + in + "\" a palindrome? " + isPalindrome);
    }
}

/*
 * IntStream.range(0, input.length() / 2):

Generates a range of integers from 0 to the middle index of the string.

input.charAt(i) == input.charAt(input.length() - i - 1):

Compares characters from the beginning and the end of the string.
allMatch:

Ensures that all comparisons return true. If even one character does not match, it returns false.
 */

/*
 * ### **Java Program for Palindrome String Check Explanation in Telugu**

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheck {

    public static void main(String[] args) {

        // Step 1: User Input కోసం Scanner object సృష్టించండి
        Scanner input = new Scanner(System.in);

        // Step 2: Console లో "Enter your Palindrome String:" అనే మెసేజ్ ప్రింట్ అవుతుంది
        System.out.println("Enter your Palindrome String:");

        // Step 3: User ఇచ్చిన String‌ను "in" అనే variable లో భద్రపరచండి
        String in = input.next();

        // Step 4: Palindrome Check Logic
        boolean isPalindrome = IntStream.range(0, in.length() / 2)
                                        .allMatch(i -> in.charAt(i) == in.charAt(in.length() - i - 1));

        // Step 5: ఫలితాన్ని ప్రింట్ చేయడం
        System.out.println("Is the string \"" + in + "\" a palindrome? " + isPalindrome);
    }
}
```

---

### **Step-by-Step వివరణ**

#### **Step 1: Scanner Class ఉపయోగించడం**
```java
Scanner input = new Scanner(System.in);
```
- **Scanner:** Console నుండి String తీసుకోవడానికి ఈ క్లాస్ ఉపయోగిస్తారు.
- **next():** User ఇచ్చిన String ను తీసుకుంటుంది (space లేకుండా ఒకే పదం).

---

#### **Step 2: Palindrome అంటే ఏమిటి?**
- **Palindrome:**  
  ఒక String ను ముందునుంచి చదివినా, వెనుక నుండి చదివినా ఒకే విధంగా ఉంటే దాన్ని **Palindrome** అంటారు.  
  ఉదాహరణ:
  - `"madam"`, `"racecar"`, `"121"`  

---

#### **Step 3: Palindrome Check Logic**
```java
IntStream.range(0, in.length() / 2)
         .allMatch(i -> in.charAt(i) == in.charAt(in.length() - i - 1));
```

- **IntStream.range(0, in.length() / 2):**  
  - String లో మొదటి సగం మాత్రమే చెక్ చేస్తుంది, ఎందుకంటే Palindrome కు మొదటి సగం మరియు చివరి సగం సమానంగా ఉండాలి.
  
- **allMatch(i -> in.charAt(i) == in.charAt(in.length() - i - 1)):**  
  - ప్రతి index `i` వద్ద ముందునుంచి ఉన్న అక్షరం మరియు వెనుకనుంచి ఉన్న అక్షరాలు సమానంగా ఉన్నాయా అని చెక్ చేస్తుంది.

---

#### **Step 4: ఫలితాన్ని ప్రింట్ చేయడం**
```java
System.out.println("Is the string \"" + in + "\" a palindrome? " + isPalindrome);
```
- **Example Output:**  
  ```
  Enter your Palindrome String:
  madam
  Is the string "madam" a palindrome? true
  ```

---

### **ప్రోగ్రామ్ ఎలా పనిచేస్తుందో స్పష్టమైందా?**
 */
