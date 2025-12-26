package keniu;

import keniu.handlers.Handler;
import keniu.handlers.LevelOneSupport;
import keniu.handlers.LevelThreeSupport;
import keniu.handlers.LevelTwoSupport;

public class Main {
    public static void main(String[] args) {
        Request low = new Request(Request.Type.SOFTWARE, Request.Level.LOW, "Easy task");
        Request medium = new Request(Request.Type.HARDWARE, Request.Level.MEDIUM, "Medium task");
        Request high = new Request(Request.Type.NETWORK, Request.Level.HIGH, "Difficult task");

        Handler levelOneSupport = new LevelOneSupport();

        levelOneSupport
                .setNext(new LevelTwoSupport())
                .setNext(new LevelThreeSupport());

        levelOneSupport.handle(low);
        levelOneSupport.handle(medium);
        levelOneSupport.handle(high);
    }
}
