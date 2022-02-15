# 二分查找

二分查找是经典的查找算法。二分查找前提：待搜索的数据结构是线性表，线性表已经排序，搜索规则可以收敛。

二分查找可以通过递归实现，因为二分查找可以转换为子线性表的二分查找问题。非递归的经典实现如下：

```java
// assume the array is increase list
// begin and end are the index of the array, end should be the array.length - 1
// key is what we search for
// return the key's index of the array
int binarySearch(int[] array, int begin, int end, int key) {
    int low = begin;
    int high = end;
    while(low <= high) {
        int mid = (low + high) >>> 1;
        int midVal = array[mid];
        if (midVal < key) {
            low = mid + 1;
        } else if (midVal > key) {
            high = mid - 1;
        } else {
            return mid;
        }
    }
    return -1;
}

// use case, search key from index 0 to array.length -1 at array
// keyIndex = binarySearch(array, 0, array.length -1, key);
```

二分查找的递归实现：

```java
    int binarySearch(int[] array, int begin, int end, int key) {       
        if (begin > end) {
            return -1;
        }

        int mid = (begin + end) >>> 1;

        if (array[mid] == key) {
            return mid;
        } else if (array[mid] < key) {
            return binarySearch(array, mid + 1, end, key);
        } else {
            return binarySearch(array, begin, mid - 1, key);
        }
    }
```

二分查找可以实现在线性表中log2(n)时间复杂度的查找

### 非典型二分

非典型的二分，比如二分前提条件中的条件进行一些变换，通常二分解决的问题是线性单调查找。也就是线性表中单调性是确定的，不存在发散。变种的二分情况一：

线性表截断后，前后移位，仍保持局部单调。

### 例题：

#### 典型二分：



#### 非典型二分：

https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/ leetcode 81 搜索旋转排序数组
