package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/azzurro")
    public Object getAzzurro() throws InterruptedException {
        Thread.sleep(randomGen(1,3) * 1000L);
        return Map.of("nome", "Azzurro");
    }

    @GetMapping("/verde")
    public Object getVerde() throws InterruptedException {
        Thread.sleep(randomGen(4,6) * 1000L);

        return Map.of("nome", "Verde");
    }

    @GetMapping("/giallo")
    public Object getGiallo() throws InterruptedException {
        Thread.sleep(randomGen(7,9) * 1000L);
        return Map.of("nome", "Giallo");
    }

    @GetMapping("/rosso")
    public Object getRosso() throws InterruptedException {
        Thread.sleep(randomGen(10,13) * 1000L);
        return Map.of("nome", "Rosso");
    }

    private int randomGen(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
