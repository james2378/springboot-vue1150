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


import com.dao.JianshenbaikeDao;
import com.entity.JianshenbaikeEntity;
import com.service.JianshenbaikeService;
import com.entity.vo.JianshenbaikeVO;
import com.entity.view.JianshenbaikeView;

@Service("jianshenbaikeService")
public class JianshenbaikeServiceImpl extends ServiceImpl<JianshenbaikeDao, JianshenbaikeEntity> implements JianshenbaikeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenbaikeEntity> page = this.selectPage(
                new Query<JianshenbaikeEntity>(params).getPage(),
                new EntityWrapper<JianshenbaikeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenbaikeEntity> wrapper) {
		  Page<JianshenbaikeView> page =new Query<JianshenbaikeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JianshenbaikeVO> selectListVO(Wrapper<JianshenbaikeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenbaikeVO selectVO(Wrapper<JianshenbaikeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenbaikeView> selectListView(Wrapper<JianshenbaikeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenbaikeView selectView(Wrapper<JianshenbaikeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
