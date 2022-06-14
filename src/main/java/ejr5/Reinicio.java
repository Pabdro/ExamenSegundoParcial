package ejr5;

public class Reinicio implements IStateCelu {
    @Override
    public void resourceManager(Celular computadora) throws InterruptedException {
        System.out.println("\n <<< REINICIANDO :) >>> \n");
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        computadora.getCpu().setCapacidadUtilizada(0);
        computadora.getProgramas().setProgramasUtilizados("Cerrando programas, ninguno estara disponible");
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
        computadora.getProgramas().showInfo();
    }
}