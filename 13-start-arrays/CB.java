public class CB {
  public int[] frontPiece(int[] nums) {
    int l = Math.min(2, nums.length);
    int[] out = new int[l];
    for (int i = 0; i < l; i++) {
        out[i] = nums[i];
      }
    return out;
  }

  public int sum13(int[] nums) {
    int accum = 0;
    for ( int i = 0; i < nums.length; i++) {
        if (nums[i] == 13)
          i++;
        else
          accum += nums[i];
      }
    return accum;
  }

}
