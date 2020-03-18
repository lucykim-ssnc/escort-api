package io.ssnc.ac.escort.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.UNAUTHORIZED)
class LoginException(message: String?) : RuntimeException(message)

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
class PasswordException(message: String?) : RuntimeException(message)