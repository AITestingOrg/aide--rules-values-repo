package rulesvalues.models;

public class ResponseMessage {
    private Object contents;
    private boolean success;

    public ResponseMessage(Object contents, boolean success) {
        this.contents = contents;
        this.success = success;
    }

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
