public class LevelCrossing {

    public LevelCrossing(String producer, String nameOfSystem, int numberOfBarrierMachines, int numberOfWarningDevices, int numberOfDistantSignals, boolean cooperationOSAorSUP, boolean cooperationOtherSRK, boolean cooperationEBILOCK, boolean cooperationSmartLock) {
        this.producer = producer;
        this.nameOfSystem = nameOfSystem;
        this.numberOfBarrierMachines = numberOfBarrierMachines;
        this.numberOfWarningDevices = numberOfWarningDevices;
        this.numberOfDistantSignals = numberOfDistantSignals;
        this.cooperationOSAorSUP = cooperationOSAorSUP;
        this.cooperationOtherSRK = cooperationOtherSRK;
        this.cooperationEBILOCK = cooperationEBILOCK;
        this.cooperationSmartLock = cooperationSmartLock;
    }

    public String producer;
    public String nameOfSystem;
    public int numberOfBarrierMachines;
    public int numberOfWarningDevices;
    public int numberOfDistantSignals;
    public boolean cooperationOSAorSUP;
    public boolean cooperationOtherSRK;
    public boolean cooperationEBILOCK;
    public boolean cooperationSmartLock;


    @Override
    public String toString() {
        return "LevelCrossing{" +
                "producer='" + producer + '\'' +
                ", nameOfSystem='" + nameOfSystem + '\'' +
                ", numberOfBarrierMachines=" + numberOfBarrierMachines +
                ", numberOfWarningDevices=" + numberOfWarningDevices +
                ", numberOfDistantSignals=" + numberOfDistantSignals +
                ", cooperationOSAorSUP=" + cooperationOSAorSUP +
                ", cooperationOtherSRK=" + cooperationOtherSRK +
                ", cooperationEBILOCK=" + cooperationEBILOCK +
                ", cooperationSmartLock=" + cooperationSmartLock +
                '}';
    }

    public void activation (){
        System.out.println("Activation is initiated");
}

    public void deactivation (){
        System.out.println("Dectivation is initiated");

    }

}
