class MedianTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        // Combine the two arrays and sort the resulting array
        val combinedArray = nums1.plus(nums2).sortedArray();
        
        // Determine the size of the combined array and the index to check for the median
        val arraySize : Int = combinedArray.size;
        var indexToCheck : Int = 0;

        // If the combined array has an even number of elements, take the average of the two middle elements
        if(arraySize % 2 == 0) {
            indexToCheck = (arraySize / 2) - 1;
            return ((combinedArray[indexToCheck] + combinedArray[indexToCheck + 1]).toDouble().div(2));
        }
        // If the combined array has an odd number of elements, take the middle element as the median
        else {
            indexToCheck = ((arraySize/2) - 0).toInt();
            return combinedArray[indexToCheck].toDouble();
        }
    }
}