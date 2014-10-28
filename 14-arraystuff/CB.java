public class CB {
  public int sum67(int[] nums) {
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        while(nums[i] != 7)
          i++;
      }
      else
        total += nums[i];
    }
    return total;
  }

  public boolean more14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1)
        ones++;
      else if (nums[i] == 4)
        fours++;
    }
    return ones > fours;
  }

  public int[] tenRun(int[] nums) {
    int[] out = new int[nums.length];
    int replace = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 10 == 0)
        replace = nums[i];
      if (replace == -1)
        out[i] = nums[i];
      else
        out[i] = replace;
    }
    return out;
  }

  public boolean tripleUp(int[] nums) {
    for (int i = 0; i < nums.length-2; i ++) {
      if (nums[i] == nums[i+1] -1 && nums[i] == nums[i+2]-2)
       return true; 
    }
    return false;
  }
  
  public boolean canBalance(int[] nums) {
    int left = 0;
    int right = 0;
    boolean lgr;
    for (int i = 0; i < nums.length; i++) // sum them
      right += nums[i];
    lgr = left > right;
    for (int i = 0; i < nums.length; i++) {
      left += nums[i]; 
      right -= nums[i];
      if (left == right)
        return true;
      else if ( (left > right) != lgr) // the balance shifted
        return false;
    }
    return false; // compiler leave me alone pls
  }

  public int[] seriesUp(int n) {
    int[] out = new int[n*(n+1)/2];
    int base = 0; // the base index of the "sublist"
    for (int max = 1; max <= n; max++) { // the max value of the sublist
      for (int offset = 0; offset < max; offset++) { // the index of the sublist, the offset from the base
        out[base+offset] = offset+1;
      }
      base += max;
    }
    return out;
  }
}
