package RunApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Keyboard {

    public void plugIn() {
        System.out.println("Plugging in keyboard..");
    }
}
