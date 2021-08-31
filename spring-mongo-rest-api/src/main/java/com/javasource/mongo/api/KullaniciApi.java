package com.javasource.mongo.api;

import com.javasource.mongo.entity.Kullanici;
import com.javasource.mongo.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init(){
        Kullanici kullanici=new Kullanici();
        kullanici.setAdi("İbrahim Hakkı");
        kullanici.setSoyadi("Kılıç");
        kullanici.setGorunum("1.80m 19 Yaş");
        kullaniciRepository.save(kullanici);

    }
    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici){
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele(Kullanici kullanici){
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }

}
