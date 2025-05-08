public class MONITOR {
   
    public void connects (VGA connector) {
        System.out.println("Monitor expecting to connect to VGA cable");
 
        connector.connectWithVGA();
        System.out.println("Connecting...");
        System.out.println("Connected.");

    }
}




