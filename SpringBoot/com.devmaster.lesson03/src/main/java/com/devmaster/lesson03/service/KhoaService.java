package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KhoaService {
    List<Khoa> khoas = new ArrayList<Khoa>();
    public KhoaService() {
        khoas.addAll(
                Arrays.asList(
                        new Khoa(1L,"Công Nghệ Thông Tin"),
                        new Khoa(2L,"Quản lý Đất Đai")
                )
        );
    }
    public List<Khoa> getKhoas() {
        return khoas;
    }
    public Khoa getKhoa(long makh) {
        return khoas.stream().filter(khoa ->khoa.getMakh() == makh).findFirst().orElse(null);
    }
    public Khoa addKhoa(Khoa khoa) {
        khoas.add(khoa);
        return khoa;
    }
    public Khoa updateKhoa(Long makh,Khoa khoa) {
        Khoa check = getKhoa(makh);
        if (check == null) {
            return null;
        }
        khoas.forEach(item->{
            if (item.getMakh() == makh) {
                item.setTenkh(khoa.getTenkh());
            }
        });
        return khoa;
    }
    public boolean deleteKhoa(Long makh) {
        Khoa khoa = getKhoa(makh);
        return khoas.remove(khoa);
    }

}
