package com.example.service.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.mapper.WashingMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WashingSalesMybatisServiceImpl implements WashingSalesMybatisService {


    final WashingMapper wMapper;


    //일매출
    @Override
    public List<Map<String, Object>> selectDaySales(String wid) {
        try {

            return wMapper.selectDaySales(wid);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //해당업체의 월매출
    @Override
    public List<Map<String, Object>> selectMonthSales(String wid) {
        try {

            return wMapper.selectMonthSales(wid);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //해당업체의 연매출
    @Override
    public List<Map<String, Object>> selectYearSales(String wid) {
        try {
            return wMapper.selectYearSales(wid);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




    

    
    
}
