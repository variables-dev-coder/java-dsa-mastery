package slidingwindow;

public class Notes {
    public static void main(String[] args) {

        /*

STEP 1: What is Sliding Window?
------------------------------
Core Idea

👉 Instead of checking all subarrays (O(n²))
👉 Maintain a window (range) and move it

[ i .......... j ]

👉 This window slides forward → O(n)

🧠 Why Sliding Window?

❌ Brute Force

Check all subarrays

Time = O(n²)

✅ Sliding Window

Reuse previous computation

Time = O(n)

STEP 2: When to Use Sliding Window?

👉 Use Sliding Window when:
---------------------------

Array / String
Subarray / Substring
Contiguous elements
Optimize brute force


📌 Keywords to identify:
------------------------

“Longest substring”
“Minimum window”
“Maximum sum subarray”
“Count subarrays”

👉 These = Sliding Window signal

🚀 STEP 3: Types of Sliding Window

🟢 Type 1: Fixed Size Window

👉 Window size = constant (k)

Example:

Find max sum of subarray of size k

🧠 Flow:

1. Calculate first window
2. Slide window:
   add next element
   remove previous element

🔴 Type 2: Variable Size Window (Most Important)

👉 Window size changes based on condition

Example:

Longest substring without repeating characters

🧠 Flow:

Expand window → j++
Check condition
If invalid → shrink window (i++)

🔥 STEP 4: General Template (VERY IMPORTANT)

🟢 Fixed Window Template

int windowSum = 0;

// First window

for (int i = 0; i < k; i++) {
    windowSum += arr[i];
}


for (int i = k; i < n; i++) {
    windowSum += arr[i];       // add next
    windowSum -= arr[i - k];   // remove previous
}

🔴 Variable Window Template

int i = 0;

for (int j = 0; j < n; j++) {

    // expand window

    while (condition breaks) {
        // shrink window
        i++;
    }

    // update result
}

🧠 STEP 5: Key Difference (Understand Clearly)

Type	Size	Condition

Fixed	Constant	No condition

Variable	Dynamic	Condition-based


🔥 STEP 6: Real-Life Analogy

👉 Window = camera frame

Fixed → same size zoom

Variable → zoom in/out based on condition

         */
    }
}
