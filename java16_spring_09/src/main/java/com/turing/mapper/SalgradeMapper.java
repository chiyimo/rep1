package com.turing.mapper;

import com.turing.entity.Salgrade;
import com.turing.entity.SalgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalgradeMapper {
    long countByExample(SalgradeExample example);

    int deleteByExample(SalgradeExample example);

    int deleteByPrimaryKey(Long grade);

    int insert(Salgrade record);

    int insertSelective(Salgrade record);

    List<Salgrade> selectByExample(SalgradeExample example);

    Salgrade selectByPrimaryKey(Long grade);

    int updateByExampleSelective(@Param("record") Salgrade record, @Param("example") SalgradeExample example);

    int updateByExample(@Param("record") Salgrade record, @Param("example") SalgradeExample example);

    int updateByPrimaryKeySelective(Salgrade record);

    int updateByPrimaryKey(Salgrade record);
}