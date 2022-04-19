package racingcar.domain.car;

import racingcar.domain.validator.NumberValidator;

class CarPosition {
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
}
