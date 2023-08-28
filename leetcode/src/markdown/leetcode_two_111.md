### a

[https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/description/](https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/description/)

```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size(); i ++) {
            for (int j = i + 1; j < nums.size(); j ++) {
                if (nums.get(i) + nums.get(j) < target) {
                    res ++;
                }
            }
        }
        return res;

    }
}
```