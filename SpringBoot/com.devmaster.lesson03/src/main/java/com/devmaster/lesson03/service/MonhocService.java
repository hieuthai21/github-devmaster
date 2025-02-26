package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Monhoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonhocService {
    List<Monhoc>  monhocs = new ArrayList<Monhoc>();
    public MonhocService() {
        monhocs.addAll(
                Arrays.asList(
                        new Monhoc(1L,"Java",25L),
                        new Monhoc(2L,"PHP",20L)
                )
        );
    }
    public List<Monhoc> getMonhocs() {
        return monhocs;
    }
    public Monhoc getMonhoc(long mamh) {
        return monhocs.stream().filter(monhoc->monhoc.getMamh()==mamh).findFirst().orElse(null);
    }
    public Monhoc addMonhoc(Monhoc monhoc) {
        monhocs.add(monhoc);
        return monhoc;
    }
    public Monhoc updateMonhoc(long mamh,Monhoc monhoc) {
        Monhoc check = getMonhoc(mamh);
        if(check==null){
            return null;
        }
        monhocs.forEach(item->{
            if(item.getMamh()== mamh){
                item.setTenmh(monhoc.getTenmh());
                item.setSotiet(monhoc.getSotiet());
            }
        });
        return monhoc;
    }
    public boolean deleteMonhoc(long mamh) {
        Monhoc monhoc = getMonhoc(mamh);
        return monhocs.remove(monhoc);
    }
}
