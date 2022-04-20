package racingcar.game.view;

public class OutputView {
    public static final String MSG_INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.( 이름은쉼표(,)기준으로구분)";
    public static final String MSG_INPUT_COUNT = "시도할회수는몇회인가요?";

    public void display(String str) {
        System.out.println(str);
    }

    public void displayError(Exception e) {
        display(e.getMessage());
    }

    public void displayInputCount() {
        display(MSG_INPUT_COUNT);
    }

    public void displayInputCarNames() {
        display(MSG_INPUT_CAR_NAMES);
    }
}
