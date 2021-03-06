/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
	List<Employee> employees;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public int getImportance(List<Employee> employees, int id) {
		this.employees= employees;
		for(int i=0; i< employees.size(); i++) {
			if(employees.get(i).id==id) {
				getImportanceTotal(employees.get(i), id);
			}
		}
		return map.get(id);
	}
	public void getImportanceTotal(Employee employe, int id) {
		if(map.containsKey(id)) map.put(id, map.get(id)+employe.importance);
		else map.put(id, employe.importance);
		employe.subordinates.forEach(e -> {
			for(int i=0; i< employees.size(); i++) {
				if(e==employees.get(i).id) {
					getImportanceTotal(employees.get(i), id);
					break;
				}
			}
		});
	}
}