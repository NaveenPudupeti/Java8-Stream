package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesJava8 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 5, 1, 6};

        // Remove duplicates using Stream distinct() and collect as a list
        Integer[] uniqueArray = Arrays.stream(array)
                                      .distinct()
                                      .toArray(Integer[]::new);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}


/*
### **RemoveDuplicatesJava8 కోడ్‌ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class RemoveDuplicatesJava8 {
```

- **RemoveDuplicatesJava8** అనే క్లాస్‌ లో array లోని డూప్లికేట్స్ తొలగించే కోడ్ రాస్తుంది.

---

### **2. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ప్రోగ్రాం అమలవడానికి ఉపయోగిస్తారు.

---

### **3. ఆరే డిఫినిషన్**

```java
Integer[] array = {1, 2, 3, 4, 2, 5, 1, 6};
```

- **array** అనే integer ఆరే లో కొన్నిసార్లు పునరావృతమవుతున్న (duplicates) విలువలు ఉన్నాయి: **1, 2**.
- **{1, 2, 3, 4, 2, 5, 1, 6}** లో **1** మరియు **2** రెండు సార్లు కనిపిస్తున్నాయి.

---

### **4. డూప్లికేట్స్ తొలగించడం**

```java
Integer[] uniqueArray = Arrays.stream(array)
                               .distinct()
                               .toArray(Integer[]::new);
```

#### **వ్యాఖ్యన**

- **Arrays.stream(array)**:
  - **array** లోని అన్ని ఎలిమెంట్లను **stream** రూపంలో మారుస్తుంది.
  
- **distinct()**:
  - స్ట్రీమ్‌లోని అన్ని డూప్లికేట్ విలువలను తొలగిస్తుంది.

- **toArray(Integer[]::new)**:
  - స్ట్రీమ్ ఫలితాన్ని ఒక కొత్త **Integer array** రూపంలో మారుస్తుంది.

---

### **5. ఫలిత ప్రింట్**

```java
System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
```

- **Arrays.toString()** ఉపయోగించి డూప్లికేట్స్ తొలగించిన array ను ప్రింట్ చేస్తుంది.

---

### **ఫలితం (Example Output)**

```
Array without duplicates: [1, 2, 3, 4, 5, 6]
```

---

### **కోడ్ ఉద్దేశం**

ఈ ప్రోగ్రాం ద్వారా **Java 8 Streams** ఉపయోగించి **array లోని డూప్లికేట్స్ తొలగించడం** ఎలా చేయాలో తెలుస్తుంది.
*/