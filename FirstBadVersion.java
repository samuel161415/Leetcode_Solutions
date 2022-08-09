  int left=1;
        int middle=-1;
        int temp=-1;
        int right=n;
        while(left<=right){
          middle=left+(right-left)/2;
            if(isBadVersion(middle)){
                temp=middle;
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return temp;
