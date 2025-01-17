package java8StreamArrays;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};  // Missing number is 3
        int n = array.length + 1;  // Array should have numbers from 1 to N (N=6 here)

        // Calculate expected sum from 1 to N using formula: N * (N + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of elements in the array using streams
        int actualSum = Arrays.stream(array).sum();

        // Missing number is the difference
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}

/*
### **Find Missing Number కోడ్‌ తెలుగులో వివరణ**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class FindMissingNumber {
```

- **public class FindMissingNumber** అనే క్లాస్‌లో కోడ్ రాయబడింది.

---

### **2. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ప్రోగ్రాం ఎక్కడి నుంచి అమలవుతుందో సూచిస్తుంది.

---

### **3. ఆరే డిఫినిషన్**

```java
int[] array = {1, 2, 4, 5, 6};  // Missing number is 3
```

- **array** లోని ఎలిమెంట్లు **1 నుండి 6 వరకు** ఉండాలి. కానీ **3** ఎలిమెంట్ లేదు.
  
---

### **4. మొత్తం ఎలిమెంట్ల సంఖ్య**

```java
int n = array.length + 1;  // Array should have numbers from 1 to N (N=6 here)
```

- **array.length** అంటే array లో ప్రస్తుతం ఉన్న ఎలిమెంట్ల సంఖ్య (5).
- **+1** చేస్తే పూర్తిగా ఉండాల్సిన ఎలిమెంట్ల సంఖ్య **6** అవుతుంది.

---

### **5. అంచనా మొత్తం (Expected Sum)**

```java
int expectedSum = n * (n + 1) / 2;
```

- **1 నుండి N వరకు ఉన్న సంఖ్యల మొత్తం**ను కనుగొనే సూత్రం:  
  \[
  \text{Sum} = \frac{N \times (N + 1)}{2}
  \]
- **N = 6** కాబట్టి:
  \[
  6 \times 7 / 2 = 21
  \]
  
---

### **6. వాస్తవ మొత్తం (Actual Sum)**

```java
int actualSum = Arrays.stream(array).sum();
```

- **Arrays.stream(array).sum()**:  
  - **array** లోని అన్ని ఎలిమెంట్లను కలిపి మొత్తం ఇస్తుంది.  
  - **1 + 2 + 4 + 5 + 6 = 18**

---

### **7. కొరత ఎలిమెంట్ (Missing Number)**

```java
int missingNumber = expectedSum - actualSum;
```

- **21 - 18 = 3**  
- అందువల్ల, **3** అనేది కొరత ఉన్న ఎలిమెంట్.

---

### **8. ఫలిత ప్రింట్**

```java
System.out.println("Missing number: " + missingNumber);
```

- **Missing number: 3** అని ప్రింట్ అవుతుంది.

---

### **ఉదాహరణ ఫలితం**

```
Missing number: 3
```

---

### **కోడ్ ఉద్దేశం**

ఈ కోడ్ **1 నుండి N వరకు ఉన్న సంఖ్యలలో ఒక ఎలిమెంట్ కోల్పోయినప్పుడు** దాన్ని గుర్తించడానికి ఉపయోగపడుతుంది.
*/