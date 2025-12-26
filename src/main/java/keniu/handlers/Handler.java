package keniu.handlers;

import keniu.Request;

public abstract class Handler {
    protected Handler next;

    public abstract void handle(Request request);

    protected abstract boolean canHandle(Request request);

    public Handler setNext(Handler next) {
        this.next = next;
        return this.next;
    }

    protected void handleNext(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
