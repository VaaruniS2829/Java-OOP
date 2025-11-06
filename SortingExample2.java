import java.util.*;
import java.util.List;
 class Student_St{
    int age;
    String name;

    public Student_St(int age , String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Student [age=" + age+ " , name=" + name + "]";
    }
}
class SortingExample2{
    public static void main(String[] args) {
   Comparator<Student_St> com = new Comparator<Student_St>() {
        public int compare(Student_St i ,Student_St j)
        {
            if(i.age%10 > j.age%10) // sorting based on age
              return 1;
            else
               return -1;
        }
    };
List<Student_St> nums = new ArrayList<>();
nums.add(new Student_St(21 , "Kavya"));
nums.add(new Student_St(22 , "Anjali"));
nums.add(new Student_St(24 , "Sushanth"));


 Collections.sort(nums, com);
// System.out.println(nums);
for(Student_St s : nums)
System.out.println(s);
}
}
