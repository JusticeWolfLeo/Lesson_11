public class main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.lightСontroll(); // свет в комнате можно включить как с пульта
        lamp.lightSwitch(); //так и переключателем
        lamp.lightOff();
        TV tv = new TV();
        tv.picture(); // включили телевизор
        tv.pictureOff();
    }
}
