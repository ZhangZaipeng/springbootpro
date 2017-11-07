CREATE TABLE `tb_staff_agent` (
	`staff_agent_id` BIGINT(11) NOT NULL AUTO_INCREMENT COMMENT '自增长主键',
	`real_name` varchar(50) DEFAULT NULL COMMENT '员工真实姓名',
	`login_pwd` varchar(50) DEFAULT NULL COMMENT '登录密码',
	`role_id` int(11) NOT NULL COMMENT '员工隶属角色',

  `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`staff_agent_id`)
)
ENGINE=InnoDB 
AUTO_INCREMENT=1311 
DEFAULT CHARSET=utf8 
COLLATE='utf8_unicode_ci'
COMMENT='员工表'
;