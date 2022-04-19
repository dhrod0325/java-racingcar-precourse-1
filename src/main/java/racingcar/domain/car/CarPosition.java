package racingcar.domain.car;

import racingcar.domain.validator.NumberValidator;

class CarPosition {
    public static final String ERROR_POSITION = "정수를 입력하세요";
    
    private int position;

    public CarPosition(int position) {
        this.position = new NumberValidator(ERROR_POSITION).validate(position);
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
