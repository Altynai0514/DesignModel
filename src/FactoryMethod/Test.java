package FactoryMethod;


public class Test {
    @org.junit.Test
    public void test() {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        IWork studentWork = studentWorkFactory.getWork();
        studentWork.doWork();
        
        IWorkFactory teacherWorkFactory =  new TeacherWorkFactory();
        IWork teacherWork = teacherWorkFactory.getWork();
        teacherWork.doWork();
    }
}
