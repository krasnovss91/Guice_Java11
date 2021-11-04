package app;

import com.google.inject.AbstractModule;

public class DemoModule extends AbstractModule {
    @Override
    protected void configure() {
      bind(DemoService.class).to(DemoServiceImpl.class);
    }
}
