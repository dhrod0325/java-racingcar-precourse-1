package racingcar.domain.car;

class CarPosition {
    private int position = 0;

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
