package project.one.global.config;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private Info apiInfo() {
        return new Info()
                .title("인테리어 Swagger")
                .description("인테리어 api 테스트")
                .version("0.0.1");
    }
}
