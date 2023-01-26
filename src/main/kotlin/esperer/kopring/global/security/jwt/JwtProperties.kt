package esperer.kopring.global.security.jwt

import io.jsonwebtoken.security.Keys
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.nio.charset.StandardCharsets
import java.security.Key

@ConstructorBinding
@ConfigurationProperties(prefix = "jwt")
class JwtProperties(
    accessSecret: String,
    refreshSecret: String,
) {
    val accessSecret: Key
    val refreshSecret: Key

    init {
        this.accessSecret = Keys.hmacShaKeyFor(accessSecret.toByteArray(StandardCharsets.UTF_8))
        this.refreshSecret = Keys.hmacShaKeyFor(refreshSecret.toByteArray(StandardCharsets.UTF_8))
    }
}
