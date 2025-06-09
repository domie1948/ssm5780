package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhouView;


/**
 * 售后
 *
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface ShouhouService extends IService<ShouhouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhouVO> selectListVO(Wrapper<ShouhouEntity> wrapper);
   	
   	ShouhouVO selectVO(@Param("ew") Wrapper<ShouhouEntity> wrapper);
   	
   	List<ShouhouView> selectListView(Wrapper<ShouhouEntity> wrapper);
   	
   	ShouhouView selectView(@Param("ew") Wrapper<ShouhouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhouEntity> wrapper);
   	
}

