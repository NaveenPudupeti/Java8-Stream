package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayStream {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Reverse the array using streams
        int[] reversedArray = IntStream.range(0, array.length)
                                       .map(i -> array[array.length - i - 1])
                                       .toArray();

        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}

/*
### **ReverseArrayStream కోడ్‌ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class ReverseArrayStream {
```

- **ReverseArrayStream** అనే క్లాస్‌లో **array** లోని ఎలిమెంట్లను తిప్పి చూపించే కోడ్ ఉంది.

---

### **2. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ద్వారా ప్రోగ్రాం అమలు చేయబడుతుంది.

---

### **3. ఆరే డిఫినిషన్**

```java
int[] array = {1, 2, 3, 4, 5};
```

- **array** లోని ఎలిమెంట్లు **{1, 2, 3, 4, 5}**  
- ఈ array ను తిప్పి **{5, 4, 3, 2, 1}** గా మార్చాలి.

---

### **4. స్ట్రీమ్ ఉపయోగించి array తిప్పడం**

```java
int[] reversedArray = IntStream.range(0, array.length)
                                .map(i -> array[array.length - i - 1])
                                .toArray();
```

#### **వివరణ**

- **IntStream.range(0, array.length)**:
  - **0 నుండి array.length - 1** వరకు ఆవర్తన(loop) లాగా రన్ అవుతుంది.

- **map(i -> array[array.length - i - 1])**:
  - **i** స్థానంలో ఉన్న ఎలిమెంట్ స్థానాన్ని **array[array.length - i - 1]** తో మార్చి తిప్పుతుంది.
  - ఉదాహరణకు:
    - **i = 0** కోసం **array[array.length - 1 - 0] = array[4] = 5**
    - **i = 1** కోసం **array[array.length - 1 - 1] = array[3] = 4**

- **toArray()**:
  - ఫలితాన్ని **int array** రూపంలో మార్చుతుంది.

---

### **5. ఫలిత ప్రింట్**

```java
System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
```

- **Arrays.toString()** ఉపయోగించి తిప్పబడిన array ను ప్రింట్ చేస్తుంది.

---

### **ఫలితం (Example Output)**

```
Reversed Array: [5, 4, 3, 2, 1]
```

---

### **కోడ్ ఉద్దేశం**

ఈ ప్రోగ్రామ్ **Java 8 Streams** ఉపయోగించి array లోని ఎలిమెంట్లను తిప్పి ప్రదర్శించడం ఎలా చేయాలో చూపిస్తుంది.
*/