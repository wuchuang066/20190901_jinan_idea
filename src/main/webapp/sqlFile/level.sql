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

 Date: 02/01/2020 08:09:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for level
-- ----------------------------
DROP TABLE IF EXISTS `level`;
CREATE TABLE `level`  (
  `level_id` int(4) NOT NULL AUTO_INCREMENT,
  `level_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_id` int(4) NULL DEFAULT NULL,
  `level_note` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`level_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of level
-- ----------------------------
INSERT INTO `level` VALUES (1, '小白鞋', 1, NULL);
INSERT INTO `level` VALUES (2, '豆豆鞋', 1, NULL);
INSERT INTO `level` VALUES (3, '帆船鞋', 2, NULL);
INSERT INTO `level` VALUES (4, '布鞋', 2, NULL);
INSERT INTO `level` VALUES (5, '瑞士名表', 3, NULL);
INSERT INTO `level` VALUES (6, '机械表', 3, NULL);
INSERT INTO `level` VALUES (7, '墨镜', 4, NULL);
INSERT INTO `level` VALUES (8, '老花镜', 4, NULL);
INSERT INTO `level` VALUES (9, '热门手机', 5, NULL);
INSERT INTO `level` VALUES (10, '特色手机', 5, NULL);
INSERT INTO `level` VALUES (11, '智能机器人', 6, NULL);
INSERT INTO `level` VALUES (12, 'VR眼镜', 6, NULL);
INSERT INTO `level` VALUES (13, '西湖龙井', 7, NULL);
INSERT INTO `level` VALUES (14, '大红袍', 7, NULL);
INSERT INTO `level` VALUES (15, '坚果', 8, NULL);
INSERT INTO `level` VALUES (16, '巧克力', 8, NULL);
INSERT INTO `level` VALUES (17, '轿车', 9, NULL);
INSERT INTO `level` VALUES (18, 'SUV', 9, NULL);
INSERT INTO `level` VALUES (19, '国学经典', 10, NULL);
INSERT INTO `level` VALUES (20, '考研', 10, NULL);
INSERT INTO `level` VALUES (21, '浪漫裙装', 11, NULL);
INSERT INTO `level` VALUES (22, '优雅旗袍', 11, NULL);
INSERT INTO `level` VALUES (23, '当季新品', 12, NULL);
INSERT INTO `level` VALUES (24, '西服套装', 12, NULL);

SET FOREIGN_KEY_CHECKS = 1;
