import heapq

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # Merge two sorted arrays and copy the result back to nums1
        nums1[:] = list(heapq.merge(nums1[:m], nums2))
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1, p2, p = m - 1, n - 1, m + n - 1
        
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1
        
        while p2 >= 0:
            nums1[p] = nums2[p2]
            p2 -= 1
            p -= 1
import heapq

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # Merge two sorted arrays and copy the result back to nums1
        nums1[:] = list(heapq.merge(nums1[:m], nums2))
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        merged = []
        i, j = 0, 0
        
        # Merge the two arrays
        while i < m and j < n:
            if nums1[i] < nums2[j]:
                merged.append(nums1[i])
                i += 1
            else:
                merged.append(nums2[j])
                j += 1
        
        # Append the remaining elements from either array
        merged.extend(nums1[i:m])
        merged.extend(nums2[j:n])
        
        # Copy merged array back to nums1
        nums1[:] = merged
