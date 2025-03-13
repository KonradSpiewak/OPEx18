public class RS extends LevelCrossing {


    public RS(String producer, String nameOfSystem, int numberOfBarrierMachines, int numberOfWarningDevices, int numberOfDistantSignals, boolean cooperationOSAorSUP, boolean cooperationOtherSRK, boolean cooperationEBILOCK, boolean cooperationSmartLock) {
        super(producer, nameOfSystem, numberOfBarrierMachines, numberOfWarningDevices, numberOfDistantSignals, cooperationOSAorSUP, cooperationOtherSRK, cooperationEBILOCK, cooperationSmartLock);
    }

    public void activation (){
        System.out.println("Activation is initiated");
        System.out.println("Road signals are on");
        System.out.println("Level Crossing is protected");

    }

    public void deactivation (){
        System.out.println("Dectivation is initiated");
        System.out.println("After 6 seconds, Road Signals are off ");
        System.out.println("Level Crossing is not protected");
    }





}
