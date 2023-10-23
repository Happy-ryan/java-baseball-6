package baseball;

import static baseball.Constants.*;

public class Game {
    User user;
    Computer computer;

    public Game() {
        user = new User();
        computer = new Computer();
    }

    public void play() {
        while (true) {
            System.out.print(inputRequestMessage);

            String userNumber = this.user.play();
            ExceptionHandler.raiseException(userNumber);

            String computerResponse = this.computer.play(userNumber);
            System.out.println(computerResponse);
            if (computerResponse.equals(hintAllStrikeMessage)) {
                return;
            }
        }
    }
}
