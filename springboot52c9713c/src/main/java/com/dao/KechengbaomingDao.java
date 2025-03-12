package com.dao;

import com.entity.KechengbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengbaomingVO;
import com.entity.view.KechengbaomingView;


/**
 * 课程报名
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public interface KechengbaomingDao extends BaseMapper<KechengbaomingEntity> {
	
	List<KechengbaomingVO> selectListVO(@Param("ew") Wrapper<KechengbaomingEntity> wrapper);
	
	KechengbaomingVO selectVO(@Param("ew") Wrapper<KechengbaomingEntity> wrapper);
	
	List<KechengbaomingView> selectListView(@Param("ew") Wrapper<KechengbaomingEntity> wrapper);

	List<KechengbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<KechengbaomingEntity> wrapper);

	
	KechengbaomingView selectView(@Param("ew") Wrapper<KechengbaomingEntity> wrapper);
	

}
