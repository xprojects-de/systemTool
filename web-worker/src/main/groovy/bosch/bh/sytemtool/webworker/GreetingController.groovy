package bosch.bh.sytemtool.webworker

import bosch.bh.sytemtool.common.GreetingService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import groovy.transform.CompileStatic

@CompileStatic
@Controller("/greeting")
class GreetingController {

    private final GreetingService greetingService

    GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService
    }

    @Get("/{name}")
    String greet(String name) {
        return greetingService.hello(name)
    }
}

