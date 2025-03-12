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

import com.entity.JianshenshangpinEntity;
import com.entity.view.JianshenshangpinView;

import com.service.JianshenshangpinService;
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
 * 健身商品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@RestController
@RequestMapping("/jianshenshangpin")
public class JianshenshangpinController {
    @Autowired
    private JianshenshangpinService jianshenshangpinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshenshangpinEntity jianshenshangpin,
		HttpServletRequest request){
        EntityWrapper<JianshenshangpinEntity> ew = new EntityWrapper<JianshenshangpinEntity>();

		PageUtils page = jianshenshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenshangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshenshangpinEntity jianshenshangpin, 
		HttpServletRequest request){
        EntityWrapper<JianshenshangpinEntity> ew = new EntityWrapper<JianshenshangpinEntity>();

		PageUtils page = jianshenshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenshangpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshenshangpinEntity jianshenshangpin){
       	EntityWrapper<JianshenshangpinEntity> ew = new EntityWrapper<JianshenshangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshenshangpin, "jianshenshangpin")); 
        return R.ok().put("data", jianshenshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshenshangpinEntity jianshenshangpin){
        EntityWrapper< JianshenshangpinEntity> ew = new EntityWrapper< JianshenshangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshenshangpin, "jianshenshangpin")); 
		JianshenshangpinView jianshenshangpinView =  jianshenshangpinService.selectView(ew);
		return R.ok("查询健身商品成功").put("data", jianshenshangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshenshangpinEntity jianshenshangpin = jianshenshangpinService.selectById(id);
		jianshenshangpin.setClicknum(jianshenshangpin.getClicknum()+1);
		jianshenshangpin.setClicktime(new Date());
		jianshenshangpinService.updateById(jianshenshangpin);
        jianshenshangpin = jianshenshangpinService.selectView(new EntityWrapper<JianshenshangpinEntity>().eq("id", id));
        return R.ok().put("data", jianshenshangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshenshangpinEntity jianshenshangpin = jianshenshangpinService.selectById(id);
		jianshenshangpin.setClicknum(jianshenshangpin.getClicknum()+1);
		jianshenshangpin.setClicktime(new Date());
		jianshenshangpinService.updateById(jianshenshangpin);
        jianshenshangpin = jianshenshangpinService.selectView(new EntityWrapper<JianshenshangpinEntity>().eq("id", id));
        return R.ok().put("data", jianshenshangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenshangpinEntity jianshenshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianshenshangpin);
        jianshenshangpinService.insert(jianshenshangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenshangpinEntity jianshenshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianshenshangpin);
        jianshenshangpinService.insert(jianshenshangpin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianshenshangpinEntity jianshenshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshenshangpin);
        jianshenshangpinService.updateById(jianshenshangpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshenshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JianshenshangpinEntity jianshenshangpin, HttpServletRequest request,String pre){
        EntityWrapper<JianshenshangpinEntity> ew = new EntityWrapper<JianshenshangpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jianshenshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenshangpin), params), params));
        return R.ok().put("data", page);
    }










}
