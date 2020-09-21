package org.sayner.sandbox.heroku.awesome

import io.sentry.Sentry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestDemoApplication

fun main(args: Array<String>) {
	Sentry.capture("awesome-restful-api has started")
	runApplication<RestDemoApplication>(*args)
}
