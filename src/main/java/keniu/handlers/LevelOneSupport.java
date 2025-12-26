package keniu.handlers;

import keniu.Request;

public class LevelOneSupport extends Handler {
    @Override
    public void handle(Request request) {
        if (canHandle(request)) {
            System.out.println("LevelOneSupport is handling request: " + request);
        } else {
            handleNext(request);
        }
    }

    @Override
    protected boolean canHandle(Request request) {
        return request.getLevel() == Request.Level.LOW;
    }
}
