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


import com.dao.KechengbaomingDao;
import com.entity.KechengbaomingEntity;
import com.service.KechengbaomingService;
import com.entity.vo.KechengbaomingVO;
import com.entity.view.KechengbaomingView;

@Service("kechengbaomingService")
public class KechengbaomingServiceImpl extends ServiceImpl<KechengbaomingDao, KechengbaomingEntity> implements KechengbaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengbaomingEntity> page = this.selectPage(
                new Query<KechengbaomingEntity>(params).getPage(),
                new EntityWrapper<KechengbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengbaomingEntity> wrapper) {
		  Page<KechengbaomingView> page =new Query<KechengbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KechengbaomingVO> selectListVO(Wrapper<KechengbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengbaomingVO selectVO(Wrapper<KechengbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengbaomingView> selectListView(Wrapper<KechengbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengbaomingView selectView(Wrapper<KechengbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
