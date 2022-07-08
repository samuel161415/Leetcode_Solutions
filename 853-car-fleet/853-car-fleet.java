class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<position.length;i++){
            map.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        double fct=((double)(target-position[position.length-1]))/map.get(position[position.length-1]);  // front car finishing time
      
        int fleet=0;
        for(int i=position.length-2;i>=0;i--){
            double ft=((double)(target-position[i]))/map.get(position[i]); // ft is current car finishing time
              System.out.println("fct "+fct+" ft "+ft);
            if(ft>fct){   // If the current car does'nt catch up the front car concider the front car as fleet and update fct by ft
                fleet+=1;
                fct=ft;
            }   
        }
        fleet+=1;  // for the last car
        return fleet;
    }
}