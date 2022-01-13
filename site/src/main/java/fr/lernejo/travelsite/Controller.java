package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    final ArrayList<Enregistrer> enregistrement =  new ArrayList<>();

    @PostMapping(value = "/api/inscription")
    public ArrayList<Enregistrer> register(@RequestBody Enregistrer registry){
        enregistrement.add(registry);
        return enregistrement;
    }

    @GetMapping(value = "/api/travels")
    public ArrayList<Country> getDestinations(@RequestParam String userName){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Caribbean",32.4));
        countries.add(new Country("Australia",35.1));
        for(Enregistrer registry: enregistrement){
            if(registry.userName.equals(userName)){
                return countries;
            }
        }
        return new ArrayList<Country>();
    }
}
