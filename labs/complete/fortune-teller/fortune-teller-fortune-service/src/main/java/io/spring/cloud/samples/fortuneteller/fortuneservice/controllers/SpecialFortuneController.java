package io.spring.cloud.samples.fortuneteller.fortuneservice.controllers;

import io.spring.cloud.samples.fortuneteller.fortuneservice.domain.Fortune;
import io.spring.cloud.samples.fortuneteller.fortuneservice.repositories.FortuneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jaguilar on 7/1/16.
 */
@RestController
public class SpecialFortuneController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FortuneController.class);

    @Autowired
    FortuneRepository repository;

    @RequestMapping("/special")
    public Fortune specialFortune() {
        Fortune fortune = new Fortune();
        fortune.setId(1L);
        fortune.setText("Special Fortune: Using PCF brings good karma!");
        return fortune;
    }
}
