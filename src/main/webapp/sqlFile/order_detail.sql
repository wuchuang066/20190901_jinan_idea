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

 Date: 02/01/2020 08:09:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `order_detail_id` int(4) NOT NULL AUTO_INCREMENT,
  `order_id` int(4) NULL DEFAULT NULL,
  `goods_id` int(4) NULL DEFAULT NULL,
  `goods_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deal_price` double(10, 2) NULL DEFAULT NULL,
  `deal_number` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`order_detail_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 215 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES (1, 2, 23, '爱奇艺VR眼镜vr一体机3d眼镜体感游戏机虚拟现实真4K电影ar设备', 2999.00, 1);
INSERT INTO `order_detail` VALUES (2, 3, 23, '爱奇艺VR眼镜vr一体机3d眼镜体感游戏机虚拟现实真4K电影ar设备', 2999.00, 1);
INSERT INTO `order_detail` VALUES (3, 4, 359, '小白鞋女春季2019新款韩版百搭夏季学生平底系带厚底休闲透气白鞋', 388.00, 1);
INSERT INTO `order_detail` VALUES (4, 5, 360, '卓诗尼小白鞋女2019夏季新款韩版透气板鞋系带休闲学生鞋小白鞋女', 189.00, 1);
INSERT INTO `order_detail` VALUES (5, 6, 361, '【商场同款】天美意马衔扣乐福鞋女浅口单鞋豆豆鞋2019春AT491AM9', 899.00, 1);
INSERT INTO `order_detail` VALUES (6, 7, 362, '意尔康女鞋旗舰店2019春季新款真皮豆豆鞋护士鞋软底孕妇平底单鞋', 309.00, 1);
INSERT INTO `order_detail` VALUES (7, 8, 363, 'SPERRY/斯佩里男鞋透气舒适系带低帮皮鞋；商务休闲牛皮帆船鞋', 449.00, 1);
INSERT INTO `order_detail` VALUES (8, 9, 364, '特卖骆驼男鞋 春季牛皮日常休闲男鞋帆船鞋真皮品质', 99.00, 1);
INSERT INTO `order_detail` VALUES (9, 10, 365, '回力帆布鞋男鞋夏季透气一脚蹬板鞋子老北京布鞋男士休闲懒人百搭', 198.00, 1);
INSERT INTO `order_detail` VALUES (10, 11, 366, '匡威1970s 高帮帆布鞋三星标经典款男鞋低帮女鞋复古板鞋162050C经典复刻 三星标 现货秒发 !', 709.00, 1);
INSERT INTO `order_detail` VALUES (11, 12, 367, '卡地亚cartier蓝气球系列18K玫瑰金 镶钻机械女表WE9005Z3', 369000.00, 1);
INSERT INTO `order_detail` VALUES (12, 13, 368, '瑞士正品tangin天珺女款机械表天骏品牌女式红色皮带名牌女士手表', 5660.00, 1);
INSERT INTO `order_detail` VALUES (13, 14, 369, '瑞士正品天梭男表杜鲁尔手表80机芯机械表表带钢带经典款商务手表', 3360.00, 1);
INSERT INTO `order_detail` VALUES (14, 15, 370, '艾戈勒（agelocer）博世系列瑞士进口手表男镂空雕花全自动机械表 80小时长动能潮男腕表 ', 4280.00, 1);
INSERT INTO `order_detail` VALUES (15, 16, 371, 'RayBan 雷朋墨镜', 1780.00, 1);
INSERT INTO `order_detail` VALUES (16, 17, 372, 'FILA墨镜女2019新款眼镜男金晨明星同款太阳镜防紫外线韩版潮ins', 1299.00, 1);
INSERT INTO `order_detail` VALUES (17, 18, 373, '夕阳红老花镜男女时尚超轻折叠便携式防蓝光高清老光老花老人眼镜', 88.00, 1);
INSERT INTO `order_detail` VALUES (18, 19, 374, '【旗舰新品 稀缺货源】Huawei/华为 P30全面屏超感光徕卡三摄变焦双景录像980芯片智能手机p30', 4288.00, 1);
INSERT INTO `order_detail` VALUES (19, 21, 375, '【旗舰新品 稀缺货源】Huawei/华为 P30全面屏超感光徕卡三摄变焦双景录像980芯片智能手机p30', 4999.00, 1);
INSERT INTO `order_detail` VALUES (20, 20, 376, '送膜中兴V5S ZTE/中兴 n918st 四核5.0英寸移动联通双4G智能手机', 310.00, 1);
INSERT INTO `order_detail` VALUES (21, 22, 377, '【新品上市】科大讯飞阿尔法蛋智能机器人s蛋小蛋超能蛋早教学习语音对话儿童玩具高科技家庭教育英语ai互动', 899.00, 1);
INSERT INTO `order_detail` VALUES (22, 23, 378, 'HTC VIVE 3DVR眼镜游戏头盔 vr体感游戏机htc vr【新装减重版】', 4888.00, 1);
INSERT INTO `order_detail` VALUES (23, 2, 379, '2019新茶上市西湖牌西湖龙井茶叶茶明前特级精选250g绿茶春茶散装', 388.00, 1);
INSERT INTO `order_detail` VALUES (24, 2, 380, '【香槟金罐系列】品山闽武夷山大红袍茶叶肉桂浓香乌龙茶500g', 2200.00, 1);
INSERT INTO `order_detail` VALUES (25, 2, 381, '武夷山正岩茶大红袍小果香肉桂罐装乌龙茶叶特级商务差旅礼盒装', 1425.00, 1);
INSERT INTO `order_detail` VALUES (26, 2, 382, '每日坚果', 148.00, 1);
INSERT INTO `order_detail` VALUES (27, 2, 383, '沃隆每日坚果混合装30包孕妇坚果零食小吃大礼包休闲食品小包装', 289.00, 1);
INSERT INTO `order_detail` VALUES (28, 2, 384, '费列罗榛果威化巧克力48粒婚庆礼盒装结婚喜糖批发亲子节', 129.00, 1);
INSERT INTO `order_detail` VALUES (29, 2, 385, 'amovo魔吻黑巧克力礼盒装送女友 手工生日情人节520礼物送男友 情人节高端巧克力礼盒礼物 送女友 送男友', 169.90, 1);
INSERT INTO `order_detail` VALUES (30, 2, 386, '【特价车】大迈X5、X7具体价格请私聊客服(4万-9万之间)全国可飞', 2000.00, 1);
INSERT INTO `order_detail` VALUES (31, 2, 387, '宝马5系2014款2.0T自动520Li典雅型', 274000.00, 1);
INSERT INTO `order_detail` VALUES (32, 2, 388, '路虎揽胜 整车订金 天猫尊享2000元加油卡 2000元加油卡（限量）', 1000.00, 1);
INSERT INTO `order_detail` VALUES (33, 2, 389, '三希堂藏书全唐诗12函120册手工线装宣纸书籍康熙初刻本原版影印本国学经典繁体竖排收藏文化礼品', 26800.00, 1);
INSERT INTO `order_detail` VALUES (34, 2, 390, '20册儿童启蒙国学经典书籍全套装小学正版注音版笠翁对韵唐诗三百首幼儿早教三字经千字文弟子规中华成语故事一二三年级课外书必读', 200.00, 1);
INSERT INTO `order_detail` VALUES (35, 2, 391, '新东方考研网络课程2020英语政治数学一二三进阶视频课件考研网课', 1490.00, 1);
INSERT INTO `order_detail` VALUES (36, 2, 392, '沪江网校 研途2020考研徐涛政治网课 全程班课程视频资料网络课程', 1330.00, 1);
INSERT INTO `order_detail` VALUES (37, 2, 393, '烟花烫裙子女2019新款清新网纱绣花蕾丝时尚两件套连衣裙 瑶草', 596.00, 1);
INSERT INTO `order_detail` VALUES (38, 2, 394, '旗袍年轻款少女真丝夏季2019新款女改良短款清新淡雅复古文艺', 538.00, 1);
INSERT INTO `order_detail` VALUES (39, 2, 395, '大小姐棉麻中长款2019新款改良时尚修身显瘦日常短袖旗袍连衣裙', 188.00, 1);
INSERT INTO `order_detail` VALUES (40, 2, 396, 'GXG男装 2019夏季新款商场同款男士纯棉潮流黑色圆领短袖T恤男', 439.00, 1);
INSERT INTO `order_detail` VALUES (41, 2, 397, '迪柯尼', 3480.00, 1);
INSERT INTO `order_detail` VALUES (42, 2, 398, '品牌：巴泽华  巴泽华 领型:平驳领型号: BZA7019/20系列门]襟/纽扣: 单排两粒扣开衩方式:后双开衩', 499.00, 1);
INSERT INTO `order_detail` VALUES (213, 177, 361, '【商场同款】天美意马衔扣乐福鞋女浅口单鞋豆豆鞋2019春AT491AM9', 899.00, 2);
INSERT INTO `order_detail` VALUES (214, 178, 361, '【商场同款】天美意马衔扣乐福鞋女浅口单鞋豆豆鞋2019春AT491AM9', 899.00, 2);

SET FOREIGN_KEY_CHECKS = 1;
