package life.aaatao.forum.enums;

public enum NotificationStstusEnum {
    UNREAD(0),READ(1);

    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStstusEnum(int status) {
        this.status = status;
    }
}
