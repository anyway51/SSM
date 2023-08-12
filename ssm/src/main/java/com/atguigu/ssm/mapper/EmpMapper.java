package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Emp;

import java.util.List;

/**
 * ClassName: EmpMapper
 * Package: com.atguigu.ssm.mapper
 * Description:
 *
 * @Auther: kk
 * @Creat: 2023/8/8 - 9:44
 * @Version: v1.0
 */
public interface EmpMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();
}
