class Solution {
    public int removeDuplicates(int[] nums) {
//         int j=0;
//         if(nums.length==1 || nums.length==0)
//             return nums.length;
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i]!=nums[i+1]){
//                 nums[j]=nums[i];
//                 j++;
//                 if(i+1==nums.length-1){
//                     nums[j]=nums[i+1];
//                     j++;
//                 }
//             }
//             else
//                 if(i+1==nums.length-1){
//                     nums[j]=nums[i+1];
//                     j++; 
//                 }
            
//         }
//     return j;
//     }
    
    
    
      // Check for edge cases.
  if (nums == null) {
      return 0;
  }
  
  // Use the two pointer technique to remove the duplicates in-place.
  // The first element shouldn't be touched; it's already in its correct place.
  int writePointer = 1;
  // Go through each element in the Array.
  for (int readPointer = 1; readPointer < nums.length; readPointer++) {
      // If the current element we're reading is *different* to the previous
      // element...
      if (nums[readPointer] != nums[readPointer - 1]) {
          // Copy it into the next position at the front, tracked by writePointer.
          nums[writePointer] = nums[readPointer];
          // And we need to now increment writePointer, because the next element
          // should be written one space over.
          writePointer++;
      }
  }
  
  // This turns out to be the correct length value.
  return writePointer;
}
}