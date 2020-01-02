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

 Date: 02/01/2020 08:08:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins`  (
  `admin_id` int(4) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_phone` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_image` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_power` int(1) NULL DEFAULT NULL,
  `admin_state` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES (1, 'admin', '133012313', 'asiodfyioasydfoi@qq.com', '11', 'upload-images/admin-images/admin.jpg', 1, 1);
INSERT INTO `admins` VALUES (2, 'tom', '13300000001', '234234@qq.com', '2', 'upload-images/admin-images/admin.jpg', 1, 2);
INSERT INTO `admins` VALUES (3, 'admin3', '1330000003', 'nishidashagua3@qq.com', '3', 'upload-images/admin-images/admin.jpg', 1, 1);
INSERT INTO `admins` VALUES (4, 'admin4', '1330000004', 'nishidashagua4@qq.com', '4', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (5, 'admin5', '1330000005', 'nishidashagua5@qq.com', '5', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (6, 'admin6', '1330000006', 'nishidashagua6@qq.com', '6', 'upload-images/admin-images/admin.jpg', 2, 2);
INSERT INTO `admins` VALUES (7, 'admin7', '1330000008', 'nishidashagua7@qq.com', '7', 'upload-images/admin-images/admin.jpg', 2, 2);
INSERT INTO `admins` VALUES (8, 'admin8', '1330000008', 'nishidashagua8@qq.com', '8', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (9, 'admin9', '1330000009', 'nishidashagua9@qq.com', '9', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (10, 'admin10', '13300000010', 'nishidashagua10@qq.com', '10', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (11, 'admin11', '13300000011', 'nishidashagua11@qq.com', '11', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (12, 'admin12', '13300000012', 'nishidashagua12@qq.com', '12', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (13, 'admin13', '13300000013', 'nishidashagua13@qq.com', '13', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (14, 'admin14', '13300000014', 'nishidashagua14@qq.com', '14', 'upload-images/admin-images/admin.jpg', 2, 1);
INSERT INTO `admins` VALUES (15, 'ceshi', '12', '1@qq.com', '1', 'upload-images/admin-images/1574665772829.jpg', 2, 1);
INSERT INTO `admins` VALUES (16, '33333', '3333', '3333@qq.com', '22', 'upload-images/admin-images/1574674956888.jpg', 2, 2);
INSERT INTO `admins` VALUES (17, '222', '222', '222@qq.com', '222', 'upload-images/admin-images/1574691553001.jpg', 2, 1);
INSERT INTO `admins` VALUES (18, '测试管理员', '121', '121@qq.com', '1', 'upload-images/admin-images/admin.jpg', 2, 1);

SET FOREIGN_KEY_CHECKS = 1;
