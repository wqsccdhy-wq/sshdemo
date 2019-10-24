CREATE TABLE behavior_unit_system (
  ID bigint(20) NOT NULL,
  NAME varchar(100) DEFAULT NULL,
  CON_VALUE smallint(4) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE behavior_statistics_unit_govdoc (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  NAME varchar(500) DEFAULT NULL,
  UNIT_ID bigint(20) DEFAULT NULL,
  CREATE_TIME datetime DEFAULT NULL,
  NUM bigint(20) DEFAULT NULL,
  YEAR smallint(6) DEFAULT NULL,
  MONTH smallint(4) DEFAULT NULL,
  DAY smallint(4) DEFAULT NULL,
  CON_VALUE smallint(4) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY BEHAVIOR_STAT_INDEX (YEAR,MONTH,CON_VALUE),
  KEY BEHAVIOR_STAT_UNIT_INDEX (UNIT_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE client_info (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  client_id varchar(255) DEFAULT NULL,
  client_secret varchar(255) DEFAULT NULL,
  client_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE user_info (
  user_id int(11) NOT NULL,
  user_name varchar(255) NOT NULL,
  user_password varchar(255) NOT NULL,
  user_describe varchar(255) DEFAULT NULL COMMENT '描述',
  create_time datetime DEFAULT NULL,
  update_time datetime DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;