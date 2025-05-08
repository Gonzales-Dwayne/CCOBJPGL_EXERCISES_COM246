public class App {
    public static void main(String[] args) throws Exception {
        HDMI hdmi = new HDMI();
        VGA connector = new VGAtoHDMI(hdmi);
        MONITOR monitor = new MONITOR();
        monitor.connects(connector);
    }
}