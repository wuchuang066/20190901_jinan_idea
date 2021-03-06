package com.zpark.utils;

import com.alibaba.fastjson.JSONObject;
import com.zpark.entity.Goods;
import com.zpark.entity.OrderDetail;
import com.zpark.entity.Orders;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author wuc
 * @date 2019/11/21 11:08
 */
public class Test {
    /**
     * 功能描述 拉灯问题
     * 此问题可以从另一个角度考虑：  房间号是从1~100的 人的编号也是从1~100 的，刚开始房间灯是灭的，
     * 但是只要进入房间的人是奇数个 ，房间最后灯就是亮着的，也就是直接求取的是1~100之中每一个数有多少个约数 例如 6约数有1 2 3 6 有四个约数
     * 编号为1 的人进入6房间，房间灯亮，编号为2 的人进入6房间，房间灯灭，编号为3 的人进入6房间，房间灯亮 ，编号为6 的人进入6房间，房间灯灭，
     * 其余人进不去这个房间，最终这个房间灯是灭的 ，可见这个房间也就是6的约数有4（偶数个）就是灭的
     * 再比如9号房间 约数有1 3 9
     * 编号为1 的人进入9房间，房间灯亮，编号为3 的人进入9房间，房间灯灭，编号为9 的人进入9房间，房间灯亮
     * 9有3个约数 奇数个 最终灯是亮的
     *
     *
     * @author wuc
     * @date 2019/11/30 10:55
     * @param args
     * @return void
     */

    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {// 循环从1 开始 到100 看1~100的每一个数有几个约数
//            int yueshu = yueshu(i); // 调用求取约数的函数 返回这个数有几个约数
//            if(yueshu%2 != 0){ //对这个约数的个数进行对2取余数，如果是奇数个，对2取余数不是0  灯就是亮的 否则灯最终就是灭的
//                System.out.println("亮着的房间是："+i+"，有"+yueshu+"个约数！");
//            }
//        }
//        String arrayString = "[399,389]";
//        String[] split = arrayString.split(",");
//        System.out.println(split);
        Orders orders = new Orders();
        orders.setOrderId(0);
        orders.setUserId(0);
        orders.setConsigneeName("");
        orders.setConsigneeAddress("");
        orders.setOrderPhone("");
        orders.setOrderDate(new Date());
        orders.setOrderState(0);
        orders.setOrderNote("");
        orders.setGroupDate("");
        orders.setGroupPrice(0.0D);
        ArrayList<OrderDetail> orderDetails1 = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setGoods(new Goods());
        orderDetail.setOrderDetailId(0);
        orderDetail.setOrderId(0);
        orderDetail.setGoodsId(0);
        orderDetail.setGoodsName("");
        orderDetail.setDealPrice(0.0D);
        orderDetail.setDealNumber(0);
        orderDetails1.add(orderDetail);
        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setGoods(new Goods());
        orderDetail2.setOrderDetailId(0);
        orderDetail2.setOrderId(0);
        orderDetail2.setGoodsId(0);
        orderDetail2.setGoodsName("");
        orderDetail2.setDealPrice(0.0D);
        orderDetail2.setDealNumber(0);
        orderDetails1.add(orderDetail2);

        orders.setOrderDetailList(orderDetails1);
        String s = JSONObject.toJSONString(orders);
        System.out.println(s);

    }
    static int yueshu(int a) { // 声明一个函数 就和咱们C语言中刚学的声明一个函数是一样的  当然 static 目前你不需要了解是什么意思
        // 只需要知道static 这么写 可以直接调用这个函数就可以了
        int num = 0; // 用来保存记录有几个约数
        for (int i = 1; i <= Math.sqrt(a); i++) { //从1 开始，到这个数的 开平方数结束  看这个数有几个约数 为什么是开平方数  因为开平方后面的数再算一遍就重复了
            // 比如 计算6 的约数 开平方是2  就算一下 1和2 就好了 因为1*6 = 6 2*3 = 6 检测到1 约数就加两个 就是1和6 都算了
            // 检测到2 约数再加两个2*3   如果再算3和6 就重复了
            if (a % i == 0) {  //如果可以除开i 那么就是有约数
                if (i != Math.sqrt(a))  // 如果不是当前数的平方 例如 24 如果除2 能除开 并且这个2还不是24开平方的数 那么就有两个约数2和12 num 就+2
                    num = num + 2;
                else                   // 否则就加1，例如25 当检测到5 的时候 虽然有约数 但是5*5 =25  约数只能算一个5 不能算两个5 所以这个时候要加1
                    num = num + 1;
            }
        }
        return num; // 计算完返回当前的约数个数
    }
    /**
     * 程序可以直接运行 点击右键 run 就ok 下面是运行结果：
     * 亮着的房间是：1，有1个约数！
     * 亮着的房间是：4，有3个约数！
     * 亮着的房间是：9，有3个约数！
     * 亮着的房间是：16，有5个约数！
     * 亮着的房间是：25，有3个约数！
     * 亮着的房间是：36，有9个约数！
     * 亮着的房间是：49，有3个约数！
     * 亮着的房间是：64，有7个约数！
     * 亮着的房间是：81，有5个约数！
     *亮着的房间是：100，有9个约数！
     *
     *
     * 其实运行完程序你会发现  最终是求哪些数的平方小于100 因为一个数有奇数个约数的情况就是它本身包含着 平方数 也就是说 例如25 有一个是5*5=25
     * 但是5这个约数只能算一次。所以它有奇数个约数，其他数的约数要么是1*它本身 还是偶数个  要不就是成对出现的 例如 2*12 4*6 都是成对出现的
     * 只有1*1 2*2 3*3 4*4 5*5 6*6 7*7 8*8 9*9 10*10 这样才可能出现奇数个约数 如果这个说的不懂 就先理解上面的就可以了
     * @author wuc
     * @date 2019/11/30 11:18
     * @param null
     * @return
     */
}


