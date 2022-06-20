class Solution
{
    
    heapify(arr,n,i)
    {
    //code here
    var largest = i; // Initialize largest as root
        var l = 2 * i + 1; // left = 2*i + 1
        var r = 2 * i + 2; // right = 2*i + 2
  
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        // If largest is not root
        if (largest != i) {
            var swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            // Recursively heapify the affected sub-tree
           this.heapify(arr, n, largest);
        }
    
    }
    
    //Function to build a Heap from array.
    buildHeap(arr,n)
    {
    //code 
     for (var i = Math.floor(n / 2) - 1; i >= 0; i--)
            this.heapify(arr, n, i);
    }
    
    //Function to sort an array using Heap Sort.
    heapSort(arr,n)
    {
    //code here
    this.buildHeap(arr,n);
       for (var i = n - 1; i > 0; i--) {
            // Move current root to end
            var temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
  
            // call max heapify on the reduced heap
            this.heapify(arr, i, 0);
        }
    }
    
}
