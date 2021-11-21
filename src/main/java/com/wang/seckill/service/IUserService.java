package com.wang.seckill.service;

import com.wang.seckill.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.vo.LoginVo;
import com.wang.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangmengcheng
 * @since 2021-11-03
 */
public interface IUserService extends IService<User> {
    /**
     * 登录
     * @param loginVo
     * @param request
     * @param response
     * @return
     */
    RespBean login(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * 根据cookie获取用户
     * @param userTicket
     * @return
     */
    User getUserByCookie(String userTicket,HttpServletRequest request,HttpServletResponse response);
}
