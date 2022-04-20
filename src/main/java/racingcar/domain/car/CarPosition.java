package racingcar.domain.car;

import racingcar.domain.validator.NumberValidator;

public class CarPosition {
    public static final int ZERO = 0;

    private int position;

    public CarPosition(int position) {
        this(position + "");
    }

    public CarPosition(String position) {
        this.position = NumberValidator.validate(position);
    }

    public int get() {
        return position;
    }

    public boolean isOver(int position) {
        return this.position >= position;
    }

    public void plus() {
        this.position++;
    }

    public static CarPosition zero() {
        return new CarPosition(ZERO);
    }
}
