package ejr5;

public class Client {
    public static void main (String[]args) throws InterruptedException {
    Celular pc = new Celular();
    pc.setState(new Encendido());

    pc.resourceManager();
}
}