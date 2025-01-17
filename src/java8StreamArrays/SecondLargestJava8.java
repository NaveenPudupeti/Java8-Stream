package java8StreamArrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestJava8 {

    public static void main(String[] args) {
        int[] array = {12, 11, 1, 10, 3, 1};

        // Find second largest using streams
        OptionalInt secondLargest = Arrays.stream(array)
                                          .distinct()                 // Remove duplicates
                                          .sorted()                   // Sort in ascending order
                                          .limit(array.length - 1)    // Skip last element (largest)
                                          .max();                     // Get max of the remaining

        // Display result
        secondLargest.ifPresentOrElse(
            value -> System.out.println("Second largest element: " + value),
            () -> System.out.println("No second largest element found.")
        );
    }
}





/*
### **SecondLargestJava8 కోడ్ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class SecondLargestJava8 {
```

- **SecondLargestJava8** అనే క్లాస్‌లో array లోని రెండవ అతిపెద్ద విలువను కనుగొనే కోడ్ ఉంటుంది.

---

### **2. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ద్వారా ప్రోగ్రాం అమలు చేయబడుతుంది.

---

### **3. ఆరే డిఫినిషన్**

```java
int[] array = {12, 11, 1, 10, 3, 1};
```

- **array** లోని ఎలిమెంట్లు **{12, 11, 1, 10, 3, 1}**  
- ఈ array లో **12** అత్యధిక విలువ, **11** రెండవ అత్యధిక విలువ.

---

### **4. రెండవ అత్యధిక విలువ కనుగొనడం**

```java
OptionalInt secondLargest = Arrays.stream(array)
                                   .distinct()                 // Remove duplicates
                                   .sorted()                   // Sort in ascending order
                                   .limit(array.length - 1)    // Skip last element (largest)
                                   .max();                     // Get max of the remaining
```

#### **వివరణ**

- **Arrays.stream(array)**:
  - **array** లోని అన్ని ఎలిమెంట్లను **stream** లోకి మార్చుతుంది.

- **distinct()**:
  - **1** వంటి డూప్లికేట్లు తొలగిస్తాయి.
  
- **sorted()**:
  - ఎలిమెంట్లను ascending క్రమంలో క్రమబద్ధం చేస్తుంది.
  - **[1, 3, 10, 11, 12]**

- **limit(array.length - 1)**:
  - **array.length - 1** అంటే చివరి (అతిపెద్ద) ఎలిమెంట్‌ను తప్పించి మిగిలిన ఎలిమెంట్లను తీసుకోవడం.
  - **[1, 3, 10, 11]**

- **max()**:
  - మిగిలిన ఎలిమెంట్లలో అత్యధిక విలువను తిరిగి ఇస్తుంది.
  - **11** రెండవ అత్యధిక విలువ.

---

### **5. ఫలిత ప్రింట్**

```java
secondLargest.ifPresentOrElse(
    value -> System.out.println("Second largest element: " + value),
    () -> System.out.println("No second largest element found.")
);
```

- **ifPresentOrElse()**:  
  - **secondLargest** లో విలువ ఉంటే ప్రింట్ చేస్తుంది.
  - విలువ లేకపోతే **No second largest element found** అని ప్రింట్ అవుతుంది.

---

### **ఫలితం (Example Output)**

```
Second largest element: 11
```

---

### **కోడ్ ఉద్దేశం**

ఈ ప్రోగ్రామ్ **Java 8 Streams** ఉపయోగించి array లో రెండవ అత్యధిక విలువను కనుగొనడం ఎలా చేయాలో చూపిస్తుంది.
*/