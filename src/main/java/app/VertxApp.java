package app;

import app.verticles.EchoServiceVerticle;
import app.verticles.WebVerticle;
import io.vertx.core.Vertx;

public class VertxApp {

    public static void main(String... args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(new WebVerticle(),
            stringAsyncResult -> System.out.println("Successfully deployed WebVerticle."));
        vertx.deployVerticle(new EchoServiceVerticle(),
            stringAsyncResult -> System.out.println("Successfully deployed EchoServiceVerticle."));
    }
}