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

import com.entity.KechengbaomingEntity;
import com.entity.view.KechengbaomingView;

import com.service.KechengbaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课程报名
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@RestController
@RequestMapping("/kechengbaoming")
public class KechengbaomingController {
    @Autowired
    private KechengbaomingService kechengbaomingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengbaomingEntity kechengbaoming,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kechengbaoming.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KechengbaomingEntity> ew = new EntityWrapper<KechengbaomingEntity>();

		PageUtils page = kechengbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengbaoming), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengbaomingEntity kechengbaoming, 
		HttpServletRequest request){
        EntityWrapper<KechengbaomingEntity> ew = new EntityWrapper<KechengbaomingEntity>();

		PageUtils page = kechengbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengbaoming), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengbaomingEntity kechengbaoming){
       	EntityWrapper<KechengbaomingEntity> ew = new EntityWrapper<KechengbaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengbaoming, "kechengbaoming")); 
        return R.ok().put("data", kechengbaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengbaomingEntity kechengbaoming){
        EntityWrapper< KechengbaomingEntity> ew = new EntityWrapper< KechengbaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengbaoming, "kechengbaoming")); 
		KechengbaomingView kechengbaomingView =  kechengbaomingService.selectView(ew);
		return R.ok("查询课程报名成功").put("data", kechengbaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KechengbaomingEntity kechengbaoming = kechengbaomingService.selectById(id);
        return R.ok().put("data", kechengbaoming);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KechengbaomingEntity kechengbaoming = kechengbaomingService.selectById(id);
        return R.ok().put("data", kechengbaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengbaomingEntity kechengbaoming, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kechengbaoming);
        kechengbaomingService.insert(kechengbaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengbaomingEntity kechengbaoming, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kechengbaoming);
        kechengbaomingService.insert(kechengbaoming);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengbaomingEntity kechengbaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengbaoming);
        kechengbaomingService.updateById(kechengbaoming);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengbaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
