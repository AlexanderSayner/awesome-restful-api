package org.sayner.sandbox.heroku.awesome.controller

import org.sayner.sandbox.heroku.awesome.repository.CarRepository
import org.sayner.sandbox.heroku.awesome.model.Car
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus.OK
import io.swagger.v3.oas.annotations.Operation
//import io.swagger.v3.oas.annotations.parameters.RequestBody
import org.sayner.sandbox.heroku.awesome.dto.model.CarDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class CarController(private val carRepository: CarRepository) {
    @Operation(summary = "get all cars")
    @GetMapping
    fun get(): ResponseEntity<MutableList<Car>> =
            ResponseEntity(
                    carRepository.findAll(),
                    OK
            )

    @Operation(summary = "add one")
    @PostMapping("/create")
    fun create(@RequestBody car: CarDto): ResponseEntity<Map<String, Car>> =
            ResponseEntity(
                    mutableMapOf(Pair("Сохранено", carRepository.save(Car(id = null, model = car.model)))),
                    OK
            )
}
