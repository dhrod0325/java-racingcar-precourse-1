package racingcar.domain.error;

public class Error {
    public static final String ERROR_PREFIX = "[ERROR] ";

    public static String msg(String msg) {
        return ERROR_PREFIX + msg;
    }
}
