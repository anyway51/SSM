package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Emp;
import com.atguigu.ssm.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: EmpController
 * Package: com.atguigu.ssm.controller
 * Description:
 *
 * @Auther: kk
 * @Creat: 2023/8/8 - 9:22
 * @Version: v1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmpPage(@PathVariable("pageNum") Integer pageNum,Model model){
        PageInfo<Emp> page = empService.getEmpPage(pageNum);
        model.addAttribute("page",page);
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmp(Model model) {
        List<Emp> list = empService.getAllEmp();
        model.addAttribute("list", list);
        return "employee_list";
    }

}
