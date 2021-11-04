package app;

import com.google.inject.Guice;
import com.google.inject.Inject;

public class Main {
    @Inject
    private DemoService demoService;

    public static void main(String[] args) {
        var main = new Main();
        var module = new DemoModule();
        var injector = Guice.createInjector(module);
        injector.injectMembers(main);
        main.testGuice();
    }

    public void testGuice() {
        demoService.demo();
    }
}
