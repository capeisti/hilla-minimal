package org.samuliwritescode;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Endpoint
@AnonymousAllowed
@NpmPackage(value = "@types/react-dom", version = "^18.2.0")
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @Nonnull
    public String getHello() {
        return "Hello world";
    }
}
