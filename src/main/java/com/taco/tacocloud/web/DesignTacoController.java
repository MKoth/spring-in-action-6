package com.taco.tacocloud.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.taco.tacocloud.Ingridient;
import com.taco.tacocloud.Order;
import com.taco.tacocloud.Taco;
import com.taco.tacocloud.Ingridient.Type;
import com.taco.tacocloud.data.IngridientRepository;
import com.taco.tacocloud.data.TacoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

    IngridientRepository ingridientRepo;

    private TacoRepository tacoRepo;

    @Autowired
    public DesignTacoController(IngridientRepository ingridientRepo, TacoRepository tacoRepo) {
        this.ingridientRepo = ingridientRepo;
        this.tacoRepo = tacoRepo;
    }

    @ModelAttribute
    public void addIngridientsToModel(Model model) {
        List<Ingridient> ingredients = new ArrayList<>();
        ingridientRepo.findAll().forEach(ingredients::add);

        Type[] types = Ingridient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name = "order")
    public Order order() {
        return new Order();
    }
    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping
    public String showDesignForm(Model model) {
        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco taco, Errors errors, @ModelAttribute Order order) {
        if(errors.hasErrors()) {
            return "design";
        }
        Taco saved = tacoRepo.save(taco);
        order.addTaco(saved);
        return "redirect:/orders/current";
    }

    private List<Ingridient> filterByType(List<Ingridient> ingredients, Type type) {
        return ingredients.stream()
                .filter(x -> x.getType().equals(type))
                .toList();
    }
}
