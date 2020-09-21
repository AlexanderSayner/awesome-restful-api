package org.sayner.sandbox.heroku.awesome.config

import org.springframework.boot.web.servlet.ServletContextInitializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WebConfig {
    @Bean
    fun sentryServletContextInitializer(): ServletContextInitializer? {
        return io.sentry.spring.SentryServletContextInitializer()
    }
}