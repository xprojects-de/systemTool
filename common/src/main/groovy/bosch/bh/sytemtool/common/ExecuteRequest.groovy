package bosch.bh.sytemtool.common

import groovy.transform.CompileStatic
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@CompileStatic
class ExecuteRequest {
    String command
    String payload
}
