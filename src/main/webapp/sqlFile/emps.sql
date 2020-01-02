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

 Date: 02/01/2020 08:08:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emps
-- ----------------------------
DROP TABLE IF EXISTS `emps`;
CREATE TABLE `emps`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `emp_salary` decimal(10, 2) NULL DEFAULT NULL,
  `emp_dept` int(255) NOT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emps
-- ----------------------------
INSERT INTO `emps` VALUES (1, 'aa', 5000.00, 1);
INSERT INTO `emps` VALUES (2, 'aa', 6000.00, 1);
INSERT INTO `emps` VALUES (3, 'xiaowang', 7999.00, 2);
INSERT INTO `emps` VALUES (4, 'xiaoli', 8000.00, 2);
INSERT INTO `emps` VALUES (5, 'xiaozhao', 100000.00, 3);
INSERT INTO `emps` VALUES (6, 'xiaowu', 123.00, 3);
INSERT INTO `emps` VALUES (7, 'xiao1', 500.00, 2);
INSERT INTO `emps` VALUES (8, 'xiao2', 1000.00, 2);
INSERT INTO `emps` VALUES (9, 'xiao3', 1500.00, 2);
INSERT INTO `emps` VALUES (11, 'insert', 5000.00, 3);
INSERT INTO `emps` VALUES (12, 'insert', 5000.00, 3);
INSERT INTO `emps` VALUES (13, 'insert', 5000.00, 3);
INSERT INTO `emps` VALUES (14, 'insert', 5000.00, 3);
INSERT INTO `emps` VALUES (15, 'insert', 5000.00, 3);
INSERT INTO `emps` VALUES (16, 'xiao1', 500.00, 2);
INSERT INTO `emps` VALUES (17, 'xiao2', 1000.00, 2);
INSERT INTO `emps` VALUES (18, 'xiao3', 1500.00, 2);

SET FOREIGN_KEY_CHECKS = 1;
