@Configuration
@Requires(env = "APP_ENABLE", value = StringUtils.TRUE)
package com.example.test;

import io.micronaut.context.annotation.Configuration;
import io.micronaut.context.annotation.Requires;
import io.micronaut.core.util.StringUtils;