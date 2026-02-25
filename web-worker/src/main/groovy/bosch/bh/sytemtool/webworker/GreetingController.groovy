package bosch.bh.sytemtool.webworker

import bosch.bh.sytemtool.common.ExecuteRequest
import bosch.bh.sytemtool.common.GreetingService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import groovy.transform.CompileStatic
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn

@CompileStatic
@Controller("/greeting")
class GreetingController {

    private final GreetingService greetingService
    private final RootClient rootClient

    GreetingController(GreetingService greetingService, RootClient rootClient) {
        this.greetingService = greetingService
        this.rootClient = rootClient
    }

    @Get("/{name}")
    String greet(String name) {
        return greetingService.hello(name)
    }

    @Get("/test")
    @ExecuteOn(TaskExecutors.BLOCKING)
    String test() {
        def req = new ExecuteRequest(command: "RESTART", payload: "service-01")
        return rootClient.callRoot(req)
    }
}

