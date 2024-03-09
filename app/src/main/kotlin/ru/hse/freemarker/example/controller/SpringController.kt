package ru.hse.freemarker.example.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import ru.hse.freemarker.example.dto.Car
import ru.hse.freemarker.example.service.CarService


@Controller
class SpringController(
    val carService: CarService
) {

    @GetMapping
    fun home(model: Model?): String {
        return "redirect:/cars"
    }

    @GetMapping(path = ["/cars"])
    fun init(@ModelAttribute("model") model: ModelMap): String {
        model.addAttribute("carList", carService.getCars())
        return "index"
    }

    @PostMapping(path = ["/add"])
    fun addCar(@ModelAttribute("car") car: Car): String {
        carService.addCar(car)

        return "redirect:/cars"
    }


}