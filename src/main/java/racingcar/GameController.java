package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.RandomCarStatus;
import racingcar.domain.Validator;

public class GameController {
    public void run() {
        List<Car> carList = getCars();

        int gameCount = getGameCount();

        Cars cars = new Cars(carList);
        cars.setCarStatus(new RandomCarStatus(0, 9));

        for (int i = 0; i < gameCount; i++) {
            cars.move();
            cars.display();

            System.out.println();
        }

        System.out.println(String.format("최종 우승자는 %s 입니다.", cars.displayWinners()));
    }

    private int getGameCount() {
        try {
            System.out.println("시도할회수는몇회인가요?");
            return Validator.validateGameCount(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameCount();
        }
    }

    private List<Car> getCars() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.( 이름은쉼표(,)기준으로구분)");
            String inputNames = Console.readLine();
            String[] carNames = inputNames.split(",");

            List<Car> carList = new ArrayList<>();

            for (String carName : carNames) {
                carList.add(new Car(Validator.validateCarName(carName)));
            }
            return carList;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            return getCars();
        }
    }
}
