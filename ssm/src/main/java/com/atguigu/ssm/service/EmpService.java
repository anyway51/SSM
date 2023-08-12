package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * ClassName: EmpService
 * Package: com.atguigu.ssm.service
 * Description:
 *
 * @Auther: kk
 * @Creat: 2023/8/8 - 9:30
 * @Version: v1.0
 */
public interface EmpService {
    List<Emp> getAllEmp();

    PageInfo<Emp> getEmpPage(Integer pageNum);
}
