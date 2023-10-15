package com.zouzy.sdk;

import com.zouzy.sdk.client.TtingApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class SdkClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public TtingApiClient yuApiClient() {
        return new TtingApiClient(accessKey, secretKey);
    }
}
