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


import com.dao.DiscussjianshenshangpinDao;
import com.entity.DiscussjianshenshangpinEntity;
import com.service.DiscussjianshenshangpinService;
import com.entity.vo.DiscussjianshenshangpinVO;
import com.entity.view.DiscussjianshenshangpinView;

@Service("discussjianshenshangpinService")
public class DiscussjianshenshangpinServiceImpl extends ServiceImpl<DiscussjianshenshangpinDao, DiscussjianshenshangpinEntity> implements DiscussjianshenshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenshangpinEntity> page = this.selectPage(
                new Query<DiscussjianshenshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenshangpinEntity> wrapper) {
		  Page<DiscussjianshenshangpinView> page =new Query<DiscussjianshenshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussjianshenshangpinVO> selectListVO(Wrapper<DiscussjianshenshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenshangpinVO selectVO(Wrapper<DiscussjianshenshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenshangpinView> selectListView(Wrapper<DiscussjianshenshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenshangpinView selectView(Wrapper<DiscussjianshenshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
