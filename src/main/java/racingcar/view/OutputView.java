package racingcar.view;

public class OutputView {
    public void display(String str) {
        System.out.println(str);
    }

    public void displayWinners(String winners) {
        display(String.format("최종 우승자는 %s 입니다.", winners));
    }

    public void displayInputCount() {
        display("시도할회수는몇회인가요?");
    }

    public void displayInputCarNames() {
        display("경주할 자동차 이름을 입력하세요.( 이름은쉼표(,)기준으로구분)");
    }
}
