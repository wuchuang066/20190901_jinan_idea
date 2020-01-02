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

 Date: 02/01/2020 08:09:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` int(4) NOT NULL AUTO_INCREMENT,
  `user_id` int(4) NULL DEFAULT NULL,
  `consignee_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `consignee_address` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_phone` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_date` datetime(0) NULL DEFAULT NULL,
  `order_state` int(1) NULL DEFAULT NULL,
  `order_note` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 179 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (2, 2, 'user2', '北京市北京区北京县背景镇北京村2号', '1381008602', '2019-03-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (3, 3, 'user3', '北京市北京区北京县背景镇北京村3号', '1381008603', '2019-04-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (4, 4, 'user4', '北京市北京区北京县背景镇北京村4号', '1381008604', '2019-05-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (5, 5, 'user5', '北京市北京区北京县背景镇北京村5号', '1381008605', '2019-06-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (6, 6, 'user6', '北京市北京区北京县背景镇北京村6号', '1381008606', '2019-07-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (7, 7, 'user7', '北京市北京区北京县背景镇北京村7号', '1381008607', '2019-08-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (8, 8, 'user8', '北京市北京区北京县背景镇北京村8号', '1381008608', '2019-09-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (9, 9, 'user9', '北京市北京区北京县背景镇北京村9号', '1381008609', '2019-10-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (10, 10, 'user10', '北京市北京区北京县背景镇北京村10号', '13810086010', '2019-11-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (11, 11, 'user11', '北京市北京区北京县背景镇北京村11号', '13810086011', '2019-01-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (12, 12, 'user12', '北京市北京区北京县背景镇北京村12号', '13810086012', '2019-02-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (13, 13, 'user13', '北京市北京区北京县背景镇北京村13号', '13810086013', '2019-03-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (14, 14, 'user14', '北京市北京区北京县背景镇北京村14号', '13810086014', '2019-04-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (15, 15, 'user15', '北京市北京区北京县背景镇北京村15号', '13810086015', '2019-05-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (16, 16, 'user16', '北京市北京区北京县背景镇北京村16号', '13810086016', '2019-06-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (17, 17, 'user17', '北京市北京区北京县背景镇北京村17号', '13810086017', '2019-07-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (18, 18, 'user18', '北京市北京区北京县背景镇北京村18号', '13810086018', '2019-08-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (19, 19, 'user19', '北京市北京区北京县背景镇北京村19号', '13810086019', '2019-09-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (20, 20, 'user20', '北京市北京区北京县背景镇北京村20号', '13810086020', '2019-10-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (21, 21, 'user21', '北京市北京区北京县背景镇北京村21号', '13810086021', '2019-11-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (22, 22, 'user22', '北京市北京区北京县背景镇北京村22号', '13810086022', '2019-01-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (23, 23, 'user23', '北京市北京区北京县背景镇北京村23号', '13810086023', '2019-02-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (24, 24, 'user24', '北京市北京区北京县背景镇北京村24号', '13810086024', '2019-03-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (25, 25, 'user25', '北京市北京区北京县背景镇北京村25号', '13810086025', '2019-04-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (26, 26, 'user26', '北京市北京区北京县背景镇北京村26号', '13810086026', '2019-05-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (27, 27, 'user27', '北京市北京区北京县背景镇北京村27号', '13810086027', '2019-06-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (28, 28, 'user28', '北京市北京区北京县背景镇北京村28号', '13810086028', '2019-07-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (29, 29, 'user29', '北京市北京区北京县背景镇北京村29号', '13810086029', '2019-08-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (30, 30, 'user30', '北京市北京区北京县背景镇北京村30号', '13810086030', '2019-09-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (31, 31, 'user31', '北京市北京区北京县背景镇北京村31号', '13810086031', '2019-10-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (32, 32, 'user32', '北京市北京区北京县背景镇北京村32号', '13810086032', '2019-11-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (33, 33, 'user33', '北京市北京区北京县背景镇北京村33号', '13810086033', '2019-01-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (34, 34, 'user34', '北京市北京区北京县背景镇北京村34号', '13810086034', '2019-02-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (35, 35, 'user35', '北京市北京区北京县背景镇北京村35号', '13810086035', '2019-03-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (36, 36, 'user36', '北京市北京区北京县背景镇北京村36号', '13810086036', '2019-04-01 00:00:00', 1, NULL);
INSERT INTO `orders` VALUES (37, 37, 'user37', '北京市北京区北京县背景镇北京村37号', '13810086037', '2019-05-01 00:00:00', 2, NULL);
INSERT INTO `orders` VALUES (38, 38, 'user38', '北京市北京区北京县背景镇北京村38号', '13810086038', '2019-06-01 00:00:00', 3, NULL);
INSERT INTO `orders` VALUES (39, 39, 'user39', '北京市北京区北京县背景镇北京村39号', '13810086039', '2019-07-01 00:00:00', 4, NULL);
INSERT INTO `orders` VALUES (40, 40, 'user40', '北京市北京区北京县背景镇北京村40号', '13810086040', '2019-08-01 00:00:00', 5, NULL);
INSERT INTO `orders` VALUES (41, 41, 'user41', '北京市北京区北京县背景镇北京村41号', '13810086041', '2019-09-01 00:00:00', 6, NULL);
INSERT INTO `orders` VALUES (177, 1, 'tom', '北京市北京村桥洞下', '13899999999', '2019-12-31 10:42:45', 2, '');
INSERT INTO `orders` VALUES (178, 1, 'tom', '北京市北京村桥洞下', '13899999999', '2019-12-31 10:43:55', 2, '');

SET FOREIGN_KEY_CHECKS = 1;
