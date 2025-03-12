package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhijiaojiaolianDao;
import com.entity.ZhijiaojiaolianEntity;
import com.service.ZhijiaojiaolianService;
import com.entity.vo.ZhijiaojiaolianVO;
import com.entity.view.ZhijiaojiaolianView;

@Service("zhijiaojiaolianService")
public class ZhijiaojiaolianServiceImpl extends ServiceImpl<ZhijiaojiaolianDao, ZhijiaojiaolianEntity> implements ZhijiaojiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhijiaojiaolianEntity> page = this.selectPage(
                new Query<ZhijiaojiaolianEntity>(params).getPage(),
                new EntityWrapper<ZhijiaojiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhijiaojiaolianEntity> wrapper) {
		  Page<ZhijiaojiaolianView> page =new Query<ZhijiaojiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhijiaojiaolianVO> selectListVO(Wrapper<ZhijiaojiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhijiaojiaolianVO selectVO(Wrapper<ZhijiaojiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhijiaojiaolianView> selectListView(Wrapper<ZhijiaojiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhijiaojiaolianView selectView(Wrapper<ZhijiaojiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
