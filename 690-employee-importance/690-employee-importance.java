/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int total=0;
    public int getImportance(List<Employee> employees, int id) {
        helper(employees,0,id);
        return total;
    }
    public void helper(List<Employee> e,int idx,int id){
        if(idx==e.size()) return;
        if(e.get(idx).id==id){
            total+=e.get(idx).importance;
            
            for(int i=0;i<e.get(idx).subordinates.size();i++){
                helper(e,0,e.get(idx).subordinates.get(i));
            }
        }
        helper(e,idx+1,id);        
    }
}