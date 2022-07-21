package fun.oldlens.greenbow.common.entity;

import lombok.Data;

/**
 * Restful接口返回结果封装
 *
 * @author Ephraim
 * @date 2022-07-21
 */
@Data
public class Result {
    private int code;

    private String msg;

    private Object data;

    public Result() {
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(String msg, Object data) {
        return new Result(1, msg, data);
    }

    public static Result success(String msg) {
        return new Result(1, msg, null);
    }

    public static Result success(Object data) {
        return new Result(1, "", data);
    }

    public static Result success() {
        return new Result(1, "", null);
    }

    public static Result fail(String msg, Object data) {
        return new Result(0, msg, data);
    }

    public static Result fail(String msg) {
        return new Result(0, msg, null);
    }

    public static Result fail(Object data) {
        return new Result(0, "", data);
    }

    public static Result fail() {
        return new Result(0, "", null);
    }
}
