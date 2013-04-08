import core.IocContainer;
import core.IocContainerBuilder;
import domain.AppRunner;

public class Main {
    public static void main(String[] args) throws Exception {
        IocContainer container = new IocContainerBuilder().withPackageName("domain")
                                                          .withConfigFile("ioc-config.xml")
                                                          .build();
        AppRunner runner = container.getBean(AppRunner.class);
        runner.run();
    }
}
