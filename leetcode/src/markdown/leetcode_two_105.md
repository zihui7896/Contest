### a

<img src="../images/微信截图_20230531162545.png">

```java
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int res = money - prices[0] - prices[1];
        return res < 0 ? money : res;
    }
}
```

### b

### c
<img src="../images/微信截图_20230531162705.png">

```java
class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        long res = 1;
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (res * nums[i] > 0 || (i + 1 < n && nums[i + 1] < 0)) {
                res *= nums[i];
                cnt++;
            }
        }
        return cnt > 0 ? res : nums[n - 1];
    }
}
```