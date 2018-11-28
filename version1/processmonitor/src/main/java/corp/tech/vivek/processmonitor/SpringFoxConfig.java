package corp.tech.vivek.processmonitor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    // .apis(RequestHandlerSelectors.any()) when considering any possible end points in the project
    // .apis(RequestHandlerSelectors.basePackage("corp.tech")) when considering corp.tech related end points alone in the project
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("corp.tech"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * ApiInfo object, which provides general information about the API
     *  such as title, version, contact or licensing information.
     *
     * @return
     */
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "TITLE",
                "DESCIPRION",
                "VERSION",
                "TERMS OF SERVICE URL",
                new Contact("NAME","URL","EMAIL"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
