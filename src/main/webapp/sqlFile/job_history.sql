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

 Date: 02/01/2020 08:09:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for job_history
-- ----------------------------
DROP TABLE IF EXISTS `job_history`;
CREATE TABLE `job_history`  (
  `employee_id` int(6) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `job_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `department_id` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of job_history
-- ----------------------------
INSERT INTO `job_history` VALUES (101, '1989-09-21', '1993-10-27', 'AC_ACCOUNT', 110);
INSERT INTO `job_history` VALUES (102, '1993-01-13', '1998-07-24', 'IT_PROG', 60);

SET FOREIGN_KEY_CHECKS = 1;
