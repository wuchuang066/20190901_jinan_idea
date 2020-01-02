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

 Date: 02/01/2020 08:09:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(4) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_sex` int(1) NULL DEFAULT NULL,
  `user_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_phone` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_address` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_image` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_date` datetime(0) NULL DEFAULT NULL,
  `user_state` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'user01', '1', 0, 'user01@qq.com', '1330000001', '北京市海淀区中关村软件园266栋楼', 'images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (2, 'user2', '2', 1, 'user2@qq.com', '133000002', '北京市海淀区中关村软件园2栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (3, 'user3', '3', 0, 'user3@qq.com', '133000003', '北京市海淀区中关村软件园3栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (4, 'user4', '4', 1, 'user4@qq.com', '133000004', '北京市海淀区中关村软件园4栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (5, 'user5', '5', 0, 'user5@qq.com', '133000005', '北京市海淀区中关村软件园5栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (6, 'user6', '6', 0, 'user6@qq.com', '133000006', '北京市海淀区中关村软件园6栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (7, 'user7', '7', 0, 'user7@qq.com', '133000007', '北京市海淀区中关村软件园7栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (8, 'user8', '8', 1, 'user8@qq.com', '133000008', '北京市海淀区中关村软件园8栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (9, 'user9', '9', 0, 'user9@qq.com', '133000009', '北京市海淀区中关村软件园9栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (10, 'user10', '10', 0, 'user10@qq.com', '1330000010', '北京市海淀区中关村软件园10栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (11, 'user11', '11', 0, 'user11@qq.com', '1330000011', '北京市海淀区中关村软件园11栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (12, 'user12', '12', 1, 'user12@qq.com', '1330000012', '北京市海淀区中关村软件园12栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (13, 'user13', '13', 0, 'user13@qq.com', '1330000013', '北京市海淀区中关村软件园13栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (14, 'user14', '14', 0, 'user14@qq.com', '1330000014', '北京市海淀区中关村软件园14栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (15, 'user15', '15', 0, 'user15@qq.com', '1330000015', '北京市海淀区中关村软件园15栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (16, 'user16', '16', 1, 'user16@qq.com', '1330000016', '北京市海淀区中关村软件园16栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (17, 'user17', '17', 0, 'user17@qq.com', '1330000017', '北京市海淀区中关村软件园17栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (18, 'user18', '18', 0, 'user18@qq.com', '1330000018', '北京市海淀区中关村软件园18栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (19, 'user19', '19', 1, 'user19@qq.com', '1330000019', '北京市海淀区中关村软件园19栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (20, 'user20', '20', 0, 'user20@qq.com', '1330000020', '北京市海淀区中关村软件园20栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 1);
INSERT INTO `users` VALUES (21, 'user21', '21', 0, 'user21@qq.com', '1330000021', '北京市海淀区中关村软件园21栋楼', 'upload-images/admin-images/user.jpg', '2019-11-26 10:29:41', 2);
INSERT INTO `users` VALUES (22, 'userName23', 'password92', NULL, NULL, NULL, NULL, NULL, '2019-12-12 09:54:31', NULL);

SET FOREIGN_KEY_CHECKS = 1;
