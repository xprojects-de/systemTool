package bosch.bh.sytemtool.webworker

import bosch.bh.sytemtool.common.ExecuteRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client

@Client("unix:///tmp/root.sock")
interface RootClient {
    @Post("/root/execute")
    String callRoot(@Body ExecuteRequest request)
}
