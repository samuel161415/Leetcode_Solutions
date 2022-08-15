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
        Map<Integer,Employee> map=new HashMap<>(); // used to access in o(1) and prevents iterating in helper function
       for(Employee e:employees){
           map.put(e.id,e);
       }
        helper(map,id);
        return total;
    }
    public void helper(Map<Integer,Employee> map,int id){
        Employee emp=map.get(id);
        total+=emp.importance;
        for(int i:emp.subordinates){
            helper(map,i);
        }   
    }
}