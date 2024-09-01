class Student{
    public static int marks;
    void setmarks(int marks){
        this.marks=marks;
    }

}
class PracticeQs9{
    public static void main(String args[]){
        System.out.println(Student.marks);
        Student s1 = new Student();
        s1.setmarks(20);
        System.out.println(Student.marks);
        Student s2 = new Student();
        s2.setmarks(40);
        System.out.println(Student.marks);
    }
}