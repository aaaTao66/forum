package life.aaatao.forum.exception;

public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"问题不存在,或已删除;"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"请先登录后再试!"),
    SYS_ERROR(2004,"服务器崩溃啦!请稍后再试!"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在!"),
    COMMENT_NOT_FOUND(2005,"回复的评论不存在或已删除!"),
    CONTENT_IS_EMPTY(2007,"输入内容不为空");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private String message;
    private Integer code;

    CustomizeErrorCode( Integer code,String message) {
        this.message = message;
        this.code = code;
    }

}
