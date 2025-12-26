package keniu.handlers;

import keniu.Request;

public class LevelTwoSupport extends Handler {
    @Override
    public void handle(Request request) {
        if (canHandle(request)) {
            System.out.println("LevelTwoSupport is handling request: " + request);
        } else {
            handleNext(request);
        }
    }

    @Override
    protected boolean canHandle(Request request) {
        return request.getLevel() == Request.Level.MEDIUM;
    }
}
