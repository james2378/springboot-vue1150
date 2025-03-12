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

import com.entity.JianshenbaikeEntity;
import com.entity.view.JianshenbaikeView;

import com.service.JianshenbaikeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 健身百科
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@RestController
@RequestMapping("/jianshenbaike")
public class JianshenbaikeController {
    @Autowired
    private JianshenbaikeService jianshenbaikeService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshenbaikeEntity jianshenbaike,
		HttpServletRequest request){
        EntityWrapper<JianshenbaikeEntity> ew = new EntityWrapper<JianshenbaikeEntity>();

		PageUtils page = jianshenbaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenbaike), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshenbaikeEntity jianshenbaike, 
		HttpServletRequest request){
        EntityWrapper<JianshenbaikeEntity> ew = new EntityWrapper<JianshenbaikeEntity>();

		PageUtils page = jianshenbaikeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenbaike), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshenbaikeEntity jianshenbaike){
       	EntityWrapper<JianshenbaikeEntity> ew = new EntityWrapper<JianshenbaikeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshenbaike, "jianshenbaike")); 
        return R.ok().put("data", jianshenbaikeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshenbaikeEntity jianshenbaike){
        EntityWrapper< JianshenbaikeEntity> ew = new EntityWrapper< JianshenbaikeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshenbaike, "jianshenbaike")); 
		JianshenbaikeView jianshenbaikeView =  jianshenbaikeService.selectView(ew);
		return R.ok("查询健身百科成功").put("data", jianshenbaikeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshenbaikeEntity jianshenbaike = jianshenbaikeService.selectById(id);
        return R.ok().put("data", jianshenbaike);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshenbaikeEntity jianshenbaike = jianshenbaikeService.selectById(id);
        return R.ok().put("data", jianshenbaike);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenbaikeEntity jianshenbaike, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianshenbaike);
        jianshenbaikeService.insert(jianshenbaike);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenbaikeEntity jianshenbaike, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianshenbaike);
        jianshenbaikeService.insert(jianshenbaike);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianshenbaikeEntity jianshenbaike, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshenbaike);
        jianshenbaikeService.updateById(jianshenbaike);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshenbaikeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
