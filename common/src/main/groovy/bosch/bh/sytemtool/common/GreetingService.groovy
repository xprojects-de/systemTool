package bosch.bh.sytemtool.common

import jakarta.inject.Singleton

@Singleton
class GreetingService {
    String hello(String name) {
        return "Hallo " + name;
    }
}
