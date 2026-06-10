package RunApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    Keyboard keyboard;

    public void start() {
        System.out.println("Starting the computer..");
        keyboard.plugIn();
    }

    @Autowired  // Setter injection
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
