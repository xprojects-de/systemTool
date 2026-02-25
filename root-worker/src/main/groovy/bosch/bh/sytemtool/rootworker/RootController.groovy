package bosch.bh.sytemtool.rootworker

import bosch.bh.sytemtool.common.ExecuteRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/root")
class RootController {

    @Post("/execute")
    String handleExecution(@Body ExecuteRequest request) {
        println "Root-Worker führt aus: ${request.command}"
        return "Erfolg: ${request.command} wurde verarbeitet."
    }
}
