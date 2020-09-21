package org.sayner.sandbox.heroku.awesome.model

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "car", schema = "awesome")
data class Car(
        @Id
        @GeneratedValue(strategy = IDENTITY)
        var id: Int? = null,
        var model: String? = null
)
