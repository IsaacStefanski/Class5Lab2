package task2;

/**
 *
 * @author Isaac
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lamborghini myAventador = new Lamborghini();
        myAventador.setManufacturer("Lamborghini");
        myAventador.setModel("Aventador");
        myAventador.setYear(2017);
        myAventador.setEngineClassification("V12");
        System.out.println(myAventador.getModel() + " 0-60 MPH Time (" + myAventador.getEngineClassification() + " Engine): " + myAventador.get0To60Time());
        myAventador.setBaseMSRP(399500.00);
        myAventador.setDealerName("Lamborghini Gold Coast Chicago");
        myAventador.setLicensePlate("789-XYZ");
        myAventador.setVin("ZHWGU123456789LA7");
        myAventador.setRunning(true);        
        if(myAventador.isRunning()){
            System.out.println("My " + myAventador.getModel() + " is out for a drive!");
        }
        myAventador.setRunning(false);
        if(!myAventador.isRunning()){
            System.out.println("My " + myAventador.getModel() + " is just waiting to be driven.");
        }
    }
}