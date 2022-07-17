package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface ServerConfig extends Config {
    @Key("password")
    String password();
    @Key("login")
    String login();
}
