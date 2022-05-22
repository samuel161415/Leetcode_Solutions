
import java.util.*;;
class Solution {
    public int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        if(stockPrices.length==1)return 0;
       long y=stockPrices[1][1]-stockPrices[0][1];
       long x=stockPrices[1][0]-stockPrices[0][0];
       int count=1;
        //BigDecimal[] t=new BigDecimal[4];
        for(int i=1;i<stockPrices.length-1;i++){
        if((stockPrices[i+1][1]-stockPrices[i][1])*x!=(stockPrices[i+1][0]-stockPrices[i][0])*y){
              count++;
              y=(long)(stockPrices[i+1][1]-stockPrices[i][1]);
              x=(long)(stockPrices[i+1][0]-stockPrices[i][0]);
        }
            //slope[i]=BigDecimal.valueOf(stockPrices[i+1][1]-stockPrices[i][1]).divide(BigDecimal.valueOf(stockPrices[i+1][0]-stockPrices[i][0]));
              
        }
       
        
        return count;
        
        
    }
}