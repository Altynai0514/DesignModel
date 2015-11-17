package FactoryMethod;

public class StudentWorkFactory implements IWorkFactory {
    @Override
    public IWork getWork() {
        return new StudentWork();
    }
}
