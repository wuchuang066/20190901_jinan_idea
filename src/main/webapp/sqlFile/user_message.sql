/*
 Navicat Premium Data Transfer

 Source Server         : server
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : zpark

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 02/01/2020 08:09:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_message
-- ----------------------------
DROP TABLE IF EXISTS `user_message`;
CREATE TABLE `user_message`  (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_pwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_sex` int(1) NULL DEFAULT NULL COMMENT '0 表示 男 1  表示 女',
  `login_date` datetime(0) NULL DEFAULT NULL COMMENT '登录时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_message
-- ----------------------------
INSERT INTO `user_message` VALUES (1, '1', '1', 0, '2019-11-07 16:21:21');
INSERT INTO `user_message` VALUES (15, 'abc', '11', 0, NULL);
INSERT INTO `user_message` VALUES (16, 'a', '11', 1, NULL);
INSERT INTO `user_message` VALUES (17, '222', '222', 0, NULL);
INSERT INTO `user_message` VALUES (19, '士大夫', '1', 0, NULL);
INSERT INTO `user_message` VALUES (20, '士大夫', '1', 1, NULL);
INSERT INTO `user_message` VALUES (21, '士大夫', '1', 0, NULL);
INSERT INTO `user_message` VALUES (22, 'username', '1', 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
