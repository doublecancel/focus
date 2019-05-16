-- CREATE schema focus_uc  default character set utf8 collate utf8_general_ci;;
USE focus_uc;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_account_id` bigint(20) NOT NULL COMMENT '账户表id',
  `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `modify_password` int(10) DEFAULT NULL COMMENT '是否修改密码0否1是',
  `last_login_date` datetime DEFAULT NULL COMMENT '上次登录时间',
  `last_login_ip` varchar(255) DEFAULT NULL COMMENT '上次登录IP',
  `status` varchar(255) DEFAULT NULL COMMENT '状态1有效0失效',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间，注册时间',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_account_id` (`user_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

INSERT INTO `focus_uc`.`user_info`(`id`, `user_account_id`, `login_name`, `nick_name`, `real_name`, `modify_password`, `last_login_date`, `last_login_ip`, `status`, `create_date`, `update_date`) VALUES (1, 1, 'liuxl', 'liuxl', 'liuxianglei', 0, '2019-01-01 12:12:12', '192.168.0.100', '1', '2019-05-15 22:24:41', NULL);

