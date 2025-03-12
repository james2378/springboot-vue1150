package com.dao;

import com.entity.JianshenbaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenbaikeVO;
import com.entity.view.JianshenbaikeView;


/**
 * 健身百科
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public interface JianshenbaikeDao extends BaseMapper<JianshenbaikeEntity> {
	
	List<JianshenbaikeVO> selectListVO(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);
	
	JianshenbaikeVO selectVO(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);
	
	List<JianshenbaikeView> selectListView(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);

	List<JianshenbaikeView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);

	
	JianshenbaikeView selectView(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);
	

}
