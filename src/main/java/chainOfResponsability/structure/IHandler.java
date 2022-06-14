package chainOfResponsability.structure;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int amount);//arreglo personas
    IHandler next();
}
