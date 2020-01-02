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

 Date: 02/01/2020 08:09:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for receiver
-- ----------------------------
DROP TABLE IF EXISTS `receiver`;
CREATE TABLE `receiver`  (
  `receiver_id` int(4) NOT NULL AUTO_INCREMENT,
  `receiver_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_serial` int(4) NULL DEFAULT NULL,
  `receiver_note` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`receiver_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of receiver
-- ----------------------------
INSERT INTO `receiver` VALUES (1, '女鞋', 1, NULL);
INSERT INTO `receiver` VALUES (2, '男鞋', 1, NULL);
INSERT INTO `receiver` VALUES (3, '腕表', 2, NULL);
INSERT INTO `receiver` VALUES (4, '眼镜', 2, NULL);
INSERT INTO `receiver` VALUES (5, '手机', 3, NULL);
INSERT INTO `receiver` VALUES (6, '数码', 3, NULL);
INSERT INTO `receiver` VALUES (7, '茶叶', 4, NULL);
INSERT INTO `receiver` VALUES (8, '零食', 4, NULL);
INSERT INTO `receiver` VALUES (9, '汽车', 5, NULL);
INSERT INTO `receiver` VALUES (10, '图书', 5, NULL);
INSERT INTO `receiver` VALUES (11, '女装', 6, NULL);
INSERT INTO `receiver` VALUES (12, '男装', 6, NULL);

SET FOREIGN_KEY_CHECKS = 1;
