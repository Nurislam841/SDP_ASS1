package Fifth_Task;

import Firs_Task.User;

public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Button button = new Button(light);
        button.press();
    }
}
