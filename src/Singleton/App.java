package Singleton;

public class App {
    private static App app;
    boolean isRunning = false;
    private App(){}

    public static App getInstance(){
        if (app == null){
            app = new App();
        }

        return app;
    }
    public void Run(){
        if (!isRunning){
            isRunning = true;
        }
    }
}
