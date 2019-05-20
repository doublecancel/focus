-- CREATE schema focus_uc  default character set utf8 collate utf8_general_ci;;
USE focus_dict;
CREATE TABLE `dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` bigint(20) NOT NULL COMMENT 'key',
  `value` varchar(255) DEFAULT NULL COMMENT 'value',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT NULL COMMENT '0无效1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';


