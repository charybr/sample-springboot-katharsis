package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.katharsis.resource.registry.ResourceRegistry;
import io.katharsis.spring.boot.KatharsisConfigV2;

@Configuration
@RestController
@SpringBootApplication
@Import(KatharsisConfigV2.class)
public class AppAPILayer extends SpringBootServletInitializer {
	protected static Logger logger = LoggerFactory.getLogger(AppAPILayer.class);
	public static final String SPRING_CONFIG_LOC_PROP = "spring.config.location";
	public static final String SPRING_CONFIG_LOC_VALUE = "/etc/app/api/";

	@Autowired
	private ResourceRegistry resourceRegistry;

	@Value("${katharsis.customPath}")
	private String customPath;

	@RequestMapping("/resourcesInfo")
	public Map<?, ?> getResources() {
		Map<String, String> result = new HashMap<>();
		for (Class<?> clazz : resourceRegistry.getResources().keySet()) {
			result.put(resourceRegistry.getResourceType(clazz), getResourceUrl(clazz));
		}
		return result;
	}

	private String getResourceUrl(Class<?> clazz) {
		return customPath + resourceRegistry.getResourceType(clazz);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(AppAPILayer.class).sources(AppAPILayer.class).properties(getProperties())
				.run(args);
		logger.warn("Loaded config from: {}", SPRING_CONFIG_LOC_VALUE);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AppAPILayer.class).properties(getProperties());
	}

	static Properties getProperties() {
		Properties props = new Properties();
		props.put(SPRING_CONFIG_LOC_PROP, SPRING_CONFIG_LOC_VALUE);
		return props;
	}
}
