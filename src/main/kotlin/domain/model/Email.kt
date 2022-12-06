package domain.model

data class Email(val subject: String, val sender: EmailAddress, val body: String)
