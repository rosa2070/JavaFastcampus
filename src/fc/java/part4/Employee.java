package fc.java.part4;
// 사원(VO, DTO)
public class Employee { // extends Object가 생략되어 있음
    private String name; // package가 다르면 protected로 접근 못함
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;
    public Employee() {
        super(); // 상위클래스의 생성자를 호출 -> new Object()
    }
    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.empDate=empDate;
        this.dept=dept;
        this.marriage=marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
