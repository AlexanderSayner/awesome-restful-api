package org.sayner.sandbox.heroku.awesome.repository

import org.sayner.sandbox.heroku.awesome.model.Car
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface  CarRepository:JpaRepository<Car, Int>
