package ex_6;

public class Student {

    private String name;
    private int age;
//    private String active;
    boolean active = true;
//    String result = active ? "yes" : "no";



    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    @Override
    public String toString() {
        return name +" " +  age + " ";
    }
//        public String isActive() {
//            return active;
//        }
//
//        public void setActive(String active) {
//            this.active = active;
//        }



}

