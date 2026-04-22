package Variable_Sliding_Window;

public class Notes {

    public static void main(String[] args) {

        /*

Type 2: Variable Size Window
----------------------------

Window size changes based on condition

Example:

Longest substring without repeating characters

Flow:

Expand window → j++
Check condition
If invalid → shrink window (i++)


STEP 4: General Template
------------------------

Fixed Window Template


int windowSum = 0;

// First window
for (int i = 0; i < k; i++) {
    windowSum += arr[i];
}



for (int i = k; i < n; i++) {
    windowSum += arr[i];       // add next
    windowSum -= arr[i - k];   // remove previous
}


Variable Window Template


int i = 0;

for (int j = 0; j < n; j++) {

    // expand window

    while (condition breaks) {
        // shrink window
        i++;
    }

    // update result
}


STEP 5: Key Difference

| Type     | Size     | Condition       |
| -------- | -------- | --------------- |
| Fixed    | Constant | No condition    |
| Variable | Dynamic  | Condition-based |



STEP 6: Real-Life Analogy

Window = camera frame

Fixed → same size zoom
Variable → zoom in/out based on condition


         */
    }
}
