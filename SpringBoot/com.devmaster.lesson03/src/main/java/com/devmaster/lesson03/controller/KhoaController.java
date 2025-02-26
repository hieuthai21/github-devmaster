package com.devmaster.lesson03.controller;

import com.devmaster.lesson03.entity.Khoa;
import com.devmaster.lesson03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @GetMapping("/khoa-list")
    public List<Khoa> getAllKhoa() {
        return khoaService.getKhoas();
    }

    @GetMapping("/khoa/{makh}")
    public Khoa getKhoaByMakh(@PathVariable String makh) {
        Long makhKhoa = Long.parseLong(makh);
        return khoaService.getKhoa(makhKhoa);
    }
    @PostMapping("/khoa-add")
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return khoaService.addKhoa(khoa);
    }
    @PutMapping
    public Khoa updateKhoa(@PathVariable String makh,@RequestBody Khoa khoa) {
        Long makhKhoa = Long.parseLong(makh);
        return khoaService.updateKhoa(makhKhoa, khoa);
    }
    @DeleteMapping("/khoa/{id}")
    public boolean deleteKhoa(@PathVariable String id) {
        Long makhKhoa = Long.parseLong(id);
        return khoaService.deleteKhoa(makhKhoa);
    }
}
