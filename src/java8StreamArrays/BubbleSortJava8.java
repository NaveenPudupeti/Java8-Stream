package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortJava8 {

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop using IntStream to iterate over unsorted section
            IntStream.range(0, n - i - 1)
                     .forEach(j -> {
                         if (array[j] > array[j + 1]) {
                             // Swap array[j] and array[j + 1]
                             int temp = array[j];
                             array[j] = array[j + 1];
                             array[j + 1] = temp;
                         }
                     });
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
/*
 * **Bubble Sort Java కోడ్‌ తెలుగు లో వివరణ**

### **1. క్లాస్ డిక్లరేషన్**

```java
public class BubbleSortJava8 {
```

- ఇది ఒక **public class**.  
- దీనిలో **BubbleSortJava8** అని పేరు ఇచ్చారు.

---

### **2. బబుల్ సార్ట్ ఫంక్షన్**

```java
public static void bubbleSort(int[] array) {
    int n = array.length;
```

- **bubbleSort()** అనే ఫంక్షన్ ఒక **int array** ను పద్ధతి ప్రకారం సజావుగా ఆరేంజ్ చేయడానికి ఉపయోగిస్తారు.
- **n** అంటే **array.length** – ఇది array లోని ఎన్ని ఎలిమెంట్స్ ఉన్నాయో చెబుతుంది.

---

### **3. బయటి లూప్ (Outer Loop)**

```java
for (int i = 0; i < n - 1; i++) {
```

- ఈ లూప్ ద్వారా ప్రతిసారి **array** లోని ఎలిమెంట్స్ ను సరైన స్థానంలో ఉంచేందుకు పాస్ చేస్తారు.
- లూప్‌ **n - 1** సార్లు ఆపరేట్ అవుతుంది ఎందుకంటే చివరి ఎలిమెంట్ ఆలోచించాల్సిన అవసరం ఉండదు.

---

### **4. లోపలి లూప్ (Inner Loop)**

```java
IntStream.range(0, n - i - 1)
         .forEach(j -> {
             if (array[j] > array[j + 1]) {
```

- **IntStream.range(0, n - i - 1)**:  
  - ఇది లూప్‌ను **0 నుండి n - i - 1 వరకు** రన్ చేస్తుంది.  
  - **i** పెరుగుతుండగా అంచెలు తగ్గుతాయి ఎందుకంటే చివరి భాగం ఇప్పటికే సజావుగా ఉంటుంది.
  
- **if (array[j] > array[j + 1])**:  
  - రెండింటి కంటే ఎక్కువ ఉన్న ఎలిమెంట్లు ఉంటే వాటి స్థానాలు మార్చబడతాయి.

---

### **5. స్థాన మార్పు (Swapping)**

```java
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
```

- **temp** అనే టెంపరరీ వేరియబుల్ ఉపయోగించి **array[j]** మరియు **array[j + 1]** స్థానాలు మారుస్తారు.

---

### **6. మైన్ ఫంక్షన్**

```java
public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Unsorted array: " + Arrays.toString(array));

    bubbleSort(array);

    System.out.println("Sorted array: " + Arrays.toString(array));
}
```

- **array** లోని ఎలిమెంట్స్‌ను ఇనిషియల్‌గా డిఫైన్స్ చేస్తారు.
- **bubbleSort(array)** పిలిచి సజావుగా క్రమబద్ధంగా ఉంచుతారు.
- చివరగా ఆ array ని ప్రింట్ చేస్తారు.

---

### **ఉదాహరణ ఫలితం (Example Output)**

```
Unsorted array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]
``` 

ఈ విధంగా **Bubble Sort** అన్నిటి కంటే చిన్న ఎలిమెంట్స్‌ను ముందుగా తీసుకురావడానికి వాడతారు.
 */
