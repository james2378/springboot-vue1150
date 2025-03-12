package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuiyuankaEntity;
import com.entity.view.HuiyuankaView;

import com.service.HuiyuankaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 会员卡
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@RestController
@RequestMapping("/huiyuanka")
public class HuiyuankaController {
    @Autowired
    private HuiyuankaService huiyuankaService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyuankaEntity huiyuanka,
		HttpServletRequest request){
        EntityWrapper<HuiyuankaEntity> ew = new EntityWrapper<HuiyuankaEntity>();

		PageUtils page = huiyuankaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanka), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyuankaEntity huiyuanka, 
		HttpServletRequest request){
        EntityWrapper<HuiyuankaEntity> ew = new EntityWrapper<HuiyuankaEntity>();

		PageUtils page = huiyuankaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanka), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyuankaEntity huiyuanka){
       	EntityWrapper<HuiyuankaEntity> ew = new EntityWrapper<HuiyuankaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyuanka, "huiyuanka")); 
        return R.ok().put("data", huiyuankaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyuankaEntity huiyuanka){
        EntityWrapper< HuiyuankaEntity> ew = new EntityWrapper< HuiyuankaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyuanka, "huiyuanka")); 
		HuiyuankaView huiyuankaView =  huiyuankaService.selectView(ew);
		return R.ok("查询会员卡成功").put("data", huiyuankaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyuankaEntity huiyuanka = huiyuankaService.selectById(id);
        return R.ok().put("data", huiyuanka);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyuankaEntity huiyuanka = huiyuankaService.selectById(id);
        return R.ok().put("data", huiyuanka);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyuankaEntity huiyuanka, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huiyuanka);
        huiyuankaService.insert(huiyuanka);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyuankaEntity huiyuanka, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huiyuanka);
        huiyuankaService.insert(huiyuanka);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuiyuankaEntity huiyuanka, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyuanka);
        huiyuankaService.updateById(huiyuanka);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyuankaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
