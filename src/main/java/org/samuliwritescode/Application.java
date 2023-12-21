package org.samuliwritescode;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Endpoint
@AnonymousAllowed
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Nonnull
    public String getSomething() {
        return "Something";
    }
}
