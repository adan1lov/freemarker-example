package ru.hse.freemarker.example.service

import org.springframework.stereotype.Service
import ru.hse.freemarker.example.dto.Car

@Service
class CarService {
    fun getCars(): List<Car> {
        return carList
    }

    fun addCar(car: Car): Car {
        carList.add(car)
        return car
    }

    companion object {
        private val carList: MutableList<Car> = ArrayList<Car>()

        init {
            carList.add(Car("Honda", "Civic"))
            carList.add(Car("Toyota", "Camry"))
            carList.add(Car("Nissan", "Altima"))
        }
    }


}