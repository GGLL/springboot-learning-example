package org.spring.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
@RequestMapping(value = "/api/city")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @ApiOperation(value="获取城市列表", notes="")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    @ApiOperation(value="创建城市", notes="根据city对象创建城市")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
