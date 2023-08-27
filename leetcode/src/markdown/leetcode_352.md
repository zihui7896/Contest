### a

[https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/description/](https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/description/)

<img src="../images/352/352_a.png">

```java
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int ans = 0;
        int l = 0;
        while (l < n) {
            if (nums[l] % 2 != 0 || nums[l] > threshold) {
                ++l;

                continue;
            }

            int r = l + 1;
            while (r < n) {
                if (nums[r] > threshold || nums[r - 1] % 2 == nums[r] % 2)
                    break;

                ++r;
            }

            ans = Math.max(ans, r - l);

            l = r;
        }

        return ans;
    }
}
```

### b

[https://leetcode.cn/problems/prime-pairs-with-target-sum/](https://leetcode.cn/problems/prime-pairs-with-target-sum/)

<img src="../images/352/352_b.png">

```java
class Solution {
    private final static int MX = (int) 1e6;
    private final static int[] primes = new int[78498];
    private final static boolean[] np = new boolean[MX + 1];

    static {
        var pi = 0;
        for (var i = 2; i <= MX; ++i) {
            if (!np[i]) {
                primes[pi++] = i;
                for (var j = i; j <= MX / i; ++j) 
                    np[i * j] = true;
            }
        }
    }

    public List<List<Integer>> findPrimePairs(int n) {
        if (n % 2 > 0)
            return n > 4 && !np[n - 2] ? List.of(List.of(2, n - 2)) : List.of();
        var ans = new ArrayList<List<Integer>>();
        for (int x : primes) {
            int y = n - x;
            if (y < x) break;
            if (!np[y]) ans.add(List.of(x, y));
        }
        return ans;
    }
}
```

### c

[https://leetcode.cn/problems/continuous-subarrays/](https://leetcode.cn/problems/continuous-subarrays/)

<img src="../images/352/352_c.png">

```java

```

### d 

[https://leetcode.cn/problems/sum-of-imbalance-numbers-of-all-subarrays/](https://leetcode.cn/problems/sum-of-imbalance-numbers-of-all-subarrays/)

<img src="../images/352/352_d.png">

```java

```