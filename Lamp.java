public class Lamp implements RemoteСontroll, Switch {
    public void lightСontroll() {
        System.out.println("Свет загорелся от пульта");
    }
    public void lightSwitch() {
        System.out.println("Свет загорелся от кнопки");
    }
    public void lightOff() {
        System.out.println("Свет потух");
    }
}
